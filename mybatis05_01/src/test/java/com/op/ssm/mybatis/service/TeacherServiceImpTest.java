package com.op.ssm.mybatis.service;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @version : 1.0
 * @File : com.op.ssm.mybatis.service.TeacherServiceImpTest
 * @Author : cjgong
 * @Time : 2022/6/12 16:02
 * @desc :
 */
public class TeacherServiceImpTest {

    @Test
    public void testFindTeacher() {
        TeacherServiceImp teacherServiceImp = new TeacherServiceImp();
        teacherServiceImp.findTeacher(2,3);
    }
}