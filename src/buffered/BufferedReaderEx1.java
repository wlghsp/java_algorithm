package buffered;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx1 {
    public static void main(String[] args) throws IOException {

        // 콘솔에서 입력 받을 경우
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 파일에서 입력 받을 경우
        FileReader fr = new FileReader("src/buffered/BufferedReaderEx1.java");

        BufferedReader br_f = new BufferedReader(fr);

        // String이 리턴값이라 형변환 필수! 라인단위임
        int num = Integer.parseInt(br.readLine());
        br.close(); // 입출력이 끝난 후 닫아주기

        //파일의 한 줄 한 줄 읽어서 출력한다.
        String line = "";
        for (int i = 1; (line = br_f.readLine()) != null; i++) {
            System.out.println(line);
        }

    }
}
