package com.seawaterbt.ssm.controller;

import com.seawaterbt.ssm.service.MainService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Api("主操作表")
@RestController
@RequestMapping("/main")
public class MainController {
    @Autowired
    private MainService mainService;

    @RequestMapping("/insertExam")
    boolean insertExamTo(HttpServletRequest re) {
        return mainService.insertExam(re);
    }
}
