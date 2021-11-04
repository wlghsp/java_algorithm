package codeup.one_dim_array;

/*
n개의 숫자가 입력되면,
n개의 숫자를 왼쪽으로 하나씩 돌려서 출력하시오.
예) 1 2 3 4 5가 입력된 경우,

1 2 3 4 5
2 3 4 5 1
3 4 5 1 2
4 5 1 2 3
5 1 2 3 4

입력
첫째 줄에 숫자의 개수 n이 입력된다.( 1 <= n <= 1,000)
둘째 줄에 n개의 정수 k가 공백으로 구분되어 입력된다.(1 <= k <= 1,000)

출력
숫자를 로테이션한 결과를 출력한다.(단, 왼쪽으로만 돌린다.)

5
1 2 3 4 5 

1 2 3 4 5 
2 3 4 5 1 
3 4 5 1 2 
4 5 1 2 3 
5 1 2 3 4

*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Codeup1405 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                sb.append(list.get(j)).append(" ");
            }
            sb.append("\n");
            int num = list.get(0);
            list.remove(0);
            list.add(num);
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
