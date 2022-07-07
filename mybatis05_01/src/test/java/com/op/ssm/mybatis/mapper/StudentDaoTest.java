package com.op.ssm.mybatis.mapper;

import com.op.ssm.mybatis.pojo.Student;
import com.op.ssm.mybatis.pojo.Teacher;
import com.op.ssm.mybatis.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

/**
 * @version : 1.0
 * @File : com.op.ssm.mybatis.mapper.StudentDaoTest
 * @Author : cjgong
 * @Time : 2022/6/12 11:26
 * @desc :
 */
public class StudentDaoTest {

    @Test
    public void testInsertTable01() {
        // 获取sqlSession
        SqlSession sqlSession = MybatisUtil.getSqlSession(true);
        // 通过sqlSession获取接口实现类
        StudentDao studentDaoImp = sqlSession.getMapper(StudentDao.class);
        // 执行方法
        studentDaoImp.insertTable01(Student.builder().student_id("b").student_name("cjgongb").student_age(2).build());

        // 关闭sqlSession
        MybatisUtil.close(sqlSession);
    }

    @Test
    public void testInsertTable02() {
        // 获取sqlSession
        SqlSession sqlSession = MybatisUtil.getSqlSession(true);
        // 通过sqlSession获取接口实现类
        StudentDao studentDaoImp = sqlSession.getMapper(StudentDao.class);

        // java程序来生成主键    jdk   UUID类型
        UUID uuid = UUID.randomUUID();

        // 执行方法
        studentDaoImp.insertTable01(Student.builder().student_id(uuid.toString()).student_name("cjgongb").student_age(2).build());

        // 关闭sqlSession
        MybatisUtil.close(sqlSession);
    }
    @Test
    public void testInsertTable03() {
        // 获取sqlSession
        SqlSession sqlSession = MybatisUtil.getSqlSession(true);
        // 通过sqlSession获取接口实现类
        StudentDao studentDaoImp = sqlSession.getMapper(StudentDao.class);

        // 执行方法
        studentDaoImp.insertTable02(Student.builder().student_name("cjgongc").student_age(3).build());

        // 关闭sqlSession
        MybatisUtil.close(sqlSession);
    }
}