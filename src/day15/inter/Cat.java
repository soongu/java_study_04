package day15.inter;

public class Cat extends Animal implements Pet {
    @Override
    public void play() {
        System.out.println("고양이는 캣타워에서 혼자 놀아요");
    }

    @Override
    public void eat() {

    }
}
