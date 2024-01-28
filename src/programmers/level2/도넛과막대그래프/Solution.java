package programmers.level2.도넛과막대그래프;

public class Solution {
    static int N = 1_000_000;
    public int[] solution(int[][] edges) {
        int[] answer = new int[4];
        int maxNode = -1;
        int[][] inOuts = new int[N + 1][2];
        for (int[] edge : edges) {
            int from = edge[0], to = edge[1];
            inOuts[from][0]++; // 나가는 간선
            inOuts[to][1]++;  // 들어오는 간선
            maxNode = Math.max(maxNode, Math.max(edge[0], edge[1]));
        }

        for (int i = 1; i <= maxNode; i++) {
            int outGoing = inOuts[i][0];
            int inComing = inOuts[i][1];
            if (inComing == 0 && outGoing >= 2) answer[0] = i;
            else if (outGoing == 0) {
                answer[2]++;
            } else if (inComing >= 2 && outGoing >= 2) {
                answer[3]++;
            }
        }

        // 생성된 정점에서 각 그래프들에 나가는 간선을 연결했다고 하였으므로
        // 생성된 정점의 나가는 간선의 갯수에서 막대 및 8자모양 그래프의 개수를 빼면 도넛의 갯수임
        answer[1] = inOuts[answer[0]][0] - (answer[2] + answer[3]);

        return answer;
    }
}
