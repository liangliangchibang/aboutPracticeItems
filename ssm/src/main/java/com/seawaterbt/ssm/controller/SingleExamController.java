package com.seawaterbt.ssm.controller;

import com.seawaterbt.ssm.entity.SingleExam;
import com.seawaterbt.ssm.service.SingleExamService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Api("学科考试表-mysql")
@RestController
@RequestMapping("/singleexam")
public class SingleExamController {

    @Autowired
    private SingleExamService singleexam;

    @RequestMapping("/test")
    public List<SingleExam> getSingleExam(HttpServletRequest re){
        String meId=re.getParameter("meId");
        return singleexam.getSingleExam(meId);
    }
}
