package datastructure.chap02.linkedlist.singly;

// 연결 리스트의 첫번째 데이터가 들어있는 노드를 저장
public class HeaderNode {

    // 첫번째 노드 객체의 주소 저장
    private Node firstNode;

    // 생성자
    public HeaderNode() {
        // 헤더노드의 생성은 리스트의 생성을 의미
        // 처음에는 빈 리스트로 시작하므로 첫번째 노드는 없다.
        this.firstNode = null;
    }

    // 헤더노드의 포인터(주소)를 셋팅하는 기능
    public void setFirstNode(Node firstNode) {
        this.firstNode = firstNode;
    }

    // 헤더노드가 감시하는 첫번째 노드의 주소를 반환
    public Node getFirstNode() {
        return firstNode;
    }

    // 연결리스트가 빈 리스트인지 여부 확인
    public boolean isEmpty() {
        return firstNode == null;
    }
}
