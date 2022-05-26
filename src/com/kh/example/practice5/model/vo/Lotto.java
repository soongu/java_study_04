package com.kh.example.practice5.model.vo;

import java.util.Arrays;

public class Lotto {

    int[] lotto;

    public Lotto() {
        lotto = new int[6];
        // 로또번호 6개를 생성하여 배열에 넣는 메서드호출
        makeLotto();
    }

    public void makeLotto() {
        for (int i = 0; i < lotto.length; i++) {
            // 1 ~ 45 범위의 랜덤정수
            int rn = (int) (Math.random() * 45 + 1);
            if (!isDuplicate(rn)) { // 만약 중복숫자가 아니라면
                lotto[i] = rn;
            } else {
                i--; // 중복된 경우
            }
        }
    }

    public boolean isDuplicate(int rn) {
        for (int n : lotto) {
            if (rn == n) return true;
        }
        return false;
    }

    public void information() {
        System.out.println(Arrays.toString(lotto));
    }
}
