package day03;

public class Loop2 {

    public static void main(String[] args) {

        apple: for (char upper = 'A'; upper <= 'Z'; upper++) {
            for (char lower = 'a'; lower <= 'z'; lower++) {
                if (lower == 'f') break apple;
                System.out.printf("%c - %c\n", upper, lower);
            } // inner for
//            if (upper == 'D') break;
        }// outer for

    }
}
