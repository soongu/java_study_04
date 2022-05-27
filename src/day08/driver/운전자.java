package day08.driver;

import day08.car.딜러;
import day08.car.엔진;
import day08.car.자동차;

public class 운전자 {

    자동차 내차;

    void 운전하다() {
        내차.시동을걸다();
//        내차.엔진오일을_분사하다();

//        내차.v6엔진 = new 엔진();

    }
    void 차를_구매하다(딜러 착한딜러) {
        내차 = 착한딜러.차를_판매하다(10000000);
//        내차 = new 자동차();
    }


}
