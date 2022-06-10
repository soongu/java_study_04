package day13.poly.basic;

class 배우 {}
class 장동건 extends 배우 {}
class 원빈 extends 배우 {}

public class Musical {

    배우 연기파배우;

    void changeActor() {
        연기파배우 = new 원빈();
    }
}
