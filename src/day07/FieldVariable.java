package day07;

import java.util.Scanner;

public class FieldVariable {

    int a; // field

    /*
        - 지역 변수는 반드시 초기화가 되어 있어야 참조가 가능합니다.
        - 필드는 초기화를 하지 않아도 자동으로 각 타입의 기본값으로 초기화됩니다.
        - 매개 변수는 메서드 호출시 강제로 값이 대입되므로 따로 초기화할 필요가 없습니다.
     */
    void m1(int c) { // c: parameter
        int b = 1; // local variable
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

    public static void main(String[] args) {

        FieldVariable fv = new FieldVariable();
        fv.m1(10);

        System.out.println(fv.a);
    }
}
