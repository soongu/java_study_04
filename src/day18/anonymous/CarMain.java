package day18.anonymous;

public class CarMain {



    public static void main(String[] args) {

        /*Car avante = new Car() {
            @Override
            public void run() {
                System.out.println("아반떼가 달립니다.");
            }
        };*/

        Car avante = () -> System.out.println("아반떼가 달립니다.");

        avante.run();

        Calculator addCal = (n1, n2) -> n1 + n2;
        addCal.operate(10, 20);


        Car tucson = () -> System.out.println("투싼이 달립니다.");
        tucson.run();



    }
}
