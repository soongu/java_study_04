package day18.api.io.fileIOstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputExample {

    public static void main(String[] args) {

        // 파일 읽어들이려면
        /*FileInputStream fis = null;
        try {
            fis = new FileInputStream("E:/sl_dev/java_study/src/datastructure/chap02/linkedlist/singly/Node.java");

            int data = 0;
            while (data != -1) {
                data = fis.read();
                System.out.write(data); // 아스키를 문자로 출력
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("입출력 에러!");
        } finally {
            try {
                if (fis != null) fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

        String path = "E:/sl_dev/java_study/src/datastructure/chap02/linkedlist/singly/Node.java";
        // try with resource : AutoCloseable 인터페이스가 구현된 객체를 자동 클로즈
        try (FileInputStream fis = new FileInputStream(path)) {

            int data = 0;
            while (data != -1) {
                data = fis.read();
                System.out.write(data); // 아스키를 문자로 출력
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("입출력 에러!");
        }
    }
}
