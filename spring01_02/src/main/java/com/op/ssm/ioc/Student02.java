package com.op.ssm.ioc;

/**
 * @version : 1.0
 * @File : com.op.ssm.ioc.Student
 * @Author : cjgong
 * @Time : 2022/5/28 14:42
 * @desc :
 */

public class Student02 {
   private static Student02 instance=new Student02();

    private Student02() {
    }

    public  static  Student02  getInstance(){
        return instance;
    }

    @Override
    public String toString() {
        return "Student02{}";
    }
}
