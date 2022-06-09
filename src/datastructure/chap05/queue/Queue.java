package datastructure.chap05.queue;

class QueueNode {

    private int item;
    private QueueNode link;

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public QueueNode getLink() {
        return link;
    }

    public void setLink(QueueNode link) {
        this.link = link;
    }
}

public class Queue {

    private QueueNode front; // 맨 앞 노드를 감시
    private QueueNode rear; // 맨 뒤 노드를 감시

    public Queue() {
        front = new QueueNode();
        rear = new QueueNode();
    }

    // 큐가 비었는지 확인
    public boolean isEmpty() {
        return front.getLink() == null;
    }

    // 큐에 데이터 추가 (rear쪽으로)
    public void add(int item) {
        // 새 노드 생성
        QueueNode newNode = new QueueNode();
        newNode.setItem(item); // 새 노드에 자료 저장

        // 링크 연결
        if (isEmpty()) { // 첫번째 노드가 저장되는 경우
            front.setLink(newNode);
            rear.setLink(newNode);
        } else { // 기존 노드에 연결되는 경우
            // 추가 되기 전 마지막 노드
            QueueNode lastNode = rear.getLink();
            lastNode.setLink(newNode);
            rear.setLink(newNode);
        }
    }

    // 큐에서 데이터 삭제 (front쪽)
    public Integer poll() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return null;
        } else {
            // 삭제 대상 가져오기
            QueueNode delTarget = front.getLink();

            // front가 삭제 대상 뒤에 있는 노드를 감시
            front.setLink(delTarget.getLink());

            return delTarget.getItem();
        }
    }

}
