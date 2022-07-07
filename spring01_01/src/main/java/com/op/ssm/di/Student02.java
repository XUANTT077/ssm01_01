package com.op.ssm.di;

/**
 * @version : 1.0
 * @File : com.op.ssm.ioc.Student
 * @Author : cjgong
 * @Time : 2022/5/28 14:42
 * @desc :
 */

public class Student02 {
    private int id;
    private String name;
    private int age;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student01{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
