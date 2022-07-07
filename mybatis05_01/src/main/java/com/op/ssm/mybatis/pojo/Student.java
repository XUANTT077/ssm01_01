package com.op.ssm.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @version : 1.0
 * @File : com.op.ssm.mybatis.pojo.Student
 * @Author : cjgong
 * @Time : 2022/6/12 11:19
 * @desc :
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Student {
    private String student_id;
    private String student_name;
    private int student_age;
}
