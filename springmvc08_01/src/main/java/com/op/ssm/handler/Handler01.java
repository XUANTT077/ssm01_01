package com.op.ssm.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version : 1.0
 * @File : com.op.ssm.handler.Handler02
 * @Author : cjgong
 * @Time : 2022/6/19 16:33
 * @desc :
 */
@Controller
@Slf4j
public class Handler01 {
    /*
    * 八大基本类型：
    *
    * */
    @RequestMapping(value="/handler01/mehtod01",method = RequestMethod.GET)
    public @ResponseBody String method01(int p1,boolean p2,@RequestParam("p4") double p3){
        log.info(p1+"");
        log.info(p2+"");
        log.info(p3+"");

        return "succcess";
    }
    @RequestMapping(value="/handler01/mehtod02",method = RequestMethod.GET)
    public @ResponseBody String method02(Integer p1,boolean p2,@RequestParam(value = "p4",required = false) Double p3){
        log.info(p1+"");
        log.info(p2+"");
        log.info(p3+"");
        return "succcess";
    }
    //字符串类型
    @RequestMapping(value="/handler01/mehtod03",method = RequestMethod.GET)
    public @ResponseBody String method03(String p1,String p2){
        log.info(p1+"");
        log.info(p2+"");
        return "succcess";
    }

}
