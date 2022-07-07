package com.op.ssm.aop03;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @version : 1.0
 * @File : com.op.ssm.aop03.Aop03Test
 * @Author : cjgong
 * @Time : 2022/6/5 10:13
 * @desc :
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationcontext-03.xml")
public class Aop03Test {
    @Autowired
    @Qualifier("xiaoMing")
    private YaoZhang xiaoMing;

    @Test
    public void testMethod01(){
        List<Integer> integers = xiaoMing.yaoZhang();
        System.out.println(integers.get(0));
    }

}