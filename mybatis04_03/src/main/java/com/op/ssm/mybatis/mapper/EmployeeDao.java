package com.op.ssm.mybatis.mapper;

import com.op.ssm.mybatis.pojo.Employee;


public interface EmployeeDao {
    int insertTable(Employee employee);
    int updateTable(Employee employee);
}
