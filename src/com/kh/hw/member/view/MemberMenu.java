package com.kh.hw.member.view;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;
import day09.objarr.Account;
import day09.objarr.Person;

import java.util.Scanner;

public class MemberMenu {

    private Scanner sc = new Scanner(System.in);

    private MemberController mc = new MemberController();

    // 메인 메뉴 출력 메서드
    public void mainMenu() {

        while (true) {
            System.out.printf("\n# 최대 등록 가능한 회원수는 %d명입니다.\n", mc.SIZE);

            int count = mc.existMemberNum();
            System.out.printf("# 현재 등록된 회원 수는 %d명입니다.\n", count);

            System.out.println("======================================");

            System.out.println("# 1. 새 회원 등록");
            System.out.println("# 2. 회원 검색");
            System.out.println("# 3. 회원 정보 수정");
            System.out.println("# 4. 회원 삭제");
            System.out.println("# 5. 모두 출력");
            System.out.println("# 9. 끝내기");

            System.out.print("\n# 메뉴 번호: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    // 회원가입 진행
                    insertMember();
                    break;
                case 2:
                    // 회원 검색
                    break;
                case 3:
                    // 정보 수정
                    break;
                case 4:
                    // 회원 탈퇴
                    break;
                case 5:
                    // 전체 조회 출력
                    printAll();
                    break;
                case 9:
                    // 프로그램 종료
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0); // 프로세스 종료
                    break;
                default:
                    System.out.println("잘못 입력했습니다. 다시 입력하세요!");
            }
        }
    }

    // 5번 메뉴 처리 메서드
    private void printAll() {

        Member[] members = mc.printAll();

        System.out.println("\n========== 전체 회원 정보 =============");
        for (Member m : members) {
            if (m == null) break;
            System.out.println(m.inform());
        }

    }

    // 1번 메뉴 처리 메서드
    private void insertMember() {

        System.out.println("\n# 새 회원을 등록합니다.");

        String id = null;
        while (true) {
            id = inputStr("- 아이디: ");
            if (!mc.checkId(id)) break;
            System.out.println("- 중복된 아이디입니다!");
        }
        String name = inputStr("- 이름: ");
        String password = inputStr("- 비밀번호: ");
        String email = inputStr("- 이메일: ");
        char gender = inputStr("- 성별(M/F): ").toUpperCase().charAt(0);
        int age = inputNumber("- 나이: ");

        mc.insertMember(id, name, password, email, gender, age);

        System.out.println("\n# 회원가입 성공!");


    }

    // 입력처리를 간단하게 만드는 메서드
    private String inputStr(String msg) {
        System.out.printf(msg);
        return sc.next();
    }
    private int inputNumber(String msg) {
        System.out.printf(msg);
        return sc.nextInt();
    }
}
