package com.op.ssm.aop03;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @version : 1.0
 * @File : com.op.ssm.aop03.XiaoMingTest
 * @Author : cjgong
 * @Time : 2022/6/4 14:27
 * @desc :
 */
public class Aop03Test {

    @Test
    public void yaoZhang() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationcontext-02.xml");
        /*
        * 如果没有添加aop配置，
        *         返回的就是小明对象
        * 如果添加了aop配置，
        *         返回的是要账公司，该要账公司是小明的子类。
        * */
        XiaoMing xiaoMing = ac.getBean("xiaoMing", XiaoMing.class);
        xiaoMing.yaoZhang();
    }
}