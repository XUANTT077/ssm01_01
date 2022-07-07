package com.op.ssm.mybatis.mapper;

import com.op.ssm.mybatis.pojo.Teacher;

import java.util.List;

/**
 * @version : 1.0
 * @File : com.op.ssm.mybatis.mapper.TeacherDao
 * @Author : cjgong
 * @Time : 2022/6/12 10:22
 * @desc :
 */

public interface TeacherDao {
    int insertTable(Teacher teacher);
    /*获取mysql服务器端自动插入的主键值*/
    void insertTable01(Teacher teacher);
    void insertTable02(Teacher teacher);
    /*
    * 批量插入
    * */
    int insertTable03(Teacher[] teacherArray);
    void insertTable04(Teacher[] teacherArray);

    int updateTable01(Teacher teacher);


    int deleleTable01(int id);
    void deleteTable02();


    Teacher selecttable01(int id);
    List<Teacher> selectTable02();





}
