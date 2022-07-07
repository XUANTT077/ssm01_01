package com.op.ssm.aop01;

/**
 * @version : 1.0
 * @File : com.op.ssm.aop01.Company
 * @Author : cjgong
 * @Time : 2022/6/4 9:58
 * @desc :
 */

public class Company implements YaoZhang {
    private  XiaoWu xiaoWu;
    private  YaoZhang xiaoMing;


    public Company() {
    }

    public Company(XiaoWu xiaoWu, YaoZhang xiaoMing) {
        this.xiaoWu = xiaoWu;
        this.xiaoMing = xiaoMing;
    }

    @Override
    public void yaoZhang() {
        xiaoWu.befor();
        xiaoMing.yaoZhang();
        xiaoWu.after();
    }
}
