package com.kh.practice.chap01_poly.controller;


import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

import java.util.LinkedList;
import java.util.Queue;

public class LibraryController {

    private Member mem; // 회원정보
    private Book[] bList; // 모든 책 정보

    // 필요한 상수 선언
    public static final int RENT_FAIL = 1;
    public static final int RENT_SUCCESS = 0;
    public static final int RENT_SUCCESS_WITH_COUPON = 2;

    public LibraryController() {
        bList = new Book[5];

        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
    }

    // 회원 가입 기능
    public void insertMember(Member mem) {
        this.mem = mem;
    }

    // 회원정보 조회기능
    public Member myInfo() {
        return this.mem;
    }
    // 도서 전체 목록 조회 기능
    public Book[] selectAll() {
        return this.bList;
    }

    // 제목으로 도서 검색 기능
    public Book[] searchBook(String keyword) {

        // 검색된 책들을 담아둘 큐를 생성
        Queue<Book> bookQueue = new LinkedList<>();

        // 책 검색 시작
        for (Book book : bList) {
            if (book.getTitle().contains(keyword)) {
                bookQueue.add(book);
            }
        }

        Book[] searchedList = new Book[bookQueue.size()];
        for (int i = 0; i < searchedList.length; i++) {
            searchedList[i] = bookQueue.poll();
        }
        return searchedList;
    }

    // 도서 대여 기능

    /**
     *
     * @param index - 대여할 책의 인덱스번호
     * @return 단순 대여 성공 - 0
     *         만화책 나이제한 대여 실패 - 1
     *         요리책 대여성공 + 쿠폰 발급 - 2
     */
    public int rentBook(int index) {
        Book book = bList[index];

        // 책 정보 판단
        if (book instanceof AniBook) {
            AniBook aniBook = (AniBook) book;
            // 나이 검사
            if (aniBook.getAccessAge() <= mem.getAge()) {
                // 만화책을 빌릴 수 있는 경우
                return RENT_SUCCESS;
            }
        } else if (book instanceof CookBook) {
            CookBook cookBook = (CookBook) book;
            if (cookBook.isCoupon()) {
                // 쿠폰제공하는 경우
                mem.setCouponCount(mem.getCouponCount() + 1);
                return RENT_SUCCESS_WITH_COUPON;
            } else {
                return RENT_SUCCESS;
            }
        }
        return RENT_FAIL;
    }

}
