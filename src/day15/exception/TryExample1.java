package day15.exception;

public class TryExample1 {

    public static void main(String[] args) {

        int n1 = 10, n2 = 0;  // 1

        System.out.println("나눗셈 시작!"); // 2

        try {
            // 예외 발생 가능성이 있는 코드
            System.out.printf("%d / %d = %d\n", n1, n2, n1 / n2); // 3
        } catch(Exception e) { // 처리할 예외에 대한 클래스
            // 예외 발생시 실행할 코드
            System.out.println("0으로 나눌 수 없습니다.");
            // 예외 처리 후에 예외 로그를 보고 싶을 때
            e.printStackTrace();
            // 전체로그 말고 예외 원인 메시지만 확인하고 싶을 때
            System.out.println(e.getMessage());
        }
        System.out.println("프로그램 정상 종료!"); // 4
    }
}
