package inflearn.soring_searching.q50_이분검색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static int biSearch(int[] arr, int target) {

        // 처음에 start, end, mid 값을 초기화한다.
        // start는 0부터 시작, end는 끝에서부터 시작
        // mid는 end와 start를 더해서 2로 나눈 지점을 택한다.
        int start = 0;
        int end = arr.length - 1;
        int mid = (end + start) / 2;

        while (end - start >= 0) { // end가 start보다 크거나 같은 동안 진행

            if (arr[mid] == target) { // 맨 먼저 targe숫자를 찾았다면 그 위치인 mid를 반환한다.
                return mid;
            } else if (arr[mid] <= target) { // target이 mid인덱스 지점의 숫자보다 크거나 같다면, start를 mid+1로 할당한다.
                start = mid + 1;
            } else { // target 이 mid지점보다 작다면 end지점에 mid - 1을 할당한다.
                end = mid - 1;
            }

            // if문을 거쳐서 다시 mid인덱스를 할당한다.
            mid = (end + start) / 2;
        }

        // 반복했는데 못 찾았다면 -1을 반환
        return -1;

    }

    public static int solution(int m, int[] arr) {
        int answer = -1;
        Arrays.sort(arr);
        answer = biSearch(arr, m);
        return answer + 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(M, arr));

    }
}
