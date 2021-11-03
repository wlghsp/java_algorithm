package codeup;


/*


*/
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class Codeup1093 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());
    int[] students = new int[24]; // 기본적으로 Java에서는 int, short, byte, long 배열과 같은 데이터 유형이 0으로 초기화됩니다. 

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      int idx = Integer.parseInt(st.nextToken());
      students[idx]++;
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i < students.length; i++) {
      sb.append(students[i]).append(" ");
    }
  
    bw.write(sb + "");
    bw.flush();
    bw.close();
    br.close();
  }
}
