package codeup.one_dim_array;



/*
주현이는 5살이라서 아직 기억력이 좋지 않은 편이다.
주현이 엄마는 주현이의 기억력을 향상시키기 위해 매일 훈련을 시킨다.
어느 날, 주현이 엄마는 주현이에게 10개의 숫자를 차례대로 말한 다음 "k번째 숫자는 뭘까요?"하고 물어본다.
이번에는 주현이가 좋아하는 '또봇'이라는 로봇변신 자동차가 상품으로 걸려있다.
주현이가 '또봇'을 가질 수 있도록 프로그래밍하시오.

입력
첫째 줄에 숫자 10개가 차례대로 입력된다.
둘째 줄에 k값이 입력된다. 

출력
k번째 숫자가 무엇이었는지 출력한다.

입력 예시   
10 9 8 7 6 5 4 3 2 1
3

출력 예시
8


*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Codeup1409 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }
        int k = Integer.parseInt(br.readLine());
        bw.write(arr.get(k-1)+ "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
