package com.seawaterbt.ssm.service;

import com.baomidou.mybatisplus.service.IService;
import com.seawaterbt.ssm.entity.TbSchoolScoreSubject;

public interface TbSchoolScoreSubjectService extends IService<TbSchoolScoreSubject> {

    boolean insertTbExamSubject(String gid,String examGid,String subjectGid,int totalPoint);

}
