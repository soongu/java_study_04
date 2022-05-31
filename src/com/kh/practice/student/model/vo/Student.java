package com.kh.practice.student.model.vo;

public class Student {

    //==== 필드 ====//
    private String name; // 이름
    private String subject; // 과목명
    private int score; // 점수

    //==== 생성자 ====//
    public Student() {
    }

    public Student(String name, String subject, int score) {
        this.name = name;
        this.subject = subject;
        this.score = score;
    }

    //==== 메서드 영역 ====//

    public String inform() {
        return String.format("이름: %s / 과목: %s / 점수: %d점", name, subject, score);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
