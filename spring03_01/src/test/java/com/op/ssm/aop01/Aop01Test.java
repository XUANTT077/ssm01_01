package com.op.ssm.aop01;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @version : 1.0
 * @File : com.op.ssm.aop01.AopTest
 * @Author : cjgong
 * @Time : 2022/6/4 10:07
 * @desc :
 */
public class Aop01Test {

    @Test
    public void testMethod01(){
        YaoZhang xiaoMing = new XiaoMing();
        xiaoMing.yaoZhang();
    }
    @Test
    public void testMethod02(){
        YaoZhang xiaoMing = new XiaoMing();
        XiaoWu xiaoWu = new XiaoWu();
        Company company = new Company(xiaoWu,xiaoMing);
        company.yaoZhang();
    }

}