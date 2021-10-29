package baekjoon.bronze.bronzeⅢ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.

세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.

직사각형의 네 번째 점의 좌표를 출력한다.

*/
/*
5 5
5 7
7 5

7 7

30 20
10 10
10 20

30 10
*/

public class Boj_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



        // StringTokenizer 사용
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] coord_1 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine(), " ");
        int[] coord_2 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine(), " ");
        int[] coord_3 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        int x, y;

          // x 좌표 비교
        // 1번 x좌표와 2번 x좌표 비교
        if (coord_1[0]==coord_2[0]) {
            x = coord_3[0];
        }

        // 1번 x좌표와 3번 x좌표 비교 
        else if (coord_1[0] == coord_3[0]) {
            x = coord_2[0];
        }

        // 2번 x좌표와 3번 x좌표 비교 
        else {
            x = coord_1[0];
        }

        // y 좌표 비교 
        // 1번 y좌표와 2번 y좌표 비교
        if (coord_1[1]  == coord_2[1]) {
            y = coord_3[1];
        }

        // 1번 y좌표와 3번 y좌표 비교 
        else if (coord_1[1] == coord_3[1]) {
            y = coord_2[1];
        }

        // 2번 y좌표와 3번 y좌표 비교 
        else {
            y = coord_1[1];
        }



        // split 사용
        // String[] coord_1 = br.readLine().split(" ");
        // String[] coord_2 = br.readLine().split(" ");
        // String[] coord_3 = br.readLine().split(" ");
        
        // String x;
        // String y;


        // // x 좌표 비교
        // // 1번 x좌표와 2번 x좌표 비교
        // if (coord_1[0].equals(coord_2[0])) {
        //     x = coord_3[0];
        // }

        // // 1번 x좌표와 3번 x좌표 비교 
        // else if (coord_1[0].equals(coord_3[0])) {
        //     x = coord_2[0];
        // }

        // // 2번 x좌표와 3번 x좌표 비교 
        // else {
        //     x = coord_1[0];
        // }

        // // y 좌표 비교 
        // // 1번 y좌표와 2번 y좌표 비교
        // if (coord_1[1].equals(coord_2[1])) {
        //     y = coord_3[1];
        // }

        // // 1번 y좌표와 3번 y좌표 비교 
        // else if (coord_1[1].equals(coord_3[1])) {
        //     y = coord_2[1];
        // }

        // // 2번 y좌표와 3번 y좌표 비교 
        // else {
        //     y = coord_1[1];
        // }


        bw.write(x +" " + y);
        bw.flush();
        bw.close();

    }
}
