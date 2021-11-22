package baekjoon.복습;


import java.io.BufferedReader;

/*
산성 용액과 알칼리성 용액의 특성값이 주어졌을 때, 이 중 두 개의 서로 다른 용액을 혼합하여 특성값이 0에 가장 가까운 용액을 만들어내는 두 용액을 찾는 프로그램을 작성하시오.

입력
첫째 줄에는 전체 용액의 수 N이 입력된다. N은 2 이상 100,000 이하이다. 
둘째 줄에는 용액의 특성값을 나타내는 N개의 정수가 빈칸을 사이에 두고 주어진다. 이 수들은 모두 -1,000,000,000 이상 1,000,000,000 이하이다. 
N개의 용액들의 특성값은 모두 다르고, 산성 용액만으로나 알칼리성 용액만으로 입력이 주어지는 경우도 있을 수 있다.

출력
첫째 줄에 특성값이 0에 가장 가까운 용액을 만들어내는 두 용액의 특성값을 출력한다. 
출력해야 하는 두 용액은 특성값의 오름차순으로 출력한다. 
특성값이 0에 가장 가까운 용액을 만들어내는 경우가 두 개 이상일 경우에는 그 중 아무것이나 하나를 출력한다.


5
-2 4 -99 -1 98

-99 98

*/

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;



public class 두용액_복습 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr); // 정렬 필요함. 
        // 슬라이딩 윈도우 
        int start = 0, end = arr.length - 1, min= Integer.MAX_VALUE;
        int result[] = new int[2];
        while (start < end) {
            int sum = arr[start] + arr[end];
            if (min > Math.abs(sum) ) {
                min = Math.abs(sum);
                result[0] = arr[start];
                result[1] = arr[end];
                if (sum == 0) break;    
            }
            if (sum < 0) start++;
            else end--;
        }

        System.out.println(result[0] + " " + result[1]);
    }
}
