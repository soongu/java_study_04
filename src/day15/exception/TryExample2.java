package day15.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryExample2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("정수1: ");
            int n1 = sc.nextInt(); // warning

//            sc.close();

            System.out.print("정수2: ");
            int n2 = sc.nextInt(); // warning

            int div = n1 / n2; // warning
            System.out.println("div = " + div);

//            sc = null;
            sc.close(); // sc가 null이면 // warning
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누면 안됩니다.");
        } catch (InputMismatchException e) {
            System.out.println("정수로만 입력하세요!");
        } catch (NullPointerException e) {
            System.out.println("객체 초기화를 확인하세요!");
        } catch (Exception e) {
            System.out.println("알 수 없는 예외 발생! 관리자에게 문의하세요!");
        }

        System.out.println("프로그램 정상 종료!");
    }
}
