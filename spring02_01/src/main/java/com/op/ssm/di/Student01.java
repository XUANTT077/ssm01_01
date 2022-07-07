package com.op.ssm.di;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

/**
 * @version : 1.0
 * @File : com.op.ssm.di.Student
 * @Author : cjgong
 * @Time : 2022/5/29 9:55
 * @desc :
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student01 {
    private int id;
    private String name;
    private Date birthday;
    private Properties properties;
    private int[]  intArray;
    private List<Date> dateList;
    private Set<String>  strSet;
    private Map<String,String> strMap;
}
