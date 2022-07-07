package com.op.ssm.mybatis.mapper;

import com.op.ssm.mybatis.pojo.Employee;
import org.junit.Test;

/**
 * @version : 1.0
 * @File : com.op.ssm.mybatis.mapper.EmployeeDaoImpTest
 * @Author : cjgong
 * @Time : 2022/6/5 16:58
 * @desc :
 */
public class EmployeeDaoImpTest {

    @Test
    public void testIfnsertTable() {
        EmployeeDao employeeDao = new EmployeeDaoImp();
        int num = employeeDao.insertTable(Employee.builder().employee_name("cjgong13").employee_age(13).build());
        System.out.println("所影响的行数为："+num);
    }
    @Test
    public void testUpdateTable() {
        EmployeeDao employeeDao = new EmployeeDaoImp();
        int num = employeeDao.updateTable(Employee.builder().employee_name("cjgong11").employee_age(11).employee_id(13).build());
        System.out.println("所影响的行数为："+num);
    }


}