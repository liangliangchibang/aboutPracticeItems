package com.seawaterbt.ssm.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.seawaterbt.ssm.annotation.DataSource;
import com.seawaterbt.ssm.entity.TbSchoolScoreSubject;
import com.seawaterbt.ssm.enums.DataSourceEnum;
import com.seawaterbt.ssm.mapper.TbSchoolScoreSubjectMapper;
import com.seawaterbt.ssm.service.TbSchoolScoreSubjectService;
import org.springframework.stereotype.Service;

@Service
public class TbSchoolScoreSubjectServiceImpl extends ServiceImpl<TbSchoolScoreSubjectMapper,TbSchoolScoreSubject> implements TbSchoolScoreSubjectService{
    @Override
    @DataSource(DataSourceEnum.DB2)
    public boolean insertTbExamSubject(String gid, String examGid, String subjectGid, int totalPoint) {
        TbSchoolScoreSubject ts=new TbSchoolScoreSubject();
        ts.setGid(gid);
        ts.setExamGid(examGid);
        ts.setSubjectGid(subjectGid);
        ts.setTotalPoint(totalPoint);
        return super.insert(ts);
    }
}
