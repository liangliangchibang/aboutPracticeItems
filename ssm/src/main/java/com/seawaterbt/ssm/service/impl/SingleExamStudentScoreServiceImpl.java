package com.seawaterbt.ssm.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.seawaterbt.ssm.entity.SingleExamStudentScore;
import com.seawaterbt.ssm.mapper.SingleExamStudentScoreMapper;
import com.seawaterbt.ssm.service.SingleExamStudentScoreService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SingleExamStudentScoreServiceImpl extends ServiceImpl<SingleExamStudentScoreMapper,SingleExamStudentScore> implements SingleExamStudentScoreService {
    @Override
    public List<SingleExamStudentScore> getStudentId(String meId) {
        return super.selectList(new EntityWrapper<SingleExamStudentScore>().eq("me_id",meId));
    }
}
