package com.op.ssm.iocdi.dao;

import com.op.ssm.iocdi.pojo.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @version : 1.0
 * @File : com.op.ssm.iocdi.dao.StudentDaoImp
 * @Author : cjgong
 * @Time : 2022/5/29 15:50
 * @desc :
 */
@Slf4j
@Repository("studentDao")
public class StudentDaoImp implements StudentDao {

    @Override
    public int insertTable(Student student){
        log.debug("StudentDaoImp>>>insertTable start ……");
        log.info("所影响的行数为：3");
        log.debug("StudentDaoImp>>>insertTable end ……");
        return 3;
    }
    @Override
    public int updateTable(Student student){
        log.debug("StudentDaoImp>>>updateTable start ……");
        log.info("所影响的行数为：3");
        log.debug("StudentDaoImp>>>updateTable end ……");
        return 3;
    }
    @Override
    public int deleteTable(Student student){
        log.debug("StudentDaoImp>>>deleteTable start ……");
        log.info("所影响的行数为：3");
        log.debug("StudentDaoImp>>>deleteTable end ……");
        return 3;
    }
    @Override
    public List<Student> selectTable(){
        log.debug("StudentDaoImp>>>selectTable start ……");
        log.debug("StudentDaoImp>>>selectTable end ……");
        return new ArrayList<Student>();
    }
}
