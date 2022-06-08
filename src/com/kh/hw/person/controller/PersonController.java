package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {

    private Student[] s;
    private Employee[] e;

    public PersonController() {
        s = new Student[3];
        e = new Employee[10];
    }

    public int[] personCount() {
        int[] counts = new int[2];
        for (int i = 0; i < s.length; i++) {
            if (s[i] != null) {
                counts[0]++;
            }
        }
        for (int i = 0; i < e.length; i++) {
            if (e[i] != null) {
                counts[1]++;
            }
        }
        return counts;
    }

    public void insertStudent(String name, int age, double height, double weight, int grade, String major) {

        for (int i = 0; i < s.length; i++) {
            if (s[i] == null) {
                s[i] = new Student(name, age, height, weight, grade, major);
                return;
            }
        }
    }

    public Student[] printStudent() {
        return s;
    }

    public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {

        for (int i = 0; i < e.length; i++) {
            if (e[i] == null) {
                e[i] = new Employee(name, age, height, weight, salary, dept);
                return;
            }
        }
    }

    public Employee[] printEmployee() {
        return e;
    }
}
