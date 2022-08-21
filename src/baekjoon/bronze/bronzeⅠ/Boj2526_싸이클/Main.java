package baekjoon.bronze.bronzeⅠ.Boj2526_싸이클;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 처음 출력하는 수
        int p = Integer.parseInt(st.nextToken());
        ArrayList<Integer> nums = new ArrayList<>();
        int num = n;
        while (true) {
            num = num * n % p;
            if (!nums.contains(num)) {
                nums.add(num);
            } else {
                // 출력은  반복되는 부분에 포함된 서로 다른 수의 개수, 반복되는 부분의 숫자들의 갯수를 찾는 문제
                // 반복되는 부분의 숫자들의 갯수를 찾아야 하므로 반복이 시작되는 지점의 인덱스를 빼준다.
                // n= 2, p =32  라면 [4, 8, 16, 0, 0, 0...] 반복되는 부분은 0이므로 답은 1이 나와야 한다.
                // size는 4가 나오는데 여기서 [4, 8, 6, 0]이 들어와 있는 상태. 0의 인덱스를 빼주면 1이 나온다.
                System.out.println(nums.size() - nums.indexOf(num));
                break;
            }
        }
    }
}
