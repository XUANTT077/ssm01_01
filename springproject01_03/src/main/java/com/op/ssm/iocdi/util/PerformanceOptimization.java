package com.op.ssm.iocdi.util;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;


//性能优化
@Slf4j
public class PerformanceOptimization {
    public  void  start(JoinPoint joinpoint){
        String className = joinpoint.getTarget().getClass().getName();
        String methodName = joinpoint.getSignature().getName();
        long time = System.currentTimeMillis();
        log.info("类"+className+"里方法"+methodName+"开始执行，时间为："+time+"。");
    }

    public  void  end(JoinPoint joinpoint){
        String className = joinpoint.getTarget().getClass().getName();
        String methodName = joinpoint.getSignature().getName();
        long time = System.currentTimeMillis();
        log.info("类"+className+"里方法"+methodName+"结束执行，时间为："+time+"。");
    }
}
