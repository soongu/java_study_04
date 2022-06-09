package day12.final_;

public class Korean {

    String name; // 이름
    final String id; // 주민번호

    // 상수: 불변성과 유일성을 모두 만족
    public static final String nation; // 국적

    static {
        nation = "대한민국";
    }

    public Korean(String name, String id, String nation) {
        this.name = name;
        this.id = id;
//        this.nation = nation;
    }

    @Override
    public String toString() {
        return "이름: " + name + ", 주민번호: " + id + ", 국적: " + nation;
    }


    // 주민번호를 바꾸는 메서드
    public void changeId(String id) {
//        this.id = id;
    }
}
