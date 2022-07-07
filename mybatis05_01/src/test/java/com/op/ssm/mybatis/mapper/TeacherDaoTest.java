package com.op.ssm.mybatis.mapper;

import com.op.ssm.mybatis.pojo.Teacher;
import com.op.ssm.mybatis.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @version : 1.0
 * @File : com.op.ssm.mybatis.mapper.TeacherDaoTest
 * @Author : cjgong
 * @Time : 2022/6/12 10:29
 * @desc :
 */
public class TeacherDaoTest {

    @Test
    public void testInsertTable() {
        // 获取sqlSession
        SqlSession sqlSession = MybatisUtil.getSqlSession(true);
        // 通过sqlSession获取接口实现类
        TeacherDao teacherDaoimp = sqlSession.getMapper(TeacherDao.class);
        // 执行方法
        teacherDaoimp.insertTable(Teacher.builder().teacher_name("cjgong02").teacher_age(2).build());

        // 关闭sqlSession
        MybatisUtil.close(sqlSession);
    }
    @Test
    public void testInsertTable01() {
        // 获取sqlSession
        SqlSession sqlSession = MybatisUtil.getSqlSession(true);
        // 通过sqlSession获取接口实现类
        TeacherDao teacherDaoimp = sqlSession.getMapper(TeacherDao.class);
        Teacher teacher = Teacher.builder().teacher_name("cjgong03").teacher_age(3).build();
        System.out.println("插入之前，老师的主键值："+teacher.getTeacher_id());
        // 执行方法
        teacherDaoimp.insertTable01(teacher);
        System.out.println("插入之后，老师的主键值："+teacher.getTeacher_id());
        // 关闭sqlSession
        MybatisUtil.close(sqlSession);
    }
    @Test
    public void testInsertTable02() {
        // 获取sqlSession
        SqlSession sqlSession = MybatisUtil.getSqlSession(true);
        // 通过sqlSession获取接口实现类
        TeacherDao teacherDaoimp = sqlSession.getMapper(TeacherDao.class);
        Teacher teacher = Teacher.builder().teacher_name("cjgong04").teacher_age(4).build();
        System.out.println("插入之前，老师的主键值："+teacher.getTeacher_id());
        // 执行方法
        teacherDaoimp.insertTable02(teacher);
        System.out.println("插入之后，老师的主键值："+teacher.getTeacher_id());
        // 关闭sqlSession
        MybatisUtil.close(sqlSession);
    }
    @Test
    public void testInsertTable03() {
        // 获取sqlSession
        SqlSession sqlSession = MybatisUtil.getSqlSession(true);
        // 通过sqlSession获取接口实现类
        TeacherDao teacherDaoimp = sqlSession.getMapper(TeacherDao.class);
        Teacher[]  teacherArray={
                Teacher.builder().teacher_name("teacher_a").teacher_age(1).build(),
                Teacher.builder().teacher_name("teacher_b").teacher_age(2).build(),
                Teacher.builder().teacher_name("teacher_c").teacher_age(3).build(),
                Teacher.builder().teacher_name("teacher_d").teacher_age(4).build()
        };

        // 执行方法
        int num = teacherDaoimp.insertTable03(teacherArray);
        System.out.println("所影响的行数为："+num);
        // 关闭sqlSession
        MybatisUtil.close(sqlSession);
    }
    @Test
    public void testInsertTable04() {
        // 获取sqlSession
        SqlSession sqlSession = MybatisUtil.getSqlSession(true);
        // 通过sqlSession获取接口实现类
        TeacherDao teacherDaoimp = sqlSession.getMapper(TeacherDao.class);
        Teacher[]  teacherArray={
                Teacher.builder().teacher_name("teacher_a").teacher_age(1).build(),
                Teacher.builder().teacher_name("teacher_b").teacher_age(2).build(),
                Teacher.builder().teacher_name("teacher_c").teacher_age(3).build(),
                Teacher.builder().teacher_name("teacher_d").teacher_age(4).build()
        };

        // 执行方法
        teacherDaoimp.insertTable04(teacherArray);
        // 关闭sqlSession
        MybatisUtil.close(sqlSession);
    }
    @Test
    public void testUpdateTable01() {
        // 获取sqlSession
        SqlSession sqlSession = MybatisUtil.getSqlSession(true);
        // 通过sqlSession获取接口实现类
        TeacherDao teacherDaoimp = sqlSession.getMapper(TeacherDao.class);
        Teacher teacher = Teacher.builder().teacher_name("teacher01").teacher_age(1).teacher_id(1).build();

        // 执行方法
        teacherDaoimp.updateTable01(teacher);
        // 关闭sqlSession
        MybatisUtil.close(sqlSession);
    }
    @Test
    public void testDeleleTable01() {
        // 获取sqlSession
        SqlSession sqlSession = MybatisUtil.getSqlSession(true);
        // 通过sqlSession获取接口实现类
        TeacherDao teacherDaoimp = sqlSession.getMapper(TeacherDao.class);

        // 执行方法
        int num = teacherDaoimp.deleleTable01(2);
        System.out.println("所影响的行数为："+num);
        // 关闭sqlSession
        MybatisUtil.close(sqlSession);
    }
    @Test
    public void testDeleleTable02() {
        // 获取sqlSession
        SqlSession sqlSession = MybatisUtil.getSqlSession(true);
        // 通过sqlSession获取接口实现类
        TeacherDao teacherDaoimp = sqlSession.getMapper(TeacherDao.class);

        // 执行方法
        teacherDaoimp.deleteTable02();

        // 关闭sqlSession
        MybatisUtil.close(sqlSession);
    }
    @Test
    public void testSelecttable01() {
        // 获取sqlSession
        SqlSession sqlSession = MybatisUtil.getSqlSession(true);
        // 通过sqlSession获取接口实现类
        TeacherDao teacherDaoimp = sqlSession.getMapper(TeacherDao.class);

        // 执行方法
        Teacher teacher = teacherDaoimp.selecttable01(1);

        System.out.println(teacher.getTeacher_id()+":"+teacher.getTeacher_name()+":"+teacher.getTeacher_age());

        // 关闭sqlSession
        MybatisUtil.close(sqlSession);
    }
    @Test
    public void testSelectTable02() {
        // 获取sqlSession
        SqlSession sqlSession = MybatisUtil.getSqlSession(true);
        // 通过sqlSession获取接口实现类
        TeacherDao teacherDaoimp = sqlSession.getMapper(TeacherDao.class);

        // 执行方法
        List<Teacher> teachers = teacherDaoimp.selectTable02();
        for(Teacher teacher:teachers){
            System.out.println(teacher.getTeacher_id()+":"+teacher.getTeacher_name()+":"+teacher.getTeacher_age());
        }
        // 关闭sqlSession
        MybatisUtil.close(sqlSession);
    }
}