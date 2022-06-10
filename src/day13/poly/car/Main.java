package day13.poly.car;

import utility.Util;

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

        Car myCar = kim.buyCar("그랜져");
        myCar.run();

        kim.buyCar("머스탱").run();
//        new Driver().buyCar("").run();

        kim.drive(kim.buyCar("스팅어"));

        System.out.println("================");

        Mustang mm = new Mustang();
        Car cc = mm; // 업캐스팅
        mm = (Mustang) cc; // 다운캐스팅

        System.out.println("mm = " + mm);
        System.out.println("cc = " + cc);

        // 안되는 문법 - 부모객체를 자식타입으로 변환할 수 없음
//        Car ccc = new Car();
//        Mustang mmm = (Mustang) ccc;

        Util.line();

        Mustang myMs = (Mustang) kim.buyCar("머스탱");
        myMs.run();
        myMs.joinMustangClub();

//        int i = Util.inputN("정수: ");

        Util.line();

        CarShop shop = new CarShop();
        int money = shop.sellCar(new Mustang());
        System.out.println("money = " + money);

        Util.line();

        cast("m1");

    } // end main

    public static void cast(Object o) {
        if (o instanceof String) {
            String s = (String) o;
            System.out.println("스트링 변환 성공!");
        } else {
            System.out.println("변환 불가능!");
        }
    }

}
