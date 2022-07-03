package inflearn.soring_searching.q46_LeastRecentlyUsed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int findIdx(int num, int[] arr) {
        // 숫자 찾아서 인덱스 찾아서 반환, 없으면 -1
        int answer = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return answer;
    }

    public static int[] cacheMiss(int c, int[] arr){
        // 배열에서 숫자 뒤로 미루고 맨 앞에 작업 숫자 집어 넣기
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = c;
        return arr;
    }

    public static int[] cacheHit(int idx, int c, int[] arr){
        // 한칸씩 뒤로 미뤄서 집어 넣고 맨 앞에 작업 숫자 집어 넣기
        for (int i = idx; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = c;
        return arr;
    }

    public static int[] solution(int s, int n, int[] arr) {
        int[] answer = new int[s];

        for (int i = 0; i < n; i++) {
            int c = arr[i];
            int idx = findIdx(c, answer);
            if ( idx == -1) {
                answer = cacheMiss(c, answer);
            } else {
                answer = cacheHit(idx, c, answer);
            }
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken()); // 캐시의 크기
        int T = Integer.parseInt(st.nextToken()); // 작업의 갯수
        int[] arr = new int[T];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        for (int i : solution(S, T, arr)) {
            sb.append(i).append(' ');
        }
        System.out.println(sb);
    }
}
