package com.op.ssm.iocdi.dao;

import com.op.ssm.iocdi.pojo.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

/**
 * @version : 1.0
 * @File : com.op.ssm.iocdi.dao.StudentDaoImpTest
 * @Author : cjgong
 * @Time : 2022/6/5 11:49
 * @desc :
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationcontext-01.xml")
public class StudentDaoImpTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    @Qualifier("studentDao")
    private StudentDao studentDao;

    @Test
    public void testMethod01() {
        System.out.println(dataSource.getClass().getName());
    }


    @Test
    public void testInsertTable() {
        StudentDao studentDao = new StudentDaoImp();
        int result = studentDao.insertTable(Student.builder().student_name("cjgong11").student_sex("m").student_account(200).build());
        System.out.println("所影响的行数为：" + result);
    }

    @Test
    public void testSelectTable() {
        List students = studentDao.selectTable();
        System.out.println(students);
    }

    @Test
    public void testUpdateTable(){
        int result = studentDao.updateTable(Student.builder().student_id(10).build(), -300);
        System.out.println("所影响的行数为："+result);
    }


}