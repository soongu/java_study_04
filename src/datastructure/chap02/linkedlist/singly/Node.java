package datastructure.chap02.linkedlist.singly;

// 정수 저장 리스트의 노드
public class Node<E> {

    // 노드에 저장할 자료
    private E data;

    // 다음 노드의 주소를 저장할 포인터
    private Node<E> nextNode;

    // 생성자
    public Node(E data) {
        this.data = data;
    }

    // 노드에 저장된 데이터를 가져오는 메서드
    public E getData() {
        return data;
    }

    // 노드에 저장된 데이터 값을 변경하는 메서드
    public void setData(E data) {
        this.data = data;
    }

    // 다음 노드의 주소를 가져오는 메서드
    public Node<E> getNextNode() {
        return nextNode;
    }

    // 다음 노드의 주소값을 변경하는 메서드
    public void setNextNode(Node<E> nextNode) {
        this.nextNode = nextNode;
    }
}
