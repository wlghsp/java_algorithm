package thisIsCodingTest.정렬.위에서_아래로;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
/*
3
15
27
12
 */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        // 삽입정렬 내림차순 정렬
        for (int i = 1; i < N; i++) {
            int selected = arr[i]; // 현재 선택된 값
            int prev = i - 1;
            while (prev >= 0 && arr[prev] < selected) {
                arr[prev + 1] = arr[prev]; // 탐색한 원소가 선택값보다 작다면 탐색 원소를 뒤로 미룬다.
                prev--;
            }
            // 탐색완료
            // 앞에는 선택된 보다 작은 값이 없다는 의미
            arr[prev + 1] = selected;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
