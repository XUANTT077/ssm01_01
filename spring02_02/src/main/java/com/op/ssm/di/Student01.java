package com.op.ssm.di;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @version : 1.0
 * @File : com.op.ssm.di.Student
 * @Author : cjgong
 * @Time : 2022/5/29 9:55
 * @desc :
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
//@Component(value="student01")
//@Repository(value="student01")
//@Service(value="student01")
//@Controller(value="student01")
@Controller("student01")
public class Student01 {
    private int id;
    private String name;
}

