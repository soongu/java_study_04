package day08;

public class Person {

    String name;
    int age;

    Person(String pName) {
        name = pName;
        if (name.equals("바보")) {
            return;
        }
        System.out.println("zzz");
    }

    void sleep() {}
}
