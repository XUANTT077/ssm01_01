package com.op.ssm.mybatis.mapper;

import com.op.ssm.mybatis.pojo.Dept;
import com.op.ssm.mybatis.pojo.Teacher;
import com.op.ssm.mybatis.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @version : 1.0
 * @File : com.op.ssm.mybatis.mapper.DeptDaoTest
 * @Author : cjgong
 * @Time : 2022/6/12 14:54
 * @desc :
 */
public class DeptDaoTest {

    @Test
    public void testSelectTable01() {
        // 获取sqlSession
        SqlSession sqlSession = MybatisUtil.getSqlSession(true);
        // 通过sqlSession获取接口实现类
        DeptDao deptDaoImp = sqlSession.getMapper(DeptDao.class);

        // 执行方法
        Dept dept = deptDaoImp.selectTable01(2);

        System.out.println(dept.getId()+":"+dept.getName());

        // 关闭sqlSession
        MybatisUtil.close(sqlSession);
    }
    @Test
    public void testSelectTable02() {
        // 获取sqlSession
        SqlSession sqlSession = MybatisUtil.getSqlSession(true);
        // 通过sqlSession获取接口实现类
        DeptDao deptDaoImp = sqlSession.getMapper(DeptDao.class);

        // 执行方法
        Dept dept = deptDaoImp.selectTable02(2);

        System.out.println(dept.getId()+":"+dept.getName());

        // 关闭sqlSession
        MybatisUtil.close(sqlSession);
    }
}