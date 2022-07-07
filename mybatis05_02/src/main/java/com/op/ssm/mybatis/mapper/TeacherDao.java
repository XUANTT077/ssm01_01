package com.op.ssm.mybatis.mapper;

import com.op.ssm.mybatis.pojo.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("def")
public interface TeacherDao {
    List<Teacher> selectTable02();
}
