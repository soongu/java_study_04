package day18.api.io.fileIOstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample {

    public static void main(String[] args) {

        // 파일 출력
        try (FileOutputStream fos
                     = new FileOutputStream("E:/Exercise/dog.txt")) {

            String msg = "멍멍이는~~~ 멍멍멍멍~왈왈왈~~ \n하하호호~";

            fos.write(msg.getBytes());

        } catch (FileNotFoundException e) {
            System.out.println("해당 경로를 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("입출력 에러!");
        }
    }
}
