package com.op.ssm.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @version : 1.0
 * @File : com.op.ssm.handler.Handler02
 * @Author : cjgong
 * @Time : 2022/6/19 16:33
 * @desc :
 */
@Controller
@Slf4j
public class Handler03 {

    @RequestMapping(value="/handler03/mehtod01",method = RequestMethod.GET)
    public @ResponseBody String method01(int p1,boolean p2,@RequestParam("p4") double p3){
        log.info(p1+"");
        log.info(p2+"");
        log.info(p3+"");

        return "succcess";
    }

}
