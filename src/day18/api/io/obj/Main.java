package day18.api.io.obj;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Human> humanList = new ArrayList<>();

    public static void main(String[] args) {

        humanList.add(new Human("김철수", 22, "서울시 구로구"));
        humanList.add(new Human("박영희", 24, "서울시 금천구"));
        humanList.add(new Human("홍길동", 45, "서울시 중구"));

//        saveTextFile();
        saveObject();
    }

    // 객체 세이브 기능
    static void saveObject() {

        try (ObjectOutputStream oos
                     = new ObjectOutputStream(new FileOutputStream("E:/Exercise/human.sav"))) {

            oos.writeObject(humanList);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 세이브 기능
    static void saveTextFile() {

        try (FileWriter fw = new FileWriter("E:/Exercise/human.txt")) {

            StringBuilder sb = new StringBuilder();
            for (Human h : humanList) {
                fw.write(String.format("%s,%d,%s\r\n", h.getName(), h.getAge(), h.getAddress()));
            }
            System.out.println("저장 완료!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
