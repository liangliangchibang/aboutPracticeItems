package com.seawaterbt.ssm.service.impl;

import com.seawaterbt.ssm.annotation.DataSource;
import com.seawaterbt.ssm.dao.TbSchoolExamMapper;
import com.seawaterbt.ssm.entity.TbSchoolExam;
import com.seawaterbt.ssm.enums.DataSourceEnum;
import com.seawaterbt.ssm.service.TbSchoolExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class TbSchoolExamServiceImpl implements TbSchoolExamService {
    @Autowired
    private TbSchoolExamMapper tbSchoolExamDao;

    @Override
    @DataSource(DataSourceEnum.DB2)
    public boolean insertTbExam(String gid,String type,String schoolYear,String examDate,String examName,String  creatorGid) {

        TbSchoolExam te=new TbSchoolExam();
        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
        Date d=null;
        try{
            d=s.parse(examDate);
        }catch (Exception e){

        }
        te.setGid(gid);
        te.setType(Integer.parseInt(type));
        te.setSchoolYear(schoolYear);
        java.sql.Date sqlDate=new java.sql.Date(d.getTime());
        te.setExamDate(sqlDate);
        te.setCreatorGid(creatorGid);
        te.setExamName(examName);
        return tbSchoolExamDao.insertExam(te);
    }

    @Override
    @DataSource(DataSourceEnum.DB2)
    public String getExamArea(String studentCard) {
        return null;
    }

    @Override
    public List<Map<String, Object>> getStundentInfo() {
        List<Map<String, Object>> stundentInfo=tbSchoolExamDao.getStundentInfo();
        //EncryptUtils;
        return stundentInfo;
    }
}
