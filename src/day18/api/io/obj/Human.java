package day18.api.io.obj;

import java.io.Serializable;

// 객체를 파일에 저장하려면 객체를 직렬화해야 하는데
// Serializable 인터페이스를 구현해야 합니다.
public class Human implements Serializable {

    private String name;
    private int age;
    private String address;

    public Human(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
