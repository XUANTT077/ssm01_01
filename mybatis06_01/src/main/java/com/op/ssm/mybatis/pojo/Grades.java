package com.op.ssm.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Grades {
    private int grades_id;
    private String grades_name;
    //一个班级里有多个学生
    private List<Student> studentList;
}
