package datastructure.chap05.solution;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 큐_문제_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>(); // 큐 생성
        int N = sc.nextInt(); // 카드의 수
        sc.close();
        for (int i = 1; i <= N; i++) {
            queue.add(i); // 큐에 데이터 추가기능 (insert)
        }

        while (queue.size() > 1) { // 카드가 1장 남을 때까지
            queue.poll(); // 맨 위 카드를 버림
            queue.add(queue.poll()); // 맨 위 카드를 버리면서 맨 끝에 추가
        }
        System.out.println(queue.poll());
    }
}
