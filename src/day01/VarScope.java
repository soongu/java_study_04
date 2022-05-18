package day01;

public class VarScope {

    public static void main(String[] args) {

        int num1 = 10, num2 = 20;

        // 특정 블록에서 선언된 변수는 해당 블록을 벗어나면
        // 메모리에서 자동 삭제됨.
        if (true) {
//            int num1 = 300;
            int num3 = num1 + num2;
            System.out.println("num3 = " + num3);
        } // end if
        //System.out.println("num3 = " + num3);

        int num3 = 500;

    } // end main
    // int num4 = num1 + num2;
}// class
