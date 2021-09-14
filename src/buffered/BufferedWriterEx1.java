package buffered;

import java.awt.image.ImagingOpException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx1 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("bufferedWriter.txt"));

        bw.write("hello\n"); // 출력
        bw.newLine(); // 개행 즉 엔터 역할

        bw.write("I am writing\n"); // 개행과 함께 출력
        bw.flush();  // 남아 있는 데이터를 모두 출력
        bw.close(); // 스트림
    }
}
