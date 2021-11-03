package codeup.basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
/*

*/
import java.io.OutputStreamWriter;

public class Codeup1087 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());
    int sum = 0;
    for (int i = 1; i <= n; i++) { // 가운데의 조건이 빠져서 무한 반복문
      sum += i;
      if (sum >= n) {
        break; // 참이면, 가장 가까운 반복 코드블록의 밖으로 빠져나간다.
      }
    }
    System.out.println(sum);
    br.close();
  }
}
