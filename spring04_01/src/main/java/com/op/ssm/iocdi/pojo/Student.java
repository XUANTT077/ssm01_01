package com.op.ssm.iocdi.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @version : 1.0
 * @File : com.op.ssm.iocdi.pojo.Student
 * @Author : cjgong
 * @Time : 2022/5/29 15:49
 * @desc :
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Student {
    private int student_id;
    private String student_name;
    private String student_sex;
    private double student_account;
}
