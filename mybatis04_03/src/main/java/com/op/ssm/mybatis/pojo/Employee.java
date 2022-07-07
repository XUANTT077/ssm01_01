package com.op.ssm.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Employee {
    private int employee_id;
    private String employee_name;
    private int employee_age;
}
