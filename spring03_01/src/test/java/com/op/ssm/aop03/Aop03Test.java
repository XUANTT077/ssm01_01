package com.op.ssm.aop03;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @version : 1.0
 * @File : com.op.ssm.aop03.Aop03Test
 * @Author : cjgong
 * @Time : 2022/6/4 11:23
 * @desc :
 */
public class Aop03Test {
    @Test
    public void testMethod01(){
        XiaoMing xiaoMing = new XiaoMing();
        xiaoMing.yaoZhang();
    }
    
    @Test
    public void testMethod02(){
        XiaoMing xiaoMing = new XiaoMing();
        XiaoWu xiaoWu = new XiaoWu();
        CompanyFactory companyFactory = new CompanyFactory(xiaoMing,xiaoWu);
        XiaoMing company = companyFactory.createCompany();
        company.yaoZhang();
    }
    

}