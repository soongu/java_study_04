package com.kh.example.practice6.model.vo;

public class Book {

    String title; //책 제목
    String publisher; //출판사
    String author; //작가
    int price; //책 가격
    double discountRate; //할인율

    public Book() {
    }

    public Book(String title, String publisher, String author) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }

    public Book(String title, String publisher, String author, int price, double discountRate) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
        this.discountRate = discountRate;
    }

    public void inform() {
        System.out.println("제목: " + title);
        System.out.println("출판사: " + publisher);
        System.out.println("작가명: " + author);
        System.out.println("가격: " + price);
        System.out.println("할인율: " + discountRate);
    }
}
