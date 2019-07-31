package com.seawaterbt.ssm.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.seawaterbt.ssm.entity.TbSchoolExam;
import com.seawaterbt.ssm.mapper.TbExamMapper;
import com.seawaterbt.ssm.service.TbExamService;
import org.springframework.stereotype.Service;

@Service
public class TbExamServiceImpl extends ServiceImpl<TbExamMapper,TbSchoolExam> implements TbExamService{

}
