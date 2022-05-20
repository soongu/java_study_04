package day03;

import java.util.Scanner;

public class SwitchQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("### 직급을 입력하세요. ###");
        System.out.println("[ 사원, 대리, 과장, 차장, 부장 ]");
        System.out.print(">> ");
        String position = sc.next();
        sc.close();

        int basic = 200;
        switch (position) {
            case "사원":
                System.out.printf("%s의 급여는 %d만원입니다\n", position, basic);
                break;
            case "대리":
                System.out.printf("%s의 급여는 %d만원입니다\n", position, basic + 100);
                break;
            case "과장":
                System.out.printf("%s의 급여는 %d만원입니다\n", position, basic + 200);
                break;
            case "차장":
                System.out.printf("%s의 급여는 %d만원입니다\n", position, basic + 300);
                break;
            case "부장":
                System.out.printf("%s의 급여는 %d만원입니다\n", position, basic + 400);
                break;
            default:
                System.out.printf("%s(은)는 없는 직급입니다.\n", position);
        }
    }
}
