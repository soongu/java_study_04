package com.kh.example.practice4.model.vo;

public class Student {

    int grade; // 학년
    int classroom; // 학급
    String name;
    double height; // 키
    char gender;

    public Student() {

    }
    public Student(int g, int c,
                   String n, double h,
                   char ge) {
        grade = g;
        classroom = c;
        name = n;
        height = h;
        gender = ge;
    }
    public void information() {
        System.out.printf("%d학년 %d반 %s 정보: 키 - %.2fCM, 성별 - %c\n"
                            , grade, classroom, name, height, gender);
    }
}
