package codeup.basic100;


/*

정보 선생님은 오늘도 이상한 출석을 부른다.

영일이는 오늘도 다른 생각을 해보았다.
출석 번호를 다 부르지는 않은 것 같은데... 가장 빠른 번호가 뭐였지?

출석 번호를 n번 무작위로 불렀을 때, 가장 빠른 번호를 출력해 보자.


참고
배열에 순서대로 기록해 두면, 기록된 내용을 모두 검사해 가장 작은 값을 찾아내면 된다.

그런데, 가장 작은 값은 어떻게 어떤 것과 비교하고 찾아야 할까?






입력
번호를 부른 횟수(n, 1 ~ 10000)가 첫 줄에 입력된다.
n개의 랜덤 번호(k, 1 ~ 23)가 두 번째 줄에 공백을 사이에 두고 순서대로 입력된다.



출력
출석을 부른 번호 중에 가장 빠른 번호를 1개만 출력한다.


10
10 4 2 3 6 6 7 9 8 5

2

*/
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class Codeup1095 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());
    int[] called = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < called.length; i++) {
      called[i] = Integer.parseInt(st.nextToken());
    }
    int minNum = Integer.MAX_VALUE;
    for (int i = 0; i < called.length; i++) {
      if (called[i] < minNum) {
        minNum = called[i];
      }
    }
    bw.write(minNum + "");
    bw.flush();
    bw.close();
    br.close();
  }
}
