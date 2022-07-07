package com.op.ssm.iocdi.dao;

import com.op.ssm.iocdi.pojo.Student;

import java.sql.SQLException;
import java.util.List;

/**
 * @version : 1.0
 * @File : com.op.ssm.iocdi.dao.StudentDao
 * @Author : cjgong
 * @Time : 2022/5/29 15:54
 * @desc :
 */
public interface StudentDao {
    int insertTable(Student student);

    int updateTable(Student student,double salary);

    int deleteTable(Student student);

    List<Student> selectTable();
}
