package com.op.ssm.mybatis.mapper;

import com.op.ssm.mybatis.pojo.Dept;

/**
 * @version : 1.0
 * @File : com.op.ssm.mybatis.mapper.DeptDao
 * @Author : cjgong
 * @Time : 2022/6/12 14:51
 * @desc :
 */
public interface DeptDao {
    Dept selectTable01(int id);
    Dept selectTable02(int id);

    int insertTable01(Dept dept);
}
