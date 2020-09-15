package com.ls.hello;

import com.ls.utils.Student;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("你好，你已经被我修改过了！");
        Student student = new Student();
        student.show();
    }
}
