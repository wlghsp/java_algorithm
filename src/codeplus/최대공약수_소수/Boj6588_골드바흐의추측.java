package codeplus.최대공약수_소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Boj6588_골드바흐의추측 {

    static int MAX = 1000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] check = new boolean[MAX +1]; // 숫자 삭제 여부 저장 true이면 지워진 것이고 false이면 안 지워졌으므로 소수

        ArrayList<Integer> prime = new ArrayList<>(); // 소수를 담을 list

        check[0] = check[1] = true;

        for (int i = 2; i*i <=MAX ; i++) { // 소수 구하기
            if (check[i] == true) { // i가 true이면 지워졌음.
                continue;
            }

            // 중요 부분 아래 두개
            prime.add(i);                           // 소수를 넣어준다.

            for (int j = i + i; j <= MAX ; j+= i) { // 소수의 배수들을 삭제 처리 한다.
                check[j] = true;
            }

        }

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) { // 0이 입력되면 탈출
                break;
            }
            for (int i = 1; i < prime.size(); i++) {
                int p = prime.get(i);
                if (check[n-p] == false) {
                    System.out.println(n + " = " + p + " + " + (n-p));
                    break;
                }
            }


        }


    }
}
