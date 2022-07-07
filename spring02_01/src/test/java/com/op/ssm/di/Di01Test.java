package com.op.ssm.di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

import static org.junit.Assert.*;

/**
 * @version : 1.0
 * @File : com.op.ssm.di.DiTest
 * @Author : cjgong
 * @Time : 2022/5/29 10:02
 * @desc :
 */
public class Di01Test {
    @Test
    public void testMethod01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationcontext-01.xml");
        Student01 student01 = ac.getBean("student01", Student01.class);
        Date birthday = student01.getBirthday();
        System.out.println(birthday.toLocaleString());
    }

    @Test
    public void testMethod02() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationcontext-01.xml");
        Student01 student01 = ac.getBean("student02", Student01.class);
        System.out.println(student01.getName());
    }

    @Test
    public void testMethod03() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationcontext-01.xml");
        Student01 student01 = ac.getBean("student03", Student01.class);
        if ("".equals(student01.getName())) {
            System.out.println("注入的内容为空字符串");
        } else {
            System.out.println("注入的内容不为空字符串");
        }
    }

    @Test
    public void testMethod04() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationcontext-01.xml");
        Student01 student01 = ac.getBean("student04", Student01.class);
        Properties properties = student01.getProperties();
        Enumeration enumeration = properties.propertyNames();
        while(enumeration.hasMoreElements()){
            String key = (String)enumeration.nextElement();
            String value = properties.getProperty(key);
            System.out.println(key+ "="+value);
        }
    }
    @Test
    public void testMethod05() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationcontext-01.xml");
        Student01 student01 = ac.getBean("student05", Student01.class);
        int[] intArray = student01.getIntArray();
        for(int element:intArray){
            System.out.println(element);
        }

    }
    @Test
    public void testMethod06() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationcontext-01.xml");
        Student01 student01 = ac.getBean("student06", Student01.class);
        List<Date> dateList = student01.getDateList();
        for(Date element:dateList){
            System.out.println(element.toLocaleString());
        }
    }
    @Test
    public void testMethod07() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationcontext-01.xml");
        Student01 student01 = ac.getBean("student07", Student01.class);
        Set<String> strSet = student01.getStrSet();
        for(String element:strSet){
            System.out.println(element);
        }
    }
    @Test
    public void testMethod08() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationcontext-01.xml");
        Student01 student01 = ac.getBean("student08", Student01.class);
        Map<String, String> strMap = student01.getStrMap();
        for(Map.Entry<String,String> element:strMap.entrySet()){
            System.out.println(element.getKey()+":"+element.getValue());
        }
    }



}