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
public class Di02Test {
    /*
    *  spring bean对象是在加载spring配置文件时创建
    *
    * */
    @Test
    public void testMethod01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationcontext-02.xml");
        Student02 student01 = ac.getBean("student01", Student02.class);
        System.out.println(student01);
    }
    /*
    * 调用destroy()方法时，springbean对象销毁。
    * */
    @Test
    public void testMethod02() {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationcontext-02.xml");
        Student02 student01 = ac.getBean("student01", Student02.class);
        System.out.println(student01);
        ac.destroy();
    }
    @Test
    public void testMethod03() {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationcontext-02.xml");
        Student02 student01 = ac.getBean("student02", Student02.class);
        System.out.println(student01);
        ac.destroy();
    }
    @Test
    public void testMethod04() {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationcontext-02.xml");
        Student02 student01_01 = ac.getBean("student03", Student02.class);
        Student02 student01_02 = ac.getBean("student03", Student02.class);
        if(student01_01==student01_02){
            System.out.println("两次getbean方法获取到的对象为同一个对象。");
        }else{
            System.out.println("两次getbean方法获取到的对象不是同一个对象。");
        }
    }
    @Test
    public void testMethod05() {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationcontext-02.xml");
        Student02 student01_01 = ac.getBean("student04", Student02.class);
        Student02 student01_02 = ac.getBean("student04", Student02.class);
        if(student01_01==student01_02){
            System.out.println("两次getbean方法获取到的对象为同一个对象。");
        }else{
            System.out.println("两次getbean方法获取到的对象不是同一个对象。");
        }
        if(student01_01.equals(student01_02)){
            System.out.println("两次getbean方法获取到的对象的内容相同。");
        }else{
            System.out.println("两次getbean方法获取到的对象的内容不相同。");
        }
    }



}