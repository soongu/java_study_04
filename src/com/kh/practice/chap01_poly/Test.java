package com.kh.practice.chap01_poly;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;
import utility.Util;

public class Test {

    public static void main(String[] args) {

        LibraryController lc = new LibraryController();

        // 회원 생성 후 가입
        lc.insertMember(new Member("김철수", 15, 'M'));

        // 회원 조회
        System.out.println(lc.myInfo());

        Util.line();

        // 도서 목록 전체 조회
        for (Book book : lc.selectAll()) {
            System.out.println(book);
        }

        Util.line();

        // 도서 검색
        for (Book book : lc.searchBook("얼마나")) {
            System.out.println(book);
        }

    }
}
