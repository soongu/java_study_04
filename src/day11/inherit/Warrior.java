package day11.inherit;

// 자식 클래스 (sub class)
public class Warrior extends Player {

    public int rage; // 분노게이지

    public Warrior(String name) {
        super(name); // Player()
//        System.out.println("Warrior 생성자 호출!");

    }

    public void rush() {
        System.out.println(name + "님이 돌진합니다.");
    }

    @Override  // 오버라이딩 룰 체크
    public void showStatus() {
        super.showStatus();
        System.out.println("# rage : " + rage);
    }

}
