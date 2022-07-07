package com.op.ssm.di;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @version : 1.0
 * @File : com.op.ssm.di.DiTest
 * @Author : cjgong
 * @Time : 2022/5/29 10:02
 * @desc :
 */
/*
* 设置单元测试的实现类为SpringJUnit4ClassRunner
* 设置所加载的classpath配置文件
* */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationcontext-01.xml")
@Slf4j
public class Di03Test {

    @Autowired
    private Student02 student02;

    @Test
    public void testMethod01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationcontext-01.xml");
        Student01 student01 = ac.getBean("student01", Student01.class);
        System.out.println(student01);
    }
    @Test
    public void testMethod02() {
        log.debug("Di02Test>>>testMethod02 start……");
        log.info(student02.toString());
        log.debug("Di02Test>>>testMethod02 end……");
    }



}