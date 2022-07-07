package com.op.ssm.di;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @version : 1.0
 * @File : com.op.ssm.di.Student01Test
 * @Author : cjgong
 * @Time : 2022/5/28 16:06
 * @desc :
 */
public class DITest {

    // 通过构造函数对成员变量赋值
    @Test
    public void testMethod01(){
        Student01 student01 = new Student01(1,"cjgong01",1);
        System.out.println(student01);
    }
    // 通过set方法对成员变量赋值
    @Test
    public void testMethod02(){
        Student02 student02 = new Student02();
        student02.setId(2);
        student02.setName("cjgong02");
        student02.setAge(2);
        System.out.println(student02);
    }

}