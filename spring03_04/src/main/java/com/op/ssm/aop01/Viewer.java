package com.op.ssm.aop01;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;

@Slf4j
public class Viewer {

    public void before() {
        log.info("所有观众鼓掌...");
    }

    public void throwAdvice(Exception exception) throws Exception {
        if (exception instanceof PoorFilmQualityException) {
            log.info("停止电影播放，退还电影票钱");
        } else if (exception instanceof EnvironmentDifferenceException) {
            log.info("保安要维持秩序");
        } else {
            log.info("没办法处理，上报上一层领导");
            throw exception;
        }

    }

    public void afterReturningAdvice() {
        log.info("所有观众起来");
        log.info("鼓掌十分钟....");
        log.info("所有观众依次离场....");
    }

    public void afterFinallyAdvice() {
        log.info("保洁阿姨打扫卫生，为下一场做准备...");
    }

    public Object aroundaAdvice(ProceedingJoinPoint pjp) throws Throwable {
        Object retVal = null;
        try {
            this.before();
            retVal = pjp.proceed();//执行目标类的方法（还行movie的方法）
            this.afterReturningAdvice();
        } catch (Exception throwable) {
            this.throwAdvice( throwable);
            throwable.printStackTrace();
        } finally {
            this.afterFinallyAdvice();
        }

        return retVal;
    }
}
