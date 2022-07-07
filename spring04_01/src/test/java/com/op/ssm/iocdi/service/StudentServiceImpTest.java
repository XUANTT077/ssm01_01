package com.op.ssm.iocdi.service;

import com.op.ssm.iocdi.pojo.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationcontext-01.xml")
public class StudentServiceImpTest {

    @Autowired
    @Qualifier("studentService")
    private StudentService studentService;

    @Test
    public void transferAccounts() {
        boolean result = studentService.transferAccounts(Student.builder().student_id(1).build(),
                Student.builder().student_id(2).build(), 100);
        System.out.println("转账结果为："+result);
    }
}
