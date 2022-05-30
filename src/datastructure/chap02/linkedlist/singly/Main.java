package datastructure.chap02.linkedlist.singly;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        // 연결 리스트 생성
        SimpleLinkedList list = new SimpleLinkedList();

//        for (int i = 0; i < 6; i++) {
//            list.insert((int) (Math.random() * 45 + 1));
//        }

        list.insert(3);
        list.insert(5);
        list.insert(22);
        list.insert(1);
        list.insert(17);
        list.insert(18);

        System.out.println(list.printList());

        list.remove(5);
        list.remove(1);
        list.remove(22);
        System.out.println(list.printList());

        System.out.println("==================");

        // 연결리스트
        LinkedList linkedList = new LinkedList();

        // 데이터 추가
        linkedList.add(3);
        linkedList.add(10);
        linkedList.add(15);
        linkedList.add(21);

        // 데이터 삭제
        linkedList.remove(3);

        System.out.println(linkedList);

    }
}
