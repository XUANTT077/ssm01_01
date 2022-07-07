package com.op.ssm.di;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @version : 1.0
 * @File : com.op.ssm.di.Student02
 * @Author : cjgong
 * @Time : 2022/5/29 10:54
 * @desc :
 */

//@NoArgsConstructor
//@AllArgsConstructor
//@Data
    @Component
public class Student02 {
    private int id;
    private String name;

    public void student_init(){
        System.out.println("初始化方法被调用！");
    }
    public void student_destroy(){
        System.out.println("销毁方法被调用！");
    }

    public Student02() {
    }

    public Student02(int id, String name) {
        this.id = id;
        this.name = name;
    }


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student02 student02 = (Student02) o;
        return id == student02.id && Objects.equals(name, student02.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
