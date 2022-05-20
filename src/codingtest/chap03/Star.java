package codingtest.chap03;

public class Star {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            //별을 반복해서 찍는코드
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("==================");

        for (int i = 0; i < 5; i++) {
            //별을 반복해서 찍는코드
            for (int j = 0; j < 5-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("==================");

        for (int i = 0; i < 5; i++) {
            //공백을 반복해서 찍고
            for (int j = 0; j < 4-i; j++) {
                System.out.print(" ");
            }
            //별을 반복해서 찍는코드
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("========================");

        for (int i = 0; i < 5; i++) {
            //공백을 반복해서 찍고
            for (int j = 0; j < 4-i; j++) {
                System.out.print(" ");
            }
            //별을 반복해서 찍는코드
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
