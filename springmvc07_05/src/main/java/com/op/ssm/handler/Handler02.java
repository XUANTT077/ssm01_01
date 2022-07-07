package com.op.ssm.handler;

import com.sun.org.apache.xpath.internal.operations.Mod;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
public class Handler02 {

    @RequestMapping(value="/handler02/mehtod01",method = RequestMethod.GET)
    public @ResponseBody String method01(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        log.info(request.toString());
        log.info(response.toString());
        log.info(session.toString());

        return "succcess";
    }
    /*
    *  都表示域，与Servlet里的request域一样。
    *
    *
    * */
    @RequestMapping(value="/handler02/mehtod02",method = RequestMethod.GET)
    public @ResponseBody String method02(ModelAndView modelAndView, ModelMap modelMap, Model model, Map map){
        log.info(modelAndView.getClass().getName());
        log.info(modelMap.getClass().getName());
        log.info(model.getClass().getName());
        log.info(map.getClass().getName());

        return "succcess";
    }
}
