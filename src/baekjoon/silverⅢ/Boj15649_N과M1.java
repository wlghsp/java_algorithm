package baekjoon.silverⅢ;

/*
자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.

    1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열

입력
첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)

출력
한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.

수열은 사전 순으로 증가하는 순서로 출력해야 한다.

중복 없고
순서 있음.
4 2

1 2
1 3
1 4
2 1
2 3
2 4
3 1
3 2
3 4
4 1
4 2
4 3


 */

import java.io.*;
import java.util.StringTokenizer;

public class Boj15649_N과M1 {



    static StringBuilder sb = new StringBuilder();

    static void input() {
        Boj15651_N과M3.FastReader scan = new Boj15651_N과M3.FastReader();
        N = scan.nextInt();
        M = scan.nextInt();
        selected = new int[M + 1];
    }

    static int N, M;
    static int[] selected;

    // Recurrence Function(재귀 함수)
    // 만약 M개를 전부 고름 => 조건에 맞는 탐색을 한 가지 성공한 것
    // 아직 M개를 고르지 않음 => k 번째부터 M번째 원소를 조건에 맞게 고르는 모든 방법을 시도한다.
    static void rec_func(int k) {  // dfs
        if (k == M + 1) { // 다 골랐다!
            // selected[1..M] 배열이 새롭게 탐색된 결과
            for (int i = 1; i <= M; i++) sb.append(selected[i]).append(' ');
            sb.append('\n');
        } else {
            for (int cand=1; cand <= N; cand++) {

                // 이 부분 추가 
                boolean isUsed = false;
                for (int i = 1; i <k ; i++) {
                    if (cand == selected[i])
                        isUsed = true;
                }


                // k 번째에 cand가 올 수 있으면
                if (!isUsed) {
                    selected[k] = cand;
                    rec_func(k + 1);
                    selected[k] = 0;
                }


            }
        }
    }


    public static void main(String[] args) {
        input();

        // 1 번째 원소부터 M 번째 원소를 조건에 맞는 모든 방법을 찾아줘
        rec_func(1);
        System.out.println(sb.toString());
    }



    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        //    static int N, M;
//    static StringBuilder sb = new StringBuilder();
//    static boolean[] visit;
//    static int[] arr;
//
//    static void dfs(int depth) {
//        if (depth == M) {
//            for (int val:
//                 arr) {
//                sb.append(val).append(' ');
//            }
//            sb.append('\n');
//            return;
//        }
//
//
//        for (int i = 0; i < N; i++) {
//            if (!visit[i]) {
//                visit[i] = true;
//                arr[depth] = i + 1;
//                dfs(depth + 1);
//
//                // 자식 노드 방문이 끝나고 돌아오면 방문노드를 방문하지 않은 상태로 변경
//                visit[i] = false;
//            }
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        N = Integer.parseInt(st.nextToken());
//        M = Integer.parseInt(st.nextToken());
//
//        visit = new boolean[N];
//        arr = new int[M];
//
//        dfs(0);
//
//        System.out.println(sb.toString());
//
//    }
    }
}