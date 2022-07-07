package com.op.ssm.aop01;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class Movie {
    /*
     *1：电仪的质量比较好
     * -1：电影质量不好
     * -2：电影院的环境不好
     *
     * */
    private int state;

    public void filmRelease() throws PoorFilmQualityException, EnvironmentDifferenceException {
        log.info("电影开始播放，、、、");
        if (this.state == 1) {
            log.info("电影正在放映中，、、、");
        } else if (this.state == -1) {
            log.info("电影质量不好，观众不想看。、、、");
            throw new PoorFilmQualityException("电影质量不好异常");
        } else if (this.state == -2) {
            log.info("小孩哭闹，打闹、、、");
            throw new EnvironmentDifferenceException("电影院环境比较差");
        }
        log.info("电影结束播放，、、、");
    }

}
