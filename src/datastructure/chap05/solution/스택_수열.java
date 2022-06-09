package datastructure.chap05.solution;

import java.util.Scanner;
import java.util.Stack;

// 백준 1874
public class 스택_수열 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 1 ~ N까지의 자연수

        // 만들어야 할 수열
//        int[] A = {4, 5, 1, 2, 3};
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();

        // 자바 api
        Stack<Integer> stack = new Stack<>();

        int num = 1; // 자연수값 저장

        // 기호를 저장할 문자열
//        String s = "";
        StringBuilder s = new StringBuilder();

        // 수열 배열에서 값을 하나씩 뽑아서 push, pop여부 확인
        for (int i = 0; i < A.length; i++) {
            int targetNum = A[i]; // 현재 수열 값
            if (targetNum >= num) { // push인 경우
                while (targetNum >= num) {
                    stack.push(num++);
                    s.append("+\n"); // 문자열 결합효과
                }
                // 마지막에 들어간 수를 pop
                stack.pop();
                s.append("-\n");
            } else { // pop인 경우
                int n = stack.pop(); // 스택에서 제거한 숫자

                // 스택의 가장 위의 수가 현재 구해야할 수열값보다 크면
                // 수열 출력이 성립이 안되므로
                if (n > targetNum) {
                    s = new StringBuilder("NO");
                    break;
                } else {
                    s.append("-\n");
                }
            }
        }// end for
        System.out.println(s);

    }
}
