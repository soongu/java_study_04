package day14.abs.car;

public abstract class Car {

    // 가속기능
    public abstract void accel();
    // 감속기능
    public abstract void brake();
    // 핸들 열선기능
    public final void heatHandle() {
        System.out.println("온도가 10도까지 올라갑니다.");
    }
}
