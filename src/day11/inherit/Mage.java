package day11.inherit;

public class Mage extends Player {

    public int mana; // 마력 게이지

    public Mage(String name) {
        super(name);
        this.mana = 100;
    }

    public void blizzard() {
        System.out.println(name + "님 눈보라 마법 시전!");
    }

    @Override  // 오버라이딩 룰 체크
    public void showStatus() {
        super.showStatus();
        System.out.println("# mana : " + mana);
    }
}
