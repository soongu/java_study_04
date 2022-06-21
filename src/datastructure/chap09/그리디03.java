package datastructure.chap09;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

// 백준 1715
public class 그리디03 {

    public static void main(String[] args) {

        // 우선순위 큐 - 자동정렬기능
        PriorityQueue<Integer> cardList = new PriorityQueue<>();
        cardList.offer(10);
        cardList.offer(20);
        cardList.offer(40);

        System.out.println(cardList);

        int total = 0;

        Integer n1 = cardList.poll();
        Integer n2 = cardList.poll();
        int e = n1 + n2;
        total += e;
        cardList.offer(e);
        System.out.println(cardList);

        n1 = cardList.poll();
        n2 = cardList.poll();
        e = n1 + n2;
        total += e;
        cardList.offer(e);
        System.out.println(cardList);

        System.out.println("total = " + total);

    }
}
