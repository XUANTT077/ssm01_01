package com.op.ssm.di;

/**
 * @version : 1.0
 * @File : com.op.ssm.ioc.Student
 * @Author : cjgong
 * @Time : 2022/5/28 14:42
 * @desc :
 */

public class Student01 {
    private int id;
    private String name;
    private int age;
    private String sex;

    public Student01() {
    }

    public Student01(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // 方便程序员对成员变量赋值
    public Student01(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student01(int id, String name, int age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student01{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
