package com.op.ssm.aop02;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @version : 1.0
 * @File : com.op.ssm.aop02.Aop02Test
 * @Author : cjgong
 * @Time : 2022/6/4 10:39
 * @desc :
 */
public class Aop02Test {

    @Test
    public void testMethod01(){
        YaoZhang xiaoMing = new XiaoMing();
        xiaoMing.yaoZhang();
    }

    @Test
    public void testMethod02(){
        YaoZhang xiaoMing = new XiaoMing();
        XiaoWu xiaoWu = new XiaoWu();
        //创建出来要账公司工厂
        CompanyFactory companyFactory = new CompanyFactory(xiaoMing, xiaoWu);
        // 创建出要账公司
        YaoZhang company = companyFactory.createCompany();
        company.yaoZhang();
    }


}