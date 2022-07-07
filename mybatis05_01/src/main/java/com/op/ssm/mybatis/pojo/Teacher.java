package com.op.ssm.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

/**
 * @version : 1.0
 * @File : com.op.ssm.mybatis.pojo.Teacher
 * @Author : cjgong
 * @Time : 2022/6/12 10:20
 * @desc :
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Alias("abc")
public class Teacher {
    private int teacher_id;
    private String teacher_name;
    private int teacher_age;

}
