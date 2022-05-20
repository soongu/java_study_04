package day03;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("### 여행지 추천 프로그램 ###");
        System.out.println("[ 여행을 원하는 계절을 입력하세요. ]");
        System.out.printf(">> ");
        String season = sc.next();
        sc.close();

        double d = 3.3;
        String name = "초겨울";

        // switch 괄호안에는 정수, 문자형 변수를 씁니다.
        // 분기를 나눌 데이터가 있는 변수
        switch (season) {
            // case에는 switch변수에 들어갈 경우의 수 값들을 배치
            // 단 변수는 배치 불가능, 상수나 리터럴만 가능
            case "봄": case "spring":
                // 현재 케이스에서 실행할 코드 작성
                System.out.println("봄에는 여의도로 가보세요~");
                break; // 코드가 밑으로 흘러가는 것을 방지
            case "여름": case "summer": case "夏":
                System.out.println("여름에는 낙산으로 가보세요~");
                break;
            case "가을":
                System.out.println("가을에는 춘천으로 가보세요~");
                break;
            case "겨울":
                System.out.println("겨울에는 홍천으로 가보세요~");
                break;
            default: // else기능
                System.out.println("[ 봄, 여름, 가을, 겨울 중 입력하세요! ]");
        }

    }
}
