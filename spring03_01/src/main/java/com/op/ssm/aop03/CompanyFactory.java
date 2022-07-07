package com.op.ssm.aop03;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @version : 1.0
 * @File : com.op.ssm.aop02.CompanyFactory
 * @Author : cjgong
 * @Time : 2022/6/4 10:23
 * @desc :
 */
public class CompanyFactory implements MethodInterceptor {
    private XiaoMing xiaoMing;
    private XiaoWu xiaoWu;


    public CompanyFactory() {
    }

    public CompanyFactory(XiaoMing xiaoMing, XiaoWu xiaoWu) {
        this.xiaoMing = xiaoMing;
        this.xiaoWu = xiaoWu;
    }

    /*
    * 创建要账公司
    *
    * */
    public XiaoMing createCompany(){
        // 创建一个替小明要账的要账公司
        //可以通过Enhancer对象中的create()方法可以去生成一个类，用于生成代理对象
        Enhancer enhancer=new Enhancer();
        //设置父类(将目标类作为代理类的父类)
        enhancer.setSuperclass(xiaoMing.getClass());
        //设置拦截器(回调对象为本身对象)
        enhancer.setCallback(this);
        //生成一个代理类对象并返回给调用着
        return (XiaoMing) enhancer.create();
    }

    // 设置要账公司里的方法的功能
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        this.xiaoWu.befor();
        Object result=  methodProxy.invoke(this.xiaoMing,objects);
        this.xiaoWu.after();
        return result;
    }
}
