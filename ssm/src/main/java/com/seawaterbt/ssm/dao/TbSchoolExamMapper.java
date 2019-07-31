package com.seawaterbt.ssm.dao;

import com.seawaterbt.ssm.entity.TbSchoolExam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
//oracle在xml文件里面写
public interface TbSchoolExamMapper {
    boolean insertExam(@Param("te") TbSchoolExam te);
    String getExamArea(@Param("studentCard")String studentCard);
    //导出智教云的学生的身份证号后六位 和学校  以及 班级 年级
    List<Map<String,Object>> getStundentInfo();
}
