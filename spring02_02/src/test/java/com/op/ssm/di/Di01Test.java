package com.op.ssm.di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

/**
 * @version : 1.0
 * @File : com.op.ssm.di.DiTest
 * @Author : cjgong
 * @Time : 2022/5/29 10:02
 * @desc :
 */
public class Di01Test {
    /*
    *  spring bean对象是在加载spring配置文件时创建
    *
    * */
    @Test
    public void testMethod01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationcontext-01.xml");
        Student01 student01 = ac.getBean("student01", Student01.class);
        System.out.println(student01);
    }
    @Test
    public void testMethod02() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationcontext-01.xml");
        Student02 student01 = ac.getBean("student02", Student02.class);
        System.out.println(student01);
    }



}