package com.op.ssm.mybatis.mapper;

import com.op.ssm.mybatis.pojo.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("def")
public interface TeacherDao {
    List<Teacher> selectTable02();

    /*
    * 入参的各种类型:
     */
    //入参为基本类型+字符串  value
    Teacher selectTable01(int teacher_id);
    //入参为javabean类型   属性名字
    Teacher selectTable03(Teacher teacher);
    //容器类型    数组  array
    int insertTable01(String[] teacherNameArray);
    //容器类型    列表   list
    int insertTable02(List<String> teacherNameList);
    // 容器类型   map    key
    List<Teacher> selectTable04(Map<String, Integer> map);
    /*
    * 接口里如果有多个参数，在sql语句里获取不到多个参数的值
    *  方案1：把多个参数转化为map类
    *       map  teacher_id  teacher_age  参数的名字就是map的key值
    * */
    //Teacher selectTable05(int teacher_id ,int teacher_age);
    int insertTable03(List<Teacher> teacherNameArray);

    // 容器类型   map    key
    List<Teacher> selectTable05(int[] teacherIdArray);

    int updateTable01(Teacher teacher);
}
