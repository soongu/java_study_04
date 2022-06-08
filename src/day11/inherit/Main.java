package day11.inherit;

public class Main {

    public static void main(String[] args) {

        Warrior w = new Warrior("키보드워리어");
        Mage m = new Mage("번개왕썬더");
        Hunter h = new Hunter("멍멍이조련사");

        w.level = 10;
        w.showStatus();
        m.showStatus();
        h.showStatus();


//        w.rush();

        w.exp = 100;
        m.exp = 50;
        h.exp = 200;

    }
}
