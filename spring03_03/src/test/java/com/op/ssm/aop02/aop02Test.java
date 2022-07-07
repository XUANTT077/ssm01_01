package com.op.ssm.aop02;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationcontext-01.xml")
public class aop02Test {
    @Autowired
    @Qualifier("xiaoMing")
    private YaoZhang xiaoMing;
    @Test
    public void yaoZhang(){
        xiaoMing.yaoZhang();
    }
}