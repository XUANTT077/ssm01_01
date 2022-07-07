package com.op.ssm.aop02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @version : 1.0
 * @File : com.op.ssm.aop02.Aop02Test
 * @Author : cjgong
 * @Time : 2022/6/4 11:59
 * @desc :
 */
public class Aop02Test {

    @Test
    public void yaoZhang() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationcontext-01.xml");
        /*
        * 如果没有添加aop配置，
        *       返回的是XiaoMing对象
        * 如果添加了aop配置
        *       返回的是要账公司，要账公司与XiaoMing是兄弟关系，所以只能接口编程
        *
        * */
        YaoZhang xiaoMing = ac.getBean("xiaoMing", YaoZhang.class);
        xiaoMing.yaoZhang();
    }
}