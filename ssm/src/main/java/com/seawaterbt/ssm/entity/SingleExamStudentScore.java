package com.seawaterbt.ssm.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.Api;
import lombok.Data;

@Api("学生成绩表-mysql")
@Data
@TableName("single_exam_student_score")
public class SingleExamStudentScore {
  private Long essId;
  private Long isReaded;
  private String userId;
  private Long enterYear;
  private String studentId;
  private String studentName;
  private String classId;
  private Long schoolId;
  private String schoolName;
  private Long seId;
  private Long meId;
  private Double essScore;
  private Long essStatus;
  private Long essClassOrder;
  private Long essGradeOrder;
  private Long essOrder;
  private Long essProvinceOrder;
  private Long essCityOrder;
  private Long essDistrictOrder;
  private Double subjectScore;
  private Double objectScore;
  private Double paperA;
  private Double paperB;
  private Double carelessIndex;
  private Double tScore;
  private Double zScore;
  private Double zhScore;
  private Long errCount;
  private String levelName;
  private Double levelScore;
  private Double potentialScore;
  private Long potentialStatus;
  private Long potentialOrder;
  private Long potentialClassOrder;
  private Long lastSeId;
  private Long lastClassOrder;
  private Long lastGradeOrder;
  private Long stable;


}
