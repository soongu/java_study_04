package datastructure.chap05.stack;

// 스택에 쌓을 노드
class StackNode {
    private int item; // 스택에 저장될 정수
    private StackNode link; // 다음 노드를 연결할 포인터

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public StackNode getLink() {
        return link;
    }

    public void setLink(StackNode link) {
        this.link = link;
    }
}

// 실제 구현할 스택
public class Stack {

    // 스택의 맨 위쪽 노드를 가리킬 포인터
    private StackNode top;

    public Stack() {
        top = new StackNode();
    }

    // 스택이 비어있는지 확인
    public boolean isEmpty() {
        return top.getLink() == null;
    }

    // 스택에 자료 삽입
    public void push(int item) {
        // 새노드 생성
        StackNode newNode = new StackNode();
        newNode.setItem(item); // 새노드에 데이터 저장
        // 새노드는 기존의 top이 기억하고 있는 노드를 연결한다.
        newNode.setLink(top.getLink());
        top.setLink(newNode); // top은 새로운 노드를 연결
    }

    // 스택에서 자료를 제거
    public Integer pop() {
        if (isEmpty()) { // 스택이 비었으면
            System.out.println("stack is empty!");
            return null;
        } else {
            // 데이터 가져오기
            int result = top.getLink().getItem();

            // top이 제거될 노드의 다음노드를 연결하도록 함
            top.setLink(top.getLink().getLink());
            return result;
        }
    }

    // 스택에서 자료를 단순 읽기
    public Integer peek() {
        if (isEmpty()) { // 스택이 비었으면
            System.out.println("stack is empty!");
            return null;
        } else {
            // 데이터 가져오기
            int result = top.getLink().getItem();
            return result;
        }
    }
}
