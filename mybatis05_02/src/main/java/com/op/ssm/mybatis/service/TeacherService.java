package com.op.ssm.mybatis.service;

import com.github.pagehelper.*;
import com.op.ssm.mybatis.pojo.Teacher;

/**
 * @version : 1.0
 * @File : com.op.ssm.mybatis.service.TeacherService
 * @Author : cjgong
 * @Time : 2022/6/12 16:20
 * @desc :
 */
public interface TeacherService {
    /*
     *
     * pageNum:请求的是第几页
     * pageSize:分页单位
     * */
    PageInfo<Teacher> findTeacher(int pageNum, int pageSize);
}
