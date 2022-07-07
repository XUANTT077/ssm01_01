package com.op.ssm.mybatis.mapper;

import com.op.ssm.mybatis.pojo.Dept;
import com.op.ssm.mybatis.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

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
        // 获取sqlSession   mybatis框架会自动为该对象分配一个缓存空间
        SqlSession sqlSession = MybatisUtil.getSqlSession(true);
        // 通过sqlSession获取接口实现类
        DeptDao deptDaoImp = sqlSession.getMapper(DeptDao.class);

        // 执行方法    不仅会把数据返回，而且还会把查询结果保存到缓存里       key com.op.ssm.mybatis.mapper.DeptDao.selectTable01.2
        Dept dept = deptDaoImp.selectTable01(2);
        System.out.println(dept.getId() + ":" + dept.getName());
        // sqlSession.clearCache();    // 清空缓存
        /*
         * 步骤1：清空sqlsession缓存
         * 步骤2：提交事务
         * */
        // sqlSession.commit();
        // 执行更新语句的时候也会清空缓存
        //deptDaoImp.insertTable01(Dept.builder().name("dept03").build());
        Dept dept01 = deptDaoImp.selectTable01(3);           //com.op.ssm.mybatis.mapper.DeptDao.selectTable01.3
        System.out.println(dept01.getId() + ":" + dept01.getName());
        // 关闭sqlSession
        MybatisUtil.close(sqlSession);
    }

    @Test
    public void testSelectTable02() {
        // 获取sqlSession   mybatis框架会自动为该对象分配一个缓存空间
        SqlSession sqlSession01 = MybatisUtil.getSqlSession(true);
        // 通过sqlSession获取接口实现类
        DeptDao deptDaoImp = sqlSession01.getMapper(DeptDao.class);
        // 执行方法    不仅会把数据返回，而且还会把查询结果保存到缓存里       key com.op.ssm.mybatis.mapper.DeptDao.selectTable01.2
        Dept dept = deptDaoImp.selectTable01(2);
        System.out.println(dept.getId() + ":" + dept.getName());
        // 执行更新语句的时候也会清空缓存
        deptDaoImp.insertTable01(Dept.builder().name("dept03").build());

        // 关闭sqlSession
        MybatisUtil.close(sqlSession01);



        SqlSession sqlSession02 = MybatisUtil.getSqlSession(true);
        // 通过sqlSession获取接口实现类
        DeptDao deptDaoImp02 = sqlSession02.getMapper(DeptDao.class);
        // 执行方法    不仅会把数据返回，而且还会把查询结果保存到缓存里       key com.op.ssm.mybatis.mapper.DeptDao.selectTable01.2
        Dept dept02 = deptDaoImp02.selectTable01(2);
        System.out.println(dept02.getId() + ":" + dept02.getName());
        MybatisUtil.close(sqlSession02);
    }
}
