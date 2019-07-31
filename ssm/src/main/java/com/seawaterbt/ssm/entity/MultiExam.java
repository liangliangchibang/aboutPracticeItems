package com.seawaterbt.ssm.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Api("主考试表")
@Data
@TableName("multi_exam")
public class MultiExam {
  @ApiModelProperty("考试id")
  @TableId(type = IdType.AUTO)
  private Long meId;
  private Long qiqMeid;
  private String meName;
  private Long enterYear;
  private Long gradeId;
  private Long termCode;
  private Long meType;
  private Long meLockStatus;
  private java.sql.Timestamp meDate;
  private String meScoreLevels;
  private Double meFullScore;
  private Double meAvgScore;
  private Double meMaxScore;
  private Double meMinScore;
  private Double meHalfScore;
  @TableField("me_3quatrer_score")
  private Double me3quatrerScore;
  private Long meStudentCount;
  private java.sql.Timestamp meGatherTime;
  private java.sql.Timestamp meCreateTime;
  private Long meHideStuOrder;
  private Long meHideStuScore;
  private Long meANum;
  private Long meBNum;
  private Long meCNum;
  private Long meMergeExcel;
  private Long schoolId;
  private Double highScoreAvg;
  private Double midScoreAvg;
  private Double lowScoreAvg;
  private Double meStandardDeviation;
  private Double groupRate;
  private Long levelA;
  private Long levelB;
  private Long levelC;
  private Long levelD;
  private String scoreLevel;
  private Long isApp;
  private Long displayRule;


}
