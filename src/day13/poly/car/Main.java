package day13.poly.car;

public class Main {

    public static void main(String[] args) {

        Granduer g1 = new Granduer();
        Car g2 = new Granduer();
        Granduer g3 = new Granduer();

        Car m1 = new Mustang();
        Mustang m2 = new Mustang();

        Stinger s1 = new Stinger();
        Car s2 = new Stinger();

        Car[] cars = {g1, g2, g3,
                m1, m2, s1, s2
                , new Mustang()
                , new Stinger()
                , new Granduer()
        };
        for (Car c : cars) {
            c.run();
        }

        Object[] oArr = {
                10, 3.3, "하하호호"
                , new Mustang()
                , true, false
        };


        System.out.println("================");

        Driver kim = new Driver();
        kim.drive(new Stinger());

    }
}
