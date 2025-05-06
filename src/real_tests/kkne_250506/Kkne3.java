package real_tests.kkne_250506;

import java.util.*;

public class Kkne3 {

    static List<Integer>[] adj;

    public int[] solution(int N, int[][] relation){
        adj = new ArrayList[N + 1];

        for (int i = 1; i < N + 1; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] re : relation) {
            adj[re[0]].add(re[1]);
            adj[re[1]].add(re[0]);
        }

        int[] answer = new int[N];

        for (int i = 1; i < N + 1; i++) {
            Set<Integer> friendsSet = new HashSet<>();
            Queue<int[]> queue = new LinkedList<>();
            boolean[] visited = new boolean[N + 1];

            queue.offer(new int[]{i, 0});
            visited[i] = true;

            while (!queue.isEmpty()) {
                int[] cur = queue.poll();
                int node = cur[0], depth = cur[1];
                if (depth == 2) continue;

                for (Integer friend : adj[node]) {
                    if (visited[friend]) continue;

                    friendsSet.add(friend);
                    queue.offer(new int[]{friend, depth + 1});
                    visited[friend] = true;
                }
            }
            answer[i - 1] = friendsSet.size();
        }
        return answer;
    }



    public static void main(String[] args) {
        Kkne3 k = new Kkne3();
        int[] result = k.solution(5, new int[][]{{1,2}, {4,2}, {3, 1}, {4, 5}});
        System.out.println(Arrays.toString(result));
    }
}
