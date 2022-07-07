package com.op.ssm.di;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
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
@Component("student02")
public class Student02 {
    @Value("1")
    private int id;
    @Value("cjgong01")
    private String name;
/*
* 根据bean对象的id值来注入
*
* */
    @Resource(name="cat01")
    private Cat cat;

/*
* @Autowired
*     根据类型来注入，springbean对象 池该类型的对象应该只有一个，如果超过一个，就会报错。
* @Qualifier
*     根据bean对象的id值来注入。该注解不能单独使用，必须要配合注解Autowired来使用
* */
    @Autowired
    @Qualifier("dog01")
    private Dog dog;

    public Student02() {
    }

    public Student02(int id, String name, Cat cat, Dog dog) {
        this.id = id;
        this.name = name;
        this.cat = cat;
        this.dog = dog;
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


    //public Dog getDog() {
    //    return dog;
    //}
    //
    //public void setDog(Dog dog) {
    //    this.dog = dog;
    //}

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


    @Override
    public String toString() {
        return "Student02{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cat=" + cat +
                ", dog=" + dog +
                '}';
    }

    //public Cat getCat() {
    //    return cat;
    //}
    //
    //public void setCat(Cat cat) {
    //    this.cat = cat;
    //}
}
