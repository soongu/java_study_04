package day04;

import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {

        //배열 복사 알고리즘
        String[] pets = {"멍멍이", "짹짹이", "삐약이"};

        // 1. 원본 배열과 사이즈가 같은 새 배열을 하나 더 생성
        String[] petsCopy = new String[pets.length];

        // 2. 원본 배열에 저장된 값들을 하나하나씩 사본배열로 복사
        for (int i = 0; i < pets.length; i++) {
            petsCopy[i] = pets[i];
        }

        pets[1] = "야옹이";
        petsCopy[0] = "어흥이";

        System.out.println("원본배열주소: " + pets);
        System.out.println("사본배열주소: " + petsCopy);

        System.out.println("원본배열: " + Arrays.toString(pets));
        System.out.println("사본배열: " + Arrays.toString(petsCopy));
    }
}
