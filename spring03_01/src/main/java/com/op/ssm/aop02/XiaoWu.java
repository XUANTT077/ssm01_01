package com.op.ssm.aop02;

import lombok.extern.slf4j.Slf4j;

/**
 * @version : 1.0
 * @File : com.op.ssm.aop01.XiaoWu
 * @Author : cjgong
 * @Time : 2022/6/4 10:03
 * @desc :
 */

@Slf4j
public class XiaoWu {

    public  void befor(){
        log.debug("XiaoWu>>>befor strat……");
        log.info("恐吓一下。");
        log.debug("XiaoWu>>>befor end……");
    }
    public void after(){
        log.debug("XiaoWu>>>befor after……");
        log.info("警告一下，不要报警。");
        log.debug("XiaoWu>>>befor after……");

    }
}
