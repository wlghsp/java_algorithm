package codeup;


/*
어떤 규칙에 따라 수를 순서대로 나열한 것을 수열이라고 한다.

예를 들어
1 -1 3 -5 11 -21 43 ... 은
1부터 시작해 이전에 만든 수에 -2를 곱한 다음 1을 더해 다음 수를 만든 수열이다.

이런 이상한 수열을 알게 된 영일이는 또 궁금해졌다.

"그럼.... 13번째 나오는 수는 뭘까?"

영일이는 물론 수학을 아주 잘하지만 이런 문제는 본 적이 거의 없었다...

그래서 프로그램을 만들어 더 큰 수도 자동으로 계산하고 싶어졌다.


시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째인지를 나타내는 정수(n)가 입력될 때,
n번째 수를 출력하는 프로그램을 만들어보자.


입력
시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째 인지를 나타내는 정수(n)가
공백을 두고 입력된다.(a, m, d는 -50 ~ +50, n은 10이하의 자연수)



출력
n번째 수를 출력한다.

1 -2 1 8

-85

*/
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class Codeup1091 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    long a = Long.parseLong(st.nextToken());
    long m = Long.parseLong(st.nextToken());
    long d = Long.parseLong(st.nextToken());
    long n = Long.parseLong(st.nextToken());
    long result = a;
    for (int i = 0; i < n-1; i++) {
       result = result * m +d;
    }
    bw.write(result + "");
    bw.flush();
    bw.close();
    br.close();
  }
}
