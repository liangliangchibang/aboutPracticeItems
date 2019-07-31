package com.seawaterbt.ssm.service.impl;

import com.seawaterbt.ssm.entity.MultiExam;
import com.seawaterbt.ssm.entity.SingleExam;
import com.seawaterbt.ssm.entity.TbSchoolExam;
import com.seawaterbt.ssm.service.*;
import com.seawaterbt.ssm.util.RandomGUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class MainServiceImpl implements MainService {
    @Autowired
    private MultiExamService multiExamService;
    @Autowired
    private SingleExamService singleExamService;
    @Autowired
    private TbSchoolExamService tbSchoolExamService;
    @Autowired
    private TbSchoolScoreSubjectService tbSchoolScoreSubjectService;

    @Override
    public boolean insertExam(HttpServletRequest re) {
        String meId = re.getParameter("meId");
        String creatorGid = re.getParameter("creatorGid");
        List<MultiExam> multiExams = multiExamService.getMultiExam(meId);
        //考试主gid
        String gid = RandomGUIDUtil.getUUID();
        if (multiExams != null && multiExams.size() > 0) {
            //得到这场考试信息--mysql
            MultiExam multiExam = multiExams.get(0);
            // //第一步 往tb_school_exam 插入数据
            boolean b1 = insertTbExam(multiExam, creatorGid, gid);
            if (!b1) {
                return false;
            }
            //第二步 往 tb_school_score_subject 插入数据
            boolean b2 = insertTbExamSubject(meId, gid);
            if (!b2) {
                return false;
            }
        }
        //第三步 添加
        return true;
    }

    //
    boolean insertTbExam(MultiExam multiExam, String creatorGid, String gid) {
        //将考试信息插入到智教云考试表中
        String type = "7";//全部都算作模拟考试
        //考试year全部算作上学年
        String schoolYear = multiExam.getEnterYear().toString() + "01";

        java.sql.Timestamp MexamDate = multiExam.getMeDate();
        //将日期转换为yyyy-MM-dd格式
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String examDate = df.format(MexamDate);

        String examName = multiExam.getMeName();

        //第一步 往tb_school_exam 插入数据
        return tbSchoolExamService.insertTbExam(gid, type, schoolYear, examDate, examName, creatorGid);
    }

    boolean insertTbExamSubject(String meId, String examGid) {
        //得到mysql中成绩的学科关系表
        List<SingleExam> singleexams = singleExamService.getSingleExam(meId);
        for (int i = 0; i < singleexams.size(); i++) {
            SingleExam singleExam = singleexams.get(i);
            String subjectName = singleExam.getSeCourseName();
            String subjectGid = "";
            if (subjectName.equals("语文")) {// 语文
                subjectGid = "47af3bf9e73cc5c815b104b921c19236";
            } else if (subjectName.equals("数学")) {// 数学
                subjectGid = "f41cf96b069ca77102c13f22d375de92";
            } else if (subjectName.equals("英语")) {// 英语
                subjectGid = "7b576525754d4c36445fbb3f000905fd";
            } else if (subjectName.equals("政治")) {// 政治
                subjectGid = "4967d1508d83cff13afbe5a207bccb0f";
            } else if (subjectName.equals("历史")) {// 历史
                subjectGid = "40a7cf268822dedd98ac3f52cd8d3c88";
            } else if (subjectName.equals("地理")) {// 地理
                subjectGid = "3f5d5062f5f6e341db98ac9b4eb4389b";
            } else if (subjectName.equals("物理")) {// 物理
                subjectGid = "454d8476d062607359147d08ae007df1";
            } else if (subjectName.equals("化学")) {// 化学
                subjectGid = "dd1b215ab39b37fd9cc1f84b2ec48516";
            } else if (subjectName.equals("生物")) {// 生物
                subjectGid = "cb9a29e380d5f3b9e8cd803ce515f5e2";
            }
            int totalPoint = singleExam.getSeFullScore().intValue();
            tbSchoolScoreSubjectService.insertTbExamSubject(RandomGUIDUtil.getUUID(), examGid, subjectGid, totalPoint);
        }
        return true;
    }

}

