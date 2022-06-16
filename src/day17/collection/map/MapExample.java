package day17.collection.map;

import utility.Util;

import java.util.*;

class Student {
    String name; // 이름
    int grade; //학년

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}

public class MapExample {

    public static void main(String[] args) {

        Map<String, Student> map = new HashMap<>();

        // put(k, v) : 데이터 추가
        map.put("짹짹이", new Student("김철수", 3));
        map.put("냥냥이", new Student("도우너", 5));
        map.put("멍멍이", new Student("고길동", 1));

        System.out.println(map.size());
        System.out.println(map);

        // 중복된 key객체로 put을 하면 value가 수정됩니다.
        map.put("냥냥이", new Student("둘리", 6));
        System.out.println(map);

        // get(key) : 저장된 value 참조
        Student student = map.get("멍멍이");
        System.out.println("student = " + student);

        student.name = "빠빠빠";
        System.out.println(map);

        // containsKey(key) : map에 key가 있는지 유무 확인
        Util.line();

        System.out.println(map.containsKey("꽉꽉이"));
        System.out.println(map.containsKey("짹짹이"));

        // map 루프
        Util.line();
        Set<String> keySet = map.keySet();// map의 모든 키를 Set에 담아 리턴
        System.out.println(keySet);

        for (String key : keySet) {
            System.out.println(map.get(key));
        }

        // remove(key) : key에 해당하는 Entry 삭제
        map.remove("냥냥이");
        System.out.println(map);

        map.clear();
        System.out.println(map.isEmpty());

        // 맵에 value값으로 List를 사용하려면
        Map<String, List<Integer>> mapList = new HashMap<>();

    }

}