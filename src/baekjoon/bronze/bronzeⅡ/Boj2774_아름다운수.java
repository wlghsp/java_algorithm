package baekjoon.bronze.bronzeⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*

문제
윤정이는 뭐든지 아름다운 것이 좋다고 생각한다. 그래서 윤정이는 사물을 볼 때 자신이 정한 방법으로 아름다운 정도를 평가한다. 
윤정이는 수를 볼 때도 이런 아름다운 수의 정도를 따지는데, 윤정이에게 있어서 아름다운 수의 정도는 그 수를 이루고 있는 10진수의 서로 다른 숫자의 개수를 의미한다.  
예를 들어 122이라는 수는 1과 2 라는 2개의 숫자로 이루어져 있으므로 아름다운 정도가 2가 된다. 윤정이의 방법으로 여러 수들의 아름다운 정도를 알아보자.

입력
첫째 줄에는 테스트 케이스의 개수 T가 주어진다. 다음 줄부터는 아름다운 정도를 알고 싶은 수 X(1 ≤ X ≤ 1000000000)가 주어진다.

출력
각각의 테스트 케이스마다 X의 아름다운 정도를 한 줄에 하나씩 입력으로 주어진 순서대로 출력한다.

2
7
122

1
2

*/


public class Boj2774_아름다운수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            long X = Long.parseLong(br.readLine());
            boolean[] arr = new boolean[10];
            // 1의 자리부터 확인하고, 다음은 10의자리, 다음은 100의 자리의 숫자를 확인한다. 예를 들어 122 면 처음에는 2를 확인하고 arr[2] = true가 입력되고, 
            // 다음도 2이므로 arr[2] = true가 입력, 
           
            // 중요 코드 어떤 수든지 그 수 의 1의 자리부터 그 수의 자릿수까지 각 숫자들로 연산을 할 수 있다. 
            while (X != 0) { 
                arr[(int) (X % 10L)] = true; 
                X /= 10;   // 10으로 나눠서 1의 자리, 10의 자리, 100의 자리 확인 
            }


            int cnt = 0;
            for (int j = 0; j < 10; j++) {
                if (arr[j]) cnt++;
            }
            System.out.println(cnt);
        }

    }
}
