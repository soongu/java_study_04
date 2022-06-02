package datastructure.chap02.linkedlist.doubly;

public class SentinelNode {

    private Node firstNode; // 첫번째 노드 주소
    private Node lastNode; // 마지막 노드 주소

    // 리스트가 비어있는지 확인
    public boolean isEmpty() {
        return firstNode == null && lastNode == null;
    }

    public Node getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(Node firstNode) {
        this.firstNode = firstNode;
    }

    public Node getLastNode() {
        return lastNode;
    }

    public void setLastNode(Node lastNode) {
        this.lastNode = lastNode;
    }
}
