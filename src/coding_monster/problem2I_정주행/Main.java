package coding_monster.problem2I_정주행;

import java.lang.*;
import java.util.*;


public class Main {
    public static final Scanner sc = new Scanner(System.in);

    /**
     * 배열의 N개의 원소가 연속적인 정수 수열로 표현될 수 있는지 판단하는 함수
     * @param data
     * @param n
     * @return
     */
    public static boolean isConsecutive(int[] data, int n)
    {
        /*
        정렬된 배열의 길이가 같으면 연속 수열
         */
        int l, g, m; // 최솟값, 최댓값
        l = g = data[0];
        for (int i = 0; i < n; i++) {
            if (l > data[i]) { // 최솟값
                l = data[i];
            }

            if (g < data[i]) { // 최댓값
                g = data[i];
            }
        }
        // 폐구간 [l,g]까지의 연속수열의 원소의 수
        m = (g - l + 1);
        // n := 실제 배열의 원소의 수를
        if (m == n) {
            // 중복이 존재하지 않으므로 n개의 칸에 m(==n개)의 원소를 나열하는 방법은
            // 모두 하나씩 넣는 것 뿐으로 유일하다.
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }
        boolean result = isConsecutive(data, n);

        if (result) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
