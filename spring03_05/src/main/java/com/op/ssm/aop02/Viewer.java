package com.op.ssm.aop02;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @version : 1.0
 * @File : com.op.ssm.aop01.Viewer
 * @Author : cjgong
 * @Time : 2022/6/4 16:10
 * @desc :
 */
@Slf4j
@Component("viewer")
@Aspect
public class Viewer {


    @Pointcut("execution(* com.op.ssm.aop02.Movie.filmRelease(..))")
    private void movie_FilmRelease(){

    };

    public void  before(){
        log.info("所有观众鼓掌，……");
    }

    public void throwingAdvice(Exception exception) throws Exception {
        if(exception instanceof PoorFilmQualityException){
            log.info("停止电影播放，退返回电影票钱");
        }else if(exception instanceof EnvironmentDifferenceException){
            log.info("保安要维持秩序");
        }else{
            log.info("没办法处理，上报上一层领导");
            throw exception;
        }
    }

    public void afterReturningAdvice(){
        log.info("所有观众起来");
        log.info("鼓掌10分钟，……");
        log.info("所有观众依次离场，……");
    }

    public void afterFinallyAdvice(){
        log.info("保洁阿姨打扫卫生，为下一场做准备，……");
    }

    @Around("movie_FilmRelease()")
    public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        Object retVal = null;
        try {
            this.before();
            retVal = pjp.proceed();      //执行目标类的方法（执行电影的方法）
            this.afterReturningAdvice();
        } catch (Exception throwable) {
            this.throwingAdvice(throwable);
            throwable.printStackTrace();
        } finally{
            this.afterFinallyAdvice();
        }
        // stop stopwatch
        return retVal;
    }
}
