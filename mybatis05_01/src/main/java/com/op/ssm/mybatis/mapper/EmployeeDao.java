package com.op.ssm.mybatis.mapper;

import com.op.ssm.mybatis.pojo.Employee;

/**
 * @version : 1.0
 * @File : com.op.ssm.mybatis.mapper.EmployeeDao
 * @Author : cjgong
 * @Time : 2022/6/5 16:43
 * @desc :
 */
public interface EmployeeDao {
    int insertTable(Employee employee);
    int updateTable(Employee employee);
}
