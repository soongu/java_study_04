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

    // 리스트에서 노드를 삭제하는 메서드
    public Node remove(int data) {

        Node current = sentinel.getFirstNode();
        Node prev = null;

        while (current != null && data != current.getData()) {
            prev = current;
            current = current.getNextNode();
        }

        // 삭제 대상이 맨 첫번째 노드인 경우
        if (sentinel.getFirstNode() == current) {
            // 기존의 두번째 노드의 이전노드를 null로
            Node secondNode = current.getNextNode();
            secondNode.setPrevNode(null);
            // 감시노드의 첫번째 노드를 기존의 두번째 노드로 설정
            sentinel.setFirstNode(secondNode);
        }
        // 삭제 대상이 마지막 노드인 경우
        else if (current.getNextNode() == null) {
            prev.setNextNode(null);
            sentinel.setLastNode(prev);
        }
        // 삭제 대상이 중간 노드인 경우
        else {
            // prev : 100번지, current : 200번지,
            // current.getNextNode() : 300번지
            prev.setNextNode(current.getNextNode());
            current.getNextNode().setPrevNode(prev);
        }
        return current;
    }

    // 리스트를 전체 순회하여 완성된 문자열로 반환
    public String printList() {
        String str = "[ ";
        Node current = sentinel.getFirstNode();

        while (current != null) {
            str += current.getData();
            current = current.getNextNode();

            if (current != null) {
                str += ", ";
            }
        }
        str += " ]";
        return str;
    }

}
