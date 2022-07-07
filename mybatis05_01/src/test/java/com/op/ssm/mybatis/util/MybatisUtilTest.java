package com.op.ssm.mybatis.util;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @version : 1.0
 * @File : com.op.ssm.mybatis.util.MybatisUtilTest
 * @Author : cjgong
 * @Time : 2022/6/12 10:12
 * @desc :
 */
public class MybatisUtilTest {

    @Test
    public void getSqlSession() {
        SqlSession sqlSession = MybatisUtil.getSqlSession(true);
        System.out.println(sqlSession.getClass().getName());
    }
}