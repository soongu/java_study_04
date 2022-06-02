package datastructure.chap02.linkedlist.doubly;

// 양방향 연결리스트 - 이중 연결 리스트
public class DoublyLinkedList {

    private SentinelNode sentinel;

    public DoublyLinkedList() {
        sentinel = new SentinelNode();
    }

    // 리스트에 노드를 추가하는 메서드
    public void add(int data) {
        // 새로운 노드 생성
        Node newNode = new Node(data);

        // 삽입 위치 탐색
        Node current = sentinel.getFirstNode();
        Node prev = null;

        while (current != null && data > current.getData()) {
            prev = current;
            current = current.getNextNode();
        }

        // 링크 처리
        // 빈 리스트인 경우
        if (sentinel.isEmpty()) {
            // 감시 노드가 새로운 노드를 기억하도록 설정
            sentinel.setFirstNode(newNode);
            sentinel.setLastNode(newNode);
        }
        // 새로운 노드가 맨 처음 위치에 삽입되는 경우
        else if (sentinel.getFirstNode() == current) {
            // 새로운 노드의 다음 노드로 기존 첫 노드를 설정
            newNode.setNextNode(sentinel.getFirstNode());
            sentinel.setFirstNode(newNode);
        }
        // 새로운 노드가 맨 마지막 위치에 삽입되는 경우
        else if (current == null) {
            prev.setNextNode(newNode);
            newNode.setPrevNode(prev);
            sentinel.setLastNode(newNode);
        }
        // 새로운 노드가 중간 위치에 삽입되는 경우
        else {
            newNode.setNextNode(current);
            newNode.setPrevNode(prev);
            prev.setNextNode(newNode);
            current.setPrevNode(newNode);
        }
    }

}
