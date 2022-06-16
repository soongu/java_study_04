package day17.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayDeleteQuiz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] students = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        List<String > tvxqList = new ArrayList<>(Arrays.asList(students));

        System.out.println("* 우리반 학생들의 별명: " + tvxqList);

        while (true) {
            System.out.println("- 삭제할 학생의 별명을 입력하세요! ");
            System.out.print("> ");
            String target = sc.next();

            //탐색
            int index = tvxqList.indexOf(target);

            //찾았는지 확인 후 삭제 진행
            if (index != -1) {
                System.out.println(tvxqList.get(index) + "의 별명을 삭제합니다.");

                //삭제 알고리즘
                tvxqList.remove(index);

                System.out.println("* 삭제 후 정보: " + tvxqList);
                sc.close();
                break;
            } else {
                System.out.printf("해당 별명(%s)은 존재하지 않습니다.\n", target);
            }
        }
    }
}
