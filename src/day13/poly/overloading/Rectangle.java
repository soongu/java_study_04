package day13.poly.overloading;

public class Rectangle {


    // 정사각형의 넓이를 구하는 기능

    // calcArea(int)
    public int calcArea(int len) {
        return len * len;
    }

    // 직사각형의 넓이를 구하는 기능
    // calcArea(int, int)
    public int calcArea(int w, int h) {
        return w * h;
    }

    // calcArea(double)
    public int calcArea(double abcde) {
        return 0;
    }

    // calcArea(int, String)
    public int calcArea(int a, String b) {
        return 0;
    }
    // calcArea(String, int)
    public int calcArea(String a, int b) {
        return 0;
    }
    // calcArea(int, int, int)
    public int calcArea(int a, int b, int c) {
        return 0;
    }

    // calcArea(int)
//    public void calcArea(int b) {}
//    protected void calcArea(int b) {}
}
