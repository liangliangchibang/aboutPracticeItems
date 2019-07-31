package com.seawaterbt.ssm.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import io.swagger.annotations.Api;
import lombok.Data;

@Api("主考试表学科-oracle")
@Data
@TableName("TB_SCHOOL_SCORE_SUBJECT")
public class TbSchoolScoreSubject {

  private String gid;
  private String examGid;
  private String subjectGid;
  private java.sql.Date createTime;
  private int totalPoint;


}
