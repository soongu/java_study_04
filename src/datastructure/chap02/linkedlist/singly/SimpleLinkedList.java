package datastructure.chap02.linkedlist.singly;

// 단방향 단순 연결 리스트
public class SimpleLinkedList<E> {

    // 연결 리스트는 언제나 헤더노드 같은 감시노드를 갖고 있어야 함
    private HeaderNode<E> header;

    // 생성자
    public SimpleLinkedList() {
        // 연결 리스트가 처음 생성 됐을 때, 헤더노드도 같이 생성되어야 함.
        this.header = new HeaderNode<>();
    }

    // 리스트의 첫 번째 위치로 노드를 삽입하는 매서드
    public void addFirst(E data) {

//        System.out.printf("\n신규 데이터 %d 맨 앞에 추가!\n", data);

        // 새롭게 추가할 정수 데이터를 신규노드에 저장
        Node<E> newNode = new Node<>(data);
//        System.out.printf("새로운 노드의 주소: %s\n", newNode);

        // 새로운 노드에게 기존의 첫번째 노드의 주소를 저장
        Node<E> oldFirstNode = header.getFirstNode(); // 기존의 첫번째 노드 주소 획득
//        System.out.printf("헤더가 감시하던 기존 첫번째 노드의 주소: %s\n", oldFirstNode);

        newNode.setNextNode(oldFirstNode); // 그 주소를 새로운 첫번째 노드의 다음노드로 설정
//        System.out.printf("새로운 노드가 감시할 다음 노드 주소: %s\n", newNode.getNextNode());

        // 헤더노드에 새롭게 추가될 노드의 주소를 저장
        header.setFirstNode(newNode);
//        System.out.printf("헤더가 새롭게 감시할 첫번째 노드의 주소: %s\n", header.getFirstNode());

    }

    // 리스트의 첫번째 노드 삭제
    public Node<E> removeFirst() {
        // 빈 리스트인지를 확인
        if (!header.isEmpty()) {
            // 삭제 대상 노드를 키핑
            Node<E> tempNode = header.getFirstNode();

            // 삭제 대상 노드의 다음 노드 주소 가져오기
            Node<E> nextNode = tempNode.getNextNode();

            // 헤더 노드가 다음 노드를 감시하도록 설정
            header.setFirstNode(nextNode);

            // 삭제된 노드를 반환
            return tempNode;
        } else {
            return null; // 빈 리스트면 null 리턴
        }
    }

    // 정렬된 리스트에서 특정 위치에 노드 삽입
    public void insert(E data) {

        // 새로운 노드 생성
        Node<E> newNode = new Node<>(data);

        // 첫 번째 노드를 가져와서 현재 노드로 설정
        Node<E> current = header.getFirstNode();
        // 바로 이전 노드를 가져오기
        Node<E> prev = null;

        /*
        // 삽입 위치 탐색
        // 빈 리스트가 아니고, 삽입할 데이터가 현재노드의 데이터보다 클 동안 반복
        while (current != null && data > current.getData()) {
            // 현재 노드를 이전노드에 백업
            prev = current;
            // 다음 노드를 현재 노드로 재설정
            current = current.getNextNode();
        }

         */

        // 빈 리스트일 경우
        if (prev == null) {
            // 새로운 노드를 첫번째 노드로 설정
            header.setFirstNode(newNode);
        }
        // 빈 리스트가 아닐 경우
        else {
            // 이전 노드가 새로운 노드를 다음 노드로 설정
            prev.setNextNode(newNode);
        }
        // 새로운 노드가 다음 노드를 가리키도록 설정
        newNode.setNextNode(current);

    }

    // 정렬된 리스트에서 특정 위치 노드 삭제
    public Node<E> remove(E data) {
        // 첫 번째 노드를 가져와서 현재 노드로 설정
        Node<E> current = header.getFirstNode();
        // 바로 이전 노드를 가져오기
        Node<E> prev = null;

        // 삭제 위치 탐색
        // 빈 리스트가 아니고, 삽입할 데이터가 현재노드의 데이터 다를 동안 반복
        while (current != null && data != current.getData()) {
            // 현재 노드를 이전노드에 백업
            prev = current;
            // 다음 노드를 현재 노드로 재설정
            current = current.getNextNode();
        }

        // 삭제 대상이 첫번째 노드인 경우
        if (prev == null && current != null) {
            // 헤더가 기존의 두번째 노드를 감시하도록 설정
            Node<E> secondNode = current.getNextNode();
            header.setFirstNode(secondNode);
        }
        // 삭제 대상이 중간 어딘가인 경우
        else if (prev != null && current != null) {
            // 삭제대상의 이전노드가 삭제대상의 다음노드를 연결
            prev.setNextNode(current.getNextNode());
        }
        return current; // 삭제 대상 노드 반환
    }

    // 리스트를 전체 순회하여 완성된 문자열로 반환
    public String printList() {
        String str = "[ ";
        Node<E> current = header.getFirstNode();

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
