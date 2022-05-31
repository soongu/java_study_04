package com.kh.hw.member;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class Test {

    public static void main(String[] args) {

        MemberController mc = new MemberController();

//        System.out.println(mc.existMemberNum());
//
//        int index = mc.findIndexById("ghi1234");
//        System.out.println("index = " + index);
//
//        System.out.println(mc.checkId("def1"));

        /*mc.insertMember("zzz", "김출수",
                "1111", "ㅁㅁ",
                'M', 33);

        mc.insertMember("zdz", "김출수",
                "1111", "ㅁㅁ",
                'M', 33);

        System.out.println(mc.existMemberNum()); // 5
        System.out.println(mc.checkId("zdz")); // true*/

//        Member member = mc.searchId("ghi");
//        System.out.println(member.inform());

//        Member[] members = mc.searchName("박영희");
//        for (Member m : members) {
//            System.out.println(m.inform());
//        }

        Member member = mc.searchId("abc");
        System.out.println(member.inform());

        mc.updateName("abc","냥냥이");
        mc.updateEmail("abc", "djskfjsdk@dmsfmd.com");

        member = mc.searchId("abc");
        System.out.println(member.inform());

    }
}
