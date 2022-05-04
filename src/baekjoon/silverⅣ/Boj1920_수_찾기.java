package baekjoon.silverⅣ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj1920_수_찾기 {


    static int[] arr;


    // 반복으로 구현한 이진탐색
    public static int binarySearch(int[] arr, int key) {
        int mid;

        int low = 0;
        int high = arr.length-1;

        while(low <= high) {
            mid = (low + high) / 2;

            if(key > arr[mid]) {
                low = mid + 1;
            } else if(key < arr[mid]) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    // 재귀로 구현한 이진 탐색
    public static int binarySearch2(int key, int low, int high) {
        int mid;


        if (low <= high) {
            mid = (low + high) / 2;
            if (key == arr[mid]) //탐색 성공
                return mid;
            else if (key < arr[mid]) {
                // 왼쪽 부분 arr[0]부터 arr[mid-1]에서의 탐색
                return binarySearch2(key, low, mid-1);
            } else {
                // 오른쪽 부분 - arr[mid+1]부터 arr[high]에서의 탐색
                return binarySearch2(key, mid+1, high);
            }
        }

        return -1;
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // ★★중요★★ 키포인트 이진탐색하려면 정렬이 되어있어야 함.
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            if (binarySearch2(Integer.parseInt(st.nextToken()), 0, arr.length-1)>=0) System.out.println(1);
            else System.out.println(0);
        }

        // 찾으면 인덱스 0 이상을 반환하고 없으면 -1을 반환하는 Arrays.binarySearch(배열, 찾는숫자)
//        for (int i = 0; i < M; i++) {
//            if (Arrays.binarySearch(arr, Integer.parseInt(st.nextToken())) >= 0) System.out.println(1);
//            else System.out.println(0);
//        }
    }
}
