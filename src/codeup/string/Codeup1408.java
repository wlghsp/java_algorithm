package codeup.string;

/*


*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Codeup1408 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        // StringTokenizer st = new StringTokenizer(br.readLine());
        String str = br.readLine();

        String result1 = "";
        String result2 = "";
        for (int i = 0; i < str.length(); i++) {
            int value = str.charAt(i);
            result1 += (char) (value + 2);
            result2 += (char) ((value * 7) % 80 + 48);
        }
        bw.write(result1 + "\n" + result2);
        bw.flush();
        bw.close();
        br.close();

    }
}
