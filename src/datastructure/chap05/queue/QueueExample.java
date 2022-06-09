package datastructure.chap05.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        // 큐 생성
        Queue<Integer> que = new LinkedList<>();

        // 큐에 데이터 넣기
        for (int i = 1; i <= 5; i++) {
            que.add(i * 3);
        }
        // 큐의 사이즈 제공
        System.out.println("저장된 개수: " + que.size());

        // 큐에서 하나 삭제
        int removed = que.poll();
        System.out.println("removed = " + removed);

        // 큐 전체 보기
        System.out.println(que.toString());

        // 전체 삭제
        while (!que.isEmpty()) {
            System.out.println(que.poll());
        }

        System.out.println(que);
    }
}
