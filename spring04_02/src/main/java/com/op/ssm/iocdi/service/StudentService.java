package com.op.ssm.iocdi.service;

import com.op.ssm.iocdi.pojo.Student;

/**
 * @version : 1.0
 * @File : com.op.ssm.iocdi.service.StudentService
 * @Author : cjgong
 * @Time : 2022/5/29 15:57
 * @desc :
 */
public interface StudentService {
    int register(Student student);

    boolean transferAccounts(Student student01, Student student02, double salary);
}
