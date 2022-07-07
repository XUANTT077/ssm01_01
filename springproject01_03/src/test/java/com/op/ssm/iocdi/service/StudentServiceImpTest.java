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
    public void register() {
        studentService.register(Student.builder().student_name("dlxuan01").student_age(18).build());
    }
}
