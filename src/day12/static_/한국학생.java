package day12.static_;

public class 한국학생 {

    String 전공;
    static String 국적;

    void 전공을_물어보다() {
        System.out.println(국적);
        System.out.println(전공);
    }
    static void 국적을_물어보다() {
        System.out.println(국적);
//        System.out.println(전공);
    }

    public static void main(String[] args) {
        한국학생.국적을_물어보다();

        한국학생 김철수 = new 한국학생();
        김철수.전공을_물어보다();
    }
}
