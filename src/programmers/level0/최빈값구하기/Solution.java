package programmers.level0.최빈값구하기;


import java.util.Arrays;

public class Solution {
    public int solution(int[] array) {
        int[] cnt = new int[1000];

        for (int i : array) {
            cnt[i]++;
        }
        int maxCnt = Integer.MIN_VALUE;
        int maxIdx = -1;
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > maxCnt) {
                maxCnt = cnt[i];
                maxIdx = i;
            }
        }
        for (int i = 0; i < cnt.length; i++) {
            if (maxCnt == cnt[i] && i != maxIdx){
                return -1;
            }
        }
        return maxIdx;
    }


    // 내 풀이
    public int solution1(int[] array) {
        int answer = 0;
        if (array.length == 1) return array[0];
        int[] arr = new int[1000];
        for (int i = 0; i < array.length; i++) {
            arr[array[i]]++;
        }
        int[] b = arr.clone();
        Arrays.sort(arr);
        if (arr[arr.length-1] == arr[arr.length-2]) {
            answer = -1;
        } else {
            for (int i = 0; i < b.length;i++) {
                if (arr[arr.length-1] == b[i]) {
                    answer = i;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 2, 3, 3, 3, 4})); // 3
        System.out.println(s.solution(new int[]{1, 1, 2, 2})); // -1
        System.out.println(s.solution(new int[]{1})); // 1
    }
}
