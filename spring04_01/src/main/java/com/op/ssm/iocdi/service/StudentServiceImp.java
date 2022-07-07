package com.op.ssm.iocdi.service;

import com.op.ssm.iocdi.dao.StudentDao;
import com.op.ssm.iocdi.dao.StudentDaoImp;
import com.op.ssm.iocdi.pojo.Student;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @version : 1.0
 * @File : com.op.ssm.iocdi.service.StudentServiceImp
 * @Author : cjgong
 * @Time : 2022/5/29 15:55
 * @desc :
 */
@Slf4j
@Data
public class StudentServiceImp implements StudentService {
    private StudentDao studentDao;

    @Override
    public int register(Student student){
        log.debug("StudentServiceImp>>>register start ……");
        int result = studentDao.insertTable(student);
        log.debug("StudentServiceImp>>>end ……");
        return result;
    }

    @Override
    public boolean transferAccounts(Student student01,Student student02,double salary){
        log.debug("StudentServiceImp>>>transferAccounts start ……");
        boolean result=false;
        int num01 = studentDao.updateTable(student01, -salary);
        int i=6/0;
        int num02 = studentDao.updateTable(student02, salary);
        if(num01>0 &&num02>0){
            result=true;
        }
        log.debug("StudentServiceImp>>>transferAccounts end ……");
        return result;
    }
}
