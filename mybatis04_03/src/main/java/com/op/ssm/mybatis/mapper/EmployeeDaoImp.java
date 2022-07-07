package com.op.ssm.mybatis.mapper;

import com.op.ssm.mybatis.pojo.Employee;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;


@Slf4j
public class EmployeeDaoImp implements EmployeeDao {
    @Override
    public int insertTable(Employee employee) {
        // 获取数据库链接对象     Connection     SqlSession(SqlSessionFactory)
        SqlSessionFactory sqlSessionFactory = null;
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        // 执行sql语句
        int num = sqlSession.update("com.op.ssm.mybatis.mapper.EmployeeDao.insertTable", employee);
        log.info("所影响的行数为：" + num);

        // 关闭链接
        sqlSession.close();

        return num;
    }

    @Override
    public int updateTable(Employee employee) {
        // 获取数据库链接对象     Connection     SqlSession(SqlSessionFactory)
        SqlSessionFactory sqlSessionFactory = null;
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        // 执行sql语句
        int num = sqlSession.update("com.op.ssm.mybatis.mapper.EmployeeDao.updateTable", employee);
        log.info("所影响的行数为：" + num);

        // 关闭链接
        sqlSession.close();

        return num;


    }
}
