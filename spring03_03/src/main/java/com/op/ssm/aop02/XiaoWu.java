package com.op.ssm.aop02;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @version : 1.0
 * @File : com.op.ssm.aop01.XiaoWu
 * @Author : cjgong
 * @Time : 2022/6/4 10:03
 * @desc :
 */

@Slf4j
@Component("xiaoWu")
@Aspect    //定义切面
public class XiaoWu {
    /*该方法的作用，不是说需要在其他地方调用该方法    而是方便程序员去定义切入点
     *  private
     *  不需要要有返回值和入参
     *  方法名随意
     *  空方法
     */
    @Pointcut("execution(* *..*.*(..))")
    private void XiaoMing_YaoZhang() {
    }

    @Before(value = "XiaoMing_YaoZhang()")
    public void befor() {
        log.debug("XiaoWu>>>befor strat……");
        log.info("恐吓一下。");
        log.debug("XiaoWu>>>befor end……");
    }

    @After(value = "XiaoMing_YaoZhang()")
    public void after() {
        log.debug("XiaoWu>>>befor after……");
        log.info("警告一下，不要报警。");
        log.debug("XiaoWu>>>befor after……");

    }
}
