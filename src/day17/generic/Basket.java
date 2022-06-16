package day17.generic;

// 제네릭 클래스: 객체가 생성될 때 타입이 결정됨.
// - 제네릭 클래스는 타입의 안정성을 제공합니다.
public class Basket<F extends Fruit> {

    // 필드 선언
    private F fruit;

    public void setFruit(F fruit) {
        this.fruit = fruit;
    }

    public F getFruit() {
        return fruit;
    }
}
