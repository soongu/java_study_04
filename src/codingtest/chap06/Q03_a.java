package codingtest.chap06;

public class Q03_a {

    public static void main(String[] args) {

        String s = "baekjoon";
        for (char c = 'a'; c <= 'z'; c++)
            System.out.print(s.indexOf(c) + " ");
    }
}
