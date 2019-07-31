package com.seawaterbt.ssm.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import io.swagger.annotations.Api;
import lombok.Data;

@Api("学科考试表")
@Data
@TableName("single_exam")
public class SingleExam {
  @TableId(type = IdType.AUTO)
  private Long seId;
  private Long qiqSeid;
  private Long meId;
  private Long enterYear;
  private String seName;
  private Long seType;
  private Long seCourseId;
  private String seCourseName;
  private Long seCourseType;
  private Long seLockStatus;
  private java.sql.Date seDate;
  private String seScoreLevels;
  private Double seScoreRequire;
  private Double seFullScore;
  private Double seAvgScore;
  private Double seMaxScore;
  private Double seMinScore;
  private Double seQuarterScore;
  private Double seHalfScore;
  @TableField("se_3quarter_score")
  private Double se3quarterScore;
  private Long seStudentCount;
  private java.sql.Timestamp seGatherTime;
  private java.sql.Timestamp seCreateTime;
  private Double seReliability;
  private Double seValidity;
  private Double seDifficulty;
  private Double seDiscrimination;
  private Double seStandardDeviation;
  private String seTagXml;
  private Long seANum;
  private Long seBNum;
  private Long seCNum;
  private Long seHideStuInfo;
  private Long seHideStuScore;
  private Long seHideStuOrder;
  private Long seParentId;
  private Long seStuIdLen;
  private Long seStuIdType;
  private Long seAssignType;
  private java.sql.Timestamp seCorrectStartTime;
  private java.sql.Timestamp seCorrectEndTime;
  private Long seMonitorLogInterval;
  private Long seAnchorType;
  private Long examMonitorId;
  private Long absentCount;
  private Long disciplineCount;
  private Double highScoreAvg;
  private Double midScoreAvg;
  private Double lowScoreAvg;
  private Double groupRate;
  private Double fullRate;
  private Long levelA;
  private Long levelB;
  private Long levelC;
  private Long levelD;
  private Long isPaperAb;
  private String pageUrl;
  private String scoreLevel;
  private Long examLevelArea;
  private String isApp;


}
