package com.seawaterbt.ssm.controller;

import com.seawaterbt.ssm.entity.MultiExam;
import com.seawaterbt.ssm.service.MultiExamService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Api("主考试成绩表")
@RestController
@RequestMapping("/multiexam")
public class MultiExamController {
    @Autowired
    private MultiExamService multiExamService;

    @RequestMapping("/test")
    public List<MultiExam> getMultiExam(HttpServletRequest re){
        String gid=re.getParameter("gid");
        return multiExamService.getMultiExam(gid);
    }
}
