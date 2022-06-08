package day11.protec.pac2;

import day11.protec.pac1.A;

public class D extends A {

    public D() {
        super(30);
        A a = new A();
//        a.f1 = 2;
        this.f1 = 2;
//        super.f2 = 2;
        super.m1();
//        super.m2();
    }
}
