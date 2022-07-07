package com.op.ssm.aop02;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @version : 1.0
 * @File : com.op.ssm.aop.Movie
 * @Author : cjgong
 * @Time : 2022/6/4 16:09
 * @desc :
 */

@Slf4j
@Data
@Component("movie")
public class Movie {
    /*
    * 1 :  电影的质量比较好
    * -1：  电影的质量不好
    * -2：  电影的环境不好
    *
    *
    * */
    @Value("-1")
    private int state;


    public void filmRelease() throws PoorFilmQualityException, EnvironmentDifferenceException {
        log.info("电影开始播放，……");
        if(this.state==1){
            log.info("电影正在播放中，……");
        }else if(this.state==-1){
            log.info("电影质量不好，观众不想看……");
            throw new PoorFilmQualityException("电影质量不好异常");
        }else if(this.state==-2){
            log.info("小孩哭闹，打闹……");
            throw new EnvironmentDifferenceException("电影院环境比较差异常");
        }
        log.info("电影结束播放，……");
    }

}
