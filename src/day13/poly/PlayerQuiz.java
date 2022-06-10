package day13.poly;

import day11.inherit.Hunter;
import day11.inherit.Mage;
import day11.inherit.Warrior;
import utility.Util;

public class PlayerQuiz {

    public static void main(String[] args) {

        Mage m = new Mage("눈보라왕");
        Warrior w = new Warrior("주차왕파킹");
        Hunter h = new Hunter("멍멍이조아여");

        m.blizzard(w, h);
        m.blizzard(w);
        m.blizzard(h, m, new Mage("마법의제왕"));

        Util.line();
        Util.line();

        w.rush(m);
        w.rush(h);
        w.rush(new Warrior("짱센전사"));
    }
}
