package com.op.ssm.mybatis.mapper;

import com.op.ssm.mybatis.pojo.Teacher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    private TeacherDao teacherDao;

    @Test
    public void testMehtod01() {
        System.out.println(dataSource.getClass().getName());
    }

    @Test
    public void testMehtod02() {
        Teacher teacher = teacherDao.selectTable01(2);
        System.out.println(teacher.getTeacher_id() + ":" + teacher.getTeacher_name() + ":" + teacher.getTeacher_age());
    }

    @Test
    public void testMehtod03() {
        Teacher teacher = teacherDao.selectTable03(Teacher.builder().teacher_id(5).build());
        System.out.println(teacher.getTeacher_id() + ":" + teacher.getTeacher_name() + ":" + teacher.getTeacher_age());
    }

    @Test
    public void testMehtod04() {
        String[] nameString = {"dlxuan11", "dlxuan12", "dlxuan13", "dlxuan14", "dlxuan15"};
        int num = teacherDao.insertTable01(nameString);
        System.out.println("所影响的行数为：" + num);
    }

    @Test
    public void testMehtod05() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("str01");
        stringList.add("str02");
        stringList.add("str03");
        stringList.add("str04");
        int num = teacherDao.insertTable02(stringList);
        System.out.println("所影响的行数为：" + num);
    }

    @Test
    public void testMehtod06() {
        Map<String, Integer> integerMap = new HashMap<>();
        //integerMap.put("teacher_id",1);
        integerMap.put("teacher_age", 1);
        List<Teacher> teacher = teacherDao.selectTable04(integerMap);
        System.out.println("容器里元素的个数为："+teacher.size());
    }

    @Test
    public void testMehtod07() {
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Teacher.builder().teacher_age(22).teacher_name("abc01").build());
        teacherList.add(Teacher.builder().teacher_age(33).teacher_name("abc02").build());
        teacherList.add(Teacher.builder().teacher_age(44).teacher_name("abc03").build());
        teacherDao.insertTable03(teacherList);
    }

    @Test
    public void testMehtod08() {
        int[] intArray = {1, 3, 4};
        List<Teacher> teachers = teacherDao.selectTable05(intArray);
        System.out.println("查询结果个数为：" + teachers.size());
    }

    @Test
    public void testMehtod09() {
        Teacher teacher = Teacher.builder().teacher_id(2).teacher_name("chenjing").build();
        teacherDao.updateTable01(teacher);
    }
}
