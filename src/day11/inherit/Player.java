package day11.inherit;

// 부모 클래스 (super class)
// 공통 기능과 속성을 기술
public class Player extends Object {

    public String name; // 캐릭터 이름
    public int level; // 레벨
    public int hp;  // 체력
    public int exp;



    public Player(String name) {
        System.out.println("Player 생성자 호출!");
        this.name = name;
        this.level = 1;
        this.hp = 50;
    }


    public void showStatus() {
        System.out.println("\n======== Character's Info ==========");
        System.out.println("# name : " + name);
        System.out.println("# level : " + level);
        System.out.println("# hp : " + hp);
    }
}
