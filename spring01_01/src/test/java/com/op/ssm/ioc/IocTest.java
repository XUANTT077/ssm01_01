package com.op.ssm.ioc;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @version : 1.0
 * @File : com.op.ssm.ioc.Student01Test
 * @Author : cjgong
 * @Time : 2022/5/28 14:44
 * @desc :
 */
public class IocTest {
    // 通过new调用构造函数来创建
    @Test
    public void testMethod01(){
        Student01 student01 = new Student01();
        System.out.println(student01);
    }

    // 通过单例设计模式
    @Test
    public void testMethod02(){
        Student02 instance01 = Student02.getInstance();
        Student02 instance02 = Student02.getInstance();
        System.out.println(instance01==instance02);
    }

    // 通过工厂模式来创建
    @Test
    public void testMethod03(){
        Student03Factory student03Factory = new Student03Factory();
        Student03 student03 = student03Factory.createStudent03();
        System.out.println(student03);
    }



}