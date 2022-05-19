package day02;

public class LogicalOperator {

    public static void main(String[] args) {

        boolean t = true, f = false;
        System.out.println(t | t);
        System.out.println(t | f);
        System.out.println(f | t);
        System.out.println(f | f);

        System.out.println("===============");

        int x = 10, y = 20;

        boolean result1 = (x != 10) && (++y == 21);
        boolean result2 = (x == 10) || (++y == 21);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("=================");

        // 논리 반전 (!) - 단항 연산자
        System.out.println(!t);

        System.out.println("안녕" + "하세요");

    }
}
