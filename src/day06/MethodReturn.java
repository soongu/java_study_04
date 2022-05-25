package day06;

import java.util.Arrays;

public class MethodReturn {

    static int add(int n1, int n2) {
        return n1 + n2;
        // System.out.println("dd");
    }

    // 두 개의 정수의 합을 출력하는 함수
    static void showAddResult(int n1, int n2) {
        System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
    }

    static void callName(String name) {
        if (name.length() > 5) {
            System.out.println("이름이 너무 길어 즐~~");
            return; // 함수 탈출문
        }
        System.out.printf("%s 하위~~\n", name);
    }

    /*
        # 모든 함수의 리턴값은 반드시 1개다.

        - 5개의 애완동물 이름목록에서 원하는 숫자를 전달하면
         그 숫자만큼 랜덤으로 애완동물리스트를 뽑아서 리턴하는 함수
     */
    static String[] selectPet(int count) {

        // 매개변수 검증
        if (count < 1 || count > 5) {
            return null;
        }

        String[] petList = {"멍멍이", "짹짹이", "꽥꽥이", "찍찍이", "꾸러긔"};

        // 랜덤선택한 애완동물이 저장될 배열
        String[] selected = new String[count];
        for (int i = 0; i < count; i++) {
            int rn = (int) (Math.random() * petList.length);
            selected[i] = petList[rn];
        }
        return selected;
    }

    public static void main(String... args) {

        int r1 = add(10, 20);
        System.out.println(r1);

        int r2 = r1 * 3 + r1--;

        // 리턴이 없는 void타입 함수는 변수에 저장할 수 없다
        showAddResult(3, 8);

        System.out.println();
        double random = Math.random();

        // add(30, add(5,5)); - 1차 호출
        // add(30, 10);  -- 2차 호출
        // 40  -- 3차 호출
        int r4 = add(add(10, 20), add(5, 5));
        System.out.println("r4 = " + r4);

        showAddResult(add(4, 4), add(5, 7));

        System.out.println("===================");

        callName("짝짝이");
        callName("주차왕파킹맨");

        System.out.println("===================");

        String[] selectPet = selectPet(-2);
        System.out.println(Arrays.toString(selectPet));


    }
}
