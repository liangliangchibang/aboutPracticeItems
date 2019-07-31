package com.seawaterbt.ssm.service;

import com.baomidou.mybatisplus.service.IService;
import com.seawaterbt.ssm.entity.SingleExam;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SingleExamService extends IService<SingleExam> {


    List<SingleExam> getSingleExam(String meId);
}
