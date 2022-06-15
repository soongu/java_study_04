package day16.api.wrapper;

public class Wrapper {

    public static void main(String[] args) {

        Object[] arr = { 10, 2.2 };

        Integer n = 10; // 오토 박싱
        String s = "zzz";

//        int m = n.intValue();
        int m = n; // 오토 언박싱

        System.out.println(Integer.MAX_VALUE);
    }
}
