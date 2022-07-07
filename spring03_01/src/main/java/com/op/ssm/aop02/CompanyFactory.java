package com.op.ssm.aop02;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @version : 1.0
 * @File : com.op.ssm.aop02.CompanyFactory
 * @Author : cjgong
 * @Time : 2022/6/4 10:23
 * @desc :
 */
public class CompanyFactory implements InvocationHandler {
    private   YaoZhang  xiaoMing;
    private   XiaoWu xiaoWu;


    public CompanyFactory() {
    }

    public CompanyFactory(YaoZhang xiaoMing, XiaoWu xiaoWu) {
        this.xiaoMing = xiaoMing;
        this.xiaoWu = xiaoWu;
    }

    /*
    * 创建要账公司
    *
    * */
    public YaoZhang  createCompany(){
        // 创建一个替小明要账的要账公司
        YaoZhang company = (YaoZhang)Proxy.newProxyInstance(xiaoMing.getClass().getClassLoader(), xiaoMing.getClass().getInterfaces(), this);
        return company;
    }

    // 设置要账公司里的方法的功能
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.xiaoWu.befor();
        Object result = method.invoke(this.xiaoMing, args);     // 执行小明的方法
        this.xiaoWu.after();
        return result;
    }
}
