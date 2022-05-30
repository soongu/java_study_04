package codingtest.programmers.level1;

public class 숫자_문자열과_영단어 {

    public static int solution(String s) {
        String[] numberStr = {"zero", "one", "two", "three",
                                "four", "five", "six",
                                "seven", "eight", "nine"};

        for (int i = 0; i < numberStr.length; i++) {
            s = s.replace(numberStr[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {

        /*
        String s = "one4seveneight";
        s = s.replace("one", "1");
        s = s.replace("seven", "7");
        s = s.replace("eight", "8");
        System.out.println(s);

         */

        System.out.println(solution("one4seveneight"));
        System.out.println(solution("23four5six7"));
        System.out.println(solution("2three45sixseven"));
        System.out.println(solution("123"));
    }
}
