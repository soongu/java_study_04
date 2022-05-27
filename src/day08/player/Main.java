package day08.player;

import day08.fruit.Apple;

public class Main {

    public static void main(String[] args) {

        Player park = new Player("박찬호", 1, 50);
        Player kim = new Player("김철수", 1, 50);
//        System.out.println("kim = " + kim);
//        System.out.println("park = " + park);

//        park.attack(park);

//        park.attack(kim);
//        park.attack(kim);
//        kim.attack(park);

        kim.attack(new Player("냥냥이", 10, 200));

        new Player("멍멍이", 10, 300).attack(kim);


    }
}
