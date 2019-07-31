package com.seawaterbt.ssm.service;

import com.baomidou.mybatisplus.service.IService;
import com.seawaterbt.ssm.entity.SingleExamStudentScore;

import java.util.List;

public interface SingleExamStudentScoreService extends IService<SingleExamStudentScore> {
    //通过考试id查询考试表中所有学生的学号 student_id
    List<SingleExamStudentScore> getStudentId(String meId);
}
