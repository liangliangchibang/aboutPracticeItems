package com.seawaterbt.ssm.service;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Service
public interface TbSchoolExamService {
    boolean insertTbExam(String gid,String type,String schoolYear,String examDate,String examName,String  creatorGid);
    //通过考试的学生身份证后六位得到考试针对年级
    String getExamArea(String studentCard);
    List<Map<String,Object>> getStundentInfo();
}
