package programmers.level3.네트워크;



public class 네트워크 {
    static boolean[] chk;

    public static void dfs(int[][] computers, int i) {
        for (int j = 0; j < computers.length; j++) {
            if(computers[i][j]== 1 && !chk[j]) {
                chk[j] = true;
                dfs(computers, j);
            }
        }
    }
    public static int solution(int n, int[][] computers) {
        int answer = 0;
        chk = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!chk[i]) {
                answer++;
                chk[i] = true;
                dfs(computers, i);
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(solution(n, computers));
    }
}
