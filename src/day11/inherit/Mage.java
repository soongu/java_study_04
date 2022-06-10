package day11.inherit;

import java.util.Random;

public class Mage extends Player {

    public int mana; // 마력 게이지

    public Mage(String name) {
        super(name);
        this.mana = 100;
    }

    public void blizzard(Player... targets) {
        System.out.printf("# %s님 눈보라 시전!!!!\n", this.name);
        System.out.println("======================================");


        for (Player p : targets) {
            //맞은 사람이 혹시 나??
            if (p == this) continue;

            //10 ~ 15의 랜덤 피해
            int damage = (int) (Math.random() * 6 + 10);
            //실제 체력에서 차감
            p.hp -= damage;
//            p.setHp(p.getHp() - damage);

            System.out.printf("%s님이 %d의 피해를 입었습니다.(남은 체력: %d)\n"
                    , p.name, damage, p.hp);
        }
    }

    @Override  // 오버라이딩 룰 체크
    public void showStatus() {
        super.showStatus();
        System.out.println("# mana : " + mana);
    }
}
