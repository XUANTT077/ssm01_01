package com.op.ssm.mybatis.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @version : 1.0
 * @File : com.op.ssm.mybatis.service.TeacherServiceImpTest
 * @Author : cjgong
 * @Time : 2022/6/12 16:02
 * @desc :
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationcontext-mapper.xml","classpath:spring/applicationcontext-service.xml"})
public class TeacherServiceImpTest {
    @Autowired
    @Qualifier("teacherService")
    private TeacherService teacherService;

    @Test
    public void testFindTeacher() {
        teacherService.findTeacher(2,3);
    }
}