package day18.api.io.buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample {

    public static void main(String[] args) {

        // Buffered~~ 는 보조 스트림이므로 핵심기능을 하는 스트림과 결합해야합니다.
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String s = br.readLine();
            System.out.println(s);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
