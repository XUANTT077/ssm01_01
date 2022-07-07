package com.op.ssm.aop03;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @version : 1.0
 * @File : com.op.ssm.aop01.XiaoWu
 * @Author : cjgong
 * @Time : 2022/6/4 10:03
 * @desc :
 */

@Slf4j
@Component("xiaoWu")
@Aspect
public class XiaoWu {

    /*
    * 该方法的作用，不是说需要在其他地方要调用该方法，而是方便程序员去定于切入点
    *     private
    *     不需要有返回值和入参
    *     方法的名字可以随便起
    *     空方法
    * */
    @Pointcut("execution(* *..*.*(..))")
    private void xiaoMing_YaoZhang() {}


    @Before(value="xiaoMing_YaoZhang()")
    public  void befor(JoinPoint joinPoint){
        log.debug("XiaoWu>>>befor strat……");
        log.info("恐吓一下。");
        log.debug("XiaoWu>>>befor end……");
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();

        log.debug(""+className+">>>"+methodName+" start……");
    }
    @After(value="xiaoMing_YaoZhang()")
    public void after(JoinPoint joinPoint){
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        log.debug(""+className+">>>"+methodName+" end……");
        log.debug("XiaoWu>>>befor after……");
        log.info("警告一下，不要报警。");
        log.debug("XiaoWu>>>befor after……");

    }

    @AfterReturning(value="xiaoMing_YaoZhang()",returning="p1")
    public List<Integer>   afterReturningAdviceMethod(List<Integer> p1){
        p1.set(0,2000);
        return p1;
    }
}
