package com.op.ssm.di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @version : 1.0
 * @File : com.op.ssm.di.DITest
 * @Author : cjgong
 * @Time : 2022/5/28 16:14
 * @desc :
 */
public class DITest {

    @Test
    public void testMethod01(){
        // 加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationcontext-02.xml");
        // 获取对象
        Student01 student01 = ac.getBean("student01", Student01.class);
        // 查看
        System.out.println(student01);
    }

    @Test
    public void testMethod02(){
        // 加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationcontext-02.xml");
        // 获取对象
        Student02 student02 = ac.getBean("student02", Student02.class);
        System.out.println(student02);
    }

    @Test
    public void testMethod03(){
        // 加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationcontext-02.xml");
        // 获取对象
        Student01 student01 = ac.getBean("student01_02", Student01.class);
        // 查看
        System.out.println(student01);
    }
    @Test
    public void testMethod04(){
        // 加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationcontext-02.xml");
        // 获取对象
        Student01 student01 = ac.getBean("student01_03", Student01.class);
        // 查看
        System.out.println(student01);
    }

}