package com.op.ssm.aop02;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @version : 1.0
 * @File : com.op.ssm.aop01.XiaoMing
 * @Author : cjgong
 * @Time : 2022/6/4 9:58
 * @desc :
 */
@Slf4j
@Component("xiaoMing")
public class XiaoMing implements YaoZhang {
    @Override
    public void yaoZhang() {
        log.debug("XiaoMing>>>yaoZhang start……");
        log.info("还我1000元");
        log.debug("XiaoMing>>>yaoZhang end……");
    }
}
