package com.op.ssm.mybatis.mapper;

import com.op.ssm.mybatis.pojo.Grades;
import com.op.ssm.mybatis.pojo.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationcontext-mapper.xml"})
public class GradesMapperTest {
    @Autowired
    private GradesMapper gradesMapper;

    @Test
    public void textMehod01() {
        Grades grades = gradesMapper.selectTable(1);
        System.out.println("班级信息为：");
        System.out.println(grades.getGrades_id()+":"+grades.getGrades_name());
        List<Student> studentList = grades.getStudentList();
        System.out.println("学生信息为：");
        for (Student student: studentList){
            System.out.println(student.getStudent_name());
        }
    }

}
