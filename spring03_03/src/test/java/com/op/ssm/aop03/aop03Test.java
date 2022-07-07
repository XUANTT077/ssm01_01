package com.op.ssm.aop03;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationcontext-02.xml")
public class aop03Test {
    @Autowired
    @Qualifier("xiaoMing")
    private XiaoMing xiaoMing;
    @Test
    public void aop03Text(){
        xiaoMing.yaoZhang();
    }

}