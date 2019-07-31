package com.seawaterbt.ssm.service;

import com.baomidou.mybatisplus.service.IService;
import com.seawaterbt.ssm.entity.MultiExam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface MultiExamService extends IService<MultiExam> {
    List<MultiExam> getMultiExam(String meId);
}
