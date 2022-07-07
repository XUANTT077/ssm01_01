package com.op.ssm.mybatis.mapper;

import com.op.ssm.mybatis.pojo.Employee;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeDaoImpTest {

    @Test
    public void testInsertTableTable() {
        EmployeeDao employeeDao = new EmployeeDaoImp();
        int num = employeeDao.insertTable(Employee.builder().employee_name("cjgong11").employee_age(11).build());
        System.out.println("所影响的行数为：" + num);
    }

    @Test
    public void testUpdateTable() {
        EmployeeDao employeeDao = new EmployeeDaoImp();
        int num = employeeDao.updateTable(Employee.builder().employee_name("cjgong11").employee_age(18).employee_id(7).build());
        System.out.println("所影响的行数为：" + num);
    }
}
