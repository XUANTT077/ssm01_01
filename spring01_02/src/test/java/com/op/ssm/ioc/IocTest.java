package com.op.ssm.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version : 1.0
 * @File : com.op.ssm.ioc.IocTest
 * @Author : cjgong
 * @Time : 2022/5/28 15:07
 * @desc :
 */
public class IocTest {
    @Test
    public void testMethod01(){
        // 加载spring框架配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationcontext-01.xml");

        // 获取创建好的对象
        Student01 student01 = ac.getBean("student01", Student01.class);

        System.out.println(student01);

    }

    @Test
    public void testMethod02(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationcontext-01.xml");
        Student02 student02_01 = ac.getBean("student02_01", Student02.class);
        Student02 student02_02 = ac.getBean("student02_02", Student02.class);
        System.out.println(student02_01==student02_02);
    }
    @Test
    public void testMethod03(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationcontext-01.xml");
        Student03 student03 = ac.getBean("student03", Student03.class);
        System.out.println(student03);
    }

}