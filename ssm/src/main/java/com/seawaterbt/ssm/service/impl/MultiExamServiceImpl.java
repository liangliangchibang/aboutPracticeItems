package com.seawaterbt.ssm.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.seawaterbt.ssm.annotation.DataSource;
import com.seawaterbt.ssm.entity.MultiExam;
import com.seawaterbt.ssm.enums.DataSourceEnum;
import com.seawaterbt.ssm.mapper.MultiExamMapper;
import com.seawaterbt.ssm.service.MultiExamService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Service
public class MultiExamServiceImpl extends ServiceImpl<MultiExamMapper,MultiExam> implements MultiExamService{
    @Override
    @DataSource(DataSourceEnum.DB1)
    public List<MultiExam> getMultiExam(String meId) {
        MultiExam m=new MultiExam();
        m.setMeId(Long.parseLong(meId));
        MultiExam s= super.selectById(meId);
        List<MultiExam> ss=new ArrayList<>();
        ss.add(s);
        return ss;
    }
}
