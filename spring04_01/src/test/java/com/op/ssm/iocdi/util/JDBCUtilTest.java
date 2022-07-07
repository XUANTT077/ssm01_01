package com.op.ssm.iocdi.util;

import org.junit.Test;

import java.sql.Connection;

import static org.junit.Assert.*;

/**
 * @version : 1.0
 * @File : com.op.ssm.iocdi.util.JDBCUtilTest
 * @Author : cjgong
 * @Time : 2022/6/5 11:42
 * @desc :
 */
public class JDBCUtilTest {

    @Test
    public void testMethod01() {
        Connection connection = JDBCUtil.getConnection();
        System.out.println(connection.getClass().getName());
    }
}