package day13.poly.car;

public class CarShop {

    // 차를 판매하는 기능
    public int sellCar(Car car) {

        if (car instanceof Granduer) {
            return 2000;
        } else if (car instanceof Mustang) {
            return 3000;
        } else if (car instanceof Stinger) {
            return 3100;
        } else {
            return 0;
        }
    }
}
