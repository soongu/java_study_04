package day14.abs.pet;

public class Dog extends Pet {

    public Dog(String name, String kind, int age) {
        super(name, kind, age);
    }

    // 낮잠 자는기능 오버라이딩을 잊었다.
    // 밥 먹는 기능을 오버라이딩 하였다. 시그니처를 다르게함.
    public void feed() {
        System.out.println("강아지는 사료를 먹어요.");
    }

    @Override
    public void takeNap() {
        System.out.println("강아지는 마당에서 낮잠을 자요");
    }
}
