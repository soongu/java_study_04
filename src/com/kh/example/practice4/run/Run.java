package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run {

    public static void main(String[] args) {

        Student park = new Student(5, 3, "박영희", 155.33, 'F');
        park.information();
    }
}
