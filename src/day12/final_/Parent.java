package day12.final_;

class Child extends Parent {

//    void m1() {
//
//    }

    @Override
    void m2() {
        String s;
    }

    void m4() {}
}

//public final class Parent {  // 상속 제한
public class Parent {

    final void m1() {} // 오버라이딩 제한
    void m2() {}
    void m3() {}
}
