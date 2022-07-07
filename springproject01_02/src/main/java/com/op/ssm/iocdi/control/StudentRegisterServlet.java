package com.op.ssm.iocdi.control; /**
 * @File : ${PACKAGE_NAME}.${NAME}
 * @Author : cjgong
 * @version : 1.0
 * @Time : 2022/5/29 16:02
 * @desc :
 */

import com.op.ssm.iocdi.pojo.Student;
import com.op.ssm.iocdi.service.StudentService;
import com.op.ssm.iocdi.service.StudentServiceImp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

import static org.springframework.web.context.support.WebApplicationContextUtils.getWebApplicationContext;

/*
* servlet是由tomat服务器来创建的
*
*
* */
@WebServlet(name = "StudentRegisterServlet", value = "/studentregisterservlet")
@Slf4j
public class StudentRegisterServlet extends HttpServlet {
    private StudentService studentService;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.debug("StudentRegisterServlet>>>doPost start ……");
        //  获取学生信息
        String student_name = request.getParameter("student_name");
        String student_age_str = request.getParameter("student_age");
        // 把学生信息封装到javabean
        Student student = Student.builder().student_name(student_name).student_age(Integer.parseInt(student_age_str)).build();

        // 获取springbean对象池里的StudentService类型对象
        // 最后需要把它赋值给成员变量
        ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        studentService = (StudentService)ac.getBean("studentService");

        // 调用服务层方法，服务层方法调用dao层方法把数据插入到数据库
        int result = studentService.register(student);

        log.debug("StudentRegisterServlet>>>doPost end ……");
        // 页面跳转
        if(result>0){
            response.sendRedirect(request.getContextPath()+"/register_success.jsp");

        }else{
            response.sendRedirect(request.getContextPath()+"/register_fail.jsp");
        }


    }
}
