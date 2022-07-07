package com.op.ssm.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Student {
    private int student_id;
    private String student_name;
    //一个学生属于一个班级
    private Grades grades;
}
