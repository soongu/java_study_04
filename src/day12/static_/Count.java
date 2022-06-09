package day12.static_;

public class Count {

    public int x;  // 인스턴스 필드
    public static int y; // 정적 필드

    public void m1() { // 인스턴스 메서드
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        m2();
    }
    // static 블록 (메서드, 정적 초기화자) 에서는
    // static 필드, 메서드만 직접 참조 가능
    // static 블록은 this를 사용할 수 없음.
    public static void m2() { // 정적 메서드
        Count ccc = new Count();
        System.out.println("x = " + ccc.x);
//        System.out.println(ccd.x);
        System.out.println("y = " + y);
//        m1();
    }
}
