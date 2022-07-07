package com.op.ssm.aop03;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

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
    public List<Integer> yaoZhang() {
        log.info("还我1000元");
        List<Integer> result=new ArrayList<>();
        result.add(1000);
        return result;
    }
}
