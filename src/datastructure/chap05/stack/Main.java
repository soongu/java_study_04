package datastructure.chap05.stack;

public class Main {

    public static void main(String[] args) {

        // 스택 생성
        Stack stack = new Stack();

        // 스택에 자료 넣기
        for (int i = 1; i <= 5; i++) {
            stack.push(i * 3);
        }

        // 스택에서 순서대로 자료들을 제거하면서 출력
        while (!stack.isEmpty()) {
            Integer removed = stack.pop();
            System.out.println(removed);
        }
        stack.peek(); // 스택이 비었다고 나와야 함
    }
}
