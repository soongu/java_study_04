package day06;

// 자바의 메서드는 클래스 내부, 메서드 외부에서 선언 가능
// 메서드 호출은 메서드, 생성자 내부에서만 가능
public class MethodBasic {

    // 1 ~ x까지의 누적합을 구해서 리턴하는 함수
    static int calcTotal(int x) {
        System.out.println("메서드 호출!");
        int total = 0;
        for (int i = 1; i <= x; i++)
            total += i;
        return total;
    }

    public static void main(String[] args) {

        int result = calcTotal(10);
        System.out.println("result = " + result);

        System.out.println(calcTotal(100));

    } // end main method

} // end class


