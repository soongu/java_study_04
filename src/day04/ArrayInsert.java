package day04;

import java.util.Arrays;

public class ArrayInsert {

    public static void main(String[] args) {

        int[] arr = {50, 150, 200, 250, 300};

        int newNumber = 100; // 신규 삽입데이터
        int targetIdx = 1; // 삽입 위치

        // 50, 100, 150, 200, 250, 300

        System.out.println("삽입 전: " + Arrays.toString(arr));

        // 1. 사이즈 1 더 큰 배열 생성
        int[] temp = new int[arr.length + 1];

        // 2. 기존 데이터 전부 복사
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        // 3. 끝데이터부터 뒤로 한칸씩

        for (int i = temp.length - 1; i > targetIdx; i--) {
            temp[i] = temp[i-1];
        }
        /*
        temp[5] = temp[4];
        temp[4] = temp[3];
        temp[3] = temp[2];
        temp[2] = temp[1];*/

        // 4. 새로운 데이터 삽입위치로 수정
        temp[targetIdx] = newNumber;

        // 5. 주소값 변경
        arr = temp; temp = null;

        System.out.println("삽입 후: " + Arrays.toString(arr));
    }
}
