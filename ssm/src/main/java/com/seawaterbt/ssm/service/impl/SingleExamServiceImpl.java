package com.seawaterbt.ssm.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.seawaterbt.ssm.annotation.DataSource;
import com.seawaterbt.ssm.entity.SingleExam;
import com.seawaterbt.ssm.enums.DataSourceEnum;
import com.seawaterbt.ssm.mapper.SingleMapper;
import com.seawaterbt.ssm.service.SingleExamService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SingleExamServiceImpl extends ServiceImpl<SingleMapper,SingleExam> implements SingleExamService {

    @Override
    @DataSource(DataSourceEnum.DB1)
    //得到这场考试考了哪几门学科
    public List<SingleExam> getSingleExam(String meId) {
        return super.selectList(new EntityWrapper<SingleExam>().eq("me_id",meId));
    }
}
