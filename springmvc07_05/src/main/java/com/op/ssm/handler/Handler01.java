package com.op.ssm.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @version : 1.0
 * @File : com.op.ssm.handler.Handler01
 * @Author : cjgong
 * @Time : 2022/6/19 14:36
 * @desc :
 */
// 把处理器注册到spring对象池里
@Controller
public class Handler01  {

    // 设置方法负责处理的请求
    @RequestMapping(value="/handleRequest.action",method = RequestMethod.GET)
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.write("hello springmvc");
    }
}
