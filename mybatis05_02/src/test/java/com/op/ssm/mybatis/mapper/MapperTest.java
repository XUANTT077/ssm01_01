package com.op.ssm.mybatis.mapper;

import com.op.ssm.mybatis.pojo.Teacher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @version : 1.0
 * @File : com.op.ssm.mybatis.mapper.MapperTest
 * @Author : cjgong
 * @Time : 2022/6/12 16:40
 * @desc :
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationcontext-mapper.xml"})
public class MapperTest {
    @Autowired
    private DataSource dataSource;
    @Autowired
    @Qualifier("def")
    private  TeacherDao teacherDao;

    @Test
    public void testMehtod01(){
        System.out.println(dataSource.getClass().getName());
    }
    @Test
    public void testMehtod02(){
        List<Teacher> teachers = teacherDao.selectTable02();
        System.out.println(teachers);

    }

}