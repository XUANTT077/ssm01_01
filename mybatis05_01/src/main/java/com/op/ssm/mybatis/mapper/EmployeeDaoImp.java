package com.op.ssm.mybatis.mapper;

import com.op.ssm.mybatis.pojo.Employee;
import com.op.ssm.mybatis.util.MybatisUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @version : 1.0
 * @File : com.op.ssm.mybatis.mapper.EmployeeDaoImp
 * @Author : cjgong
 * @Time : 2022/6/5 16:53
 * @desc :
 */

@Slf4j
public class EmployeeDaoImp implements EmployeeDao {
    @Override
    public int insertTable(Employee employee) {

        SqlSession sqlSession = MybatisUtil.getSqlSession(true);

        // 执行sql语句
        int num = sqlSession.update("com.op.ssm.mybatis.mapper.EmployeeDao.insertTable", employee);
        log.info("所影响的行数为：" + num);

        // 关闭链接
        MybatisUtil.close(sqlSession);

        return num;
    }

    @Override
    public int updateTable(Employee employee) {


        SqlSession sqlSession = MybatisUtil.getSqlSession(true);

        // 执行sql语句
        int num = sqlSession.update("com.op.ssm.mybatis.mapper.EmployeeDao.updateTable", employee);
        log.info("所影响的行数为：" + num);

        // 关闭链接
        MybatisUtil.close(sqlSession);

        return num;
    }
}
