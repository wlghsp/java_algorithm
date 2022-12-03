package baekjoon.bronze.bronzeⅢ.boj2476_주사위게임;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int maxReward = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            Set<Integer> set = new HashSet<>();
            int[] arr = new int[3];
            int maxVal = Integer.MIN_VALUE;
            for (int j = 0; j < 3; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                set.add(tmp);
                arr[j] = tmp;
                if (tmp > maxVal) maxVal = tmp;
            }
            int size = set.size();
            int reward = 0;
            reward = getReward(arr, maxVal, size);

            if (reward > maxReward) maxReward = reward;
        }
        System.out.println(maxReward);

    }

    private static int getReward(int[] arr, int maxVal, int size) {
        int reward;
        if (size == 1) reward = 10000 + arr[0] * 1000;
        else if (size == 2){
            if (arr[0] == arr[1]) {
                reward = 1000 + arr[0] * 100;
            } else if (arr[1] == arr[2]) {
                reward = 1000 + arr[1] * 100;
            } else {
                reward = 1000 + arr[2] * 100;
            }
        } else {
            reward = maxVal * 100;
        }
        return reward;
    }
}
