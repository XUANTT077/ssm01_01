package com.op.ssm.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @version : 1.0
 * @File : com.op.ssm.mybatis.pojo.Employee
 * @Author : cjgong
 * @Time : 2022/6/5 16:42
 * @desc :
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Employee {
    private int employee_id;
    private String employee_name;
    private int employee_age;
}
