package com.seawaterbt.ssm.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import io.swagger.annotations.Api;
import lombok.Data;

@Api("主考试表-oracle")
@Data
@TableName("TB_SCHOOL_EXAM")
public class TbSchoolExam {
  @TableId(type = IdType.AUTO)
  private String gid;
  private int type;
  private String schoolYear;
  private java.sql.Date examDate;
  private String examName;
  private String creatorGid;
  private java.sql.Date createTime;


}
