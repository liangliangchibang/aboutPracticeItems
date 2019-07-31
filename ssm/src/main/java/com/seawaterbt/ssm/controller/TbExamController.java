package com.seawaterbt.ssm.controller;

import com.seawaterbt.ssm.service.TbExamService;
import com.seawaterbt.ssm.service.TbSchoolExamService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Api("主考试成绩表-oracle")
@RestController
@RequestMapping("/tbschoolexam")
public class TbExamController {
    @Autowired
    private TbSchoolExamService tbSchoolExamService;

    @RequestMapping("/test")
    public boolean insertTbExam(HttpServletRequest re){
        String type=re.getParameter("type");
        String schoolYear=re.getParameter("schoolYear");
        String examDate=re.getParameter("examDate");
        String examName=re.getParameter("examName");
        String creatorGid=re.getParameter("creatorGid");
        String gid=re.getParameter("type");
        return tbSchoolExamService.insertTbExam(gid,type,schoolYear,examDate,examName,creatorGid);
    }
}
