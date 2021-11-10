package baekjoon.복습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
신종 바이러스인 웜 바이러스는 네트워크를 통해 전파된다. 한 컴퓨터가 웜 바이러스에 걸리면 그 컴퓨터와 네트워크 상에서 연결되어 있는 모든 컴퓨터는 웜 바이러스에 걸리게 된다.
예를 들어 7대의 컴퓨터가 <그림 1>과 같이 네트워크 상에서 연결되어 있다고 하자. 
1번 컴퓨터가 웜 바이러스에 걸리면 웜 바이러스는 2번과 5번 컴퓨터를 거쳐 3번과 6번 컴퓨터까지 전파되어 2, 3, 5, 6 네 대의 컴퓨터는 웜 바이러스에 걸리게 된다. 
하지만 4번과 7번 컴퓨터는 1번 컴퓨터와 네트워크상에서 연결되어 있지 않기 때문에 영향을 받지 않는다.

어느 날 1번 컴퓨터가 웜 바이러스에 걸렸다. 
컴퓨터의 수와 네트워크 상에서 서로 연결되어 있는 정보가 주어질 때, 1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수를 출력하는 프로그램을 작성하시오.


입력
첫째 줄에는 컴퓨터의 수가 주어진다. 컴퓨터의 수는 100 이하이고 각 컴퓨터에는 1번 부터 차례대로 번호가 매겨진다. 둘째 줄에는 네트워크 상에서 직접 연결되어 있는 컴퓨터 쌍의 수가 주어진다. 이어서 그 수만큼 한 줄에 한 쌍씩 네트워크 상에서 직접 연결되어 있는 컴퓨터의 번호 쌍이 주어진다.

출력
1번 컴퓨터가 웜 바이러스에 걸렸을 때, 1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수를 첫째 줄에 출력한다.

7
6
1 2
2 3
1 5
5 2
5 6
4 7

4

*/


// 인접행렬 , BFS 
// 참고 https://zzang9ha.tistory.com/40
public class 바이러스_복습2 {
    static int map[][];
    static boolean visit[]; // 방문여부 체크 
    static int n, m, v; // 정점, 간선, 시작정점
    static int count = 0; // 감염된 컴퓨터 수 


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine()); // 컴퓨터 수 (정점)
        m = Integer.parseInt(br.readLine()); // 연결된 컴퓨터 쌍의 수 (간선)
        v = 1;

        map = new int[n+1][n+1];

        visit = new boolean[n+1];
        StringTokenizer st;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            map[u][v] = map[v][u] = 1; // 정점 간에 간선 존재여부 1로 표기, 초기화 0에서 존재할 경우 1로 표기 , ex) 1 2 ->  map[1][2] = map[2][1] = 1
        }

        System.out.println(bfs(1));
        br.close();
    }

   static int bfs(int i) { // bfs는 재귀 아님 큐 자료구조 활용, while 반복문과 for문으로 탐색함. 
     Queue<Integer> q = new LinkedList<Integer>();
     q.offer(i);
     visit[i] = true;

     while (!q.isEmpty()) {
         int temp = q.poll();
         for (int k = 1; k <= n; k++) {
             if (map[temp][k] == 1 && visit[k] == false) {
                 q.offer(k);
                 visit[k] = true;
                 count++;
             }
         }
     }
     return count;
   }    

   
}