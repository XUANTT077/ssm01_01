package com.op.ssm.aop03;

import lombok.extern.slf4j.Slf4j;

/**
 * @version : 1.0
 * @File : com.op.ssm.aop01.XiaoMing
 * @Author : cjgong
 * @Time : 2022/6/4 9:58
 * @desc :
 */
@Slf4j
public class XiaoMing  {

    public void yaoZhang() {
        log.debug("XiaoMing>>>yaoZhang start……");
        log.info("还我1000元");
        log.debug("XiaoMing>>>yaoZhang end……");
    }
}
