package cos_pro.투표결과;

public class Main {

    
    public int solution(int[] votes, int N, int K) {
        int[] counter = new int[N + 1];
        for (int i = 0; i < votes.length; i++) {
            counter[votes[i]] += 1;
        }
        int answer = -1;
        for (int i = 0; i <= N; i++) {
            if (counter[i] == K) answer += 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main sol = new Main();

        int[] votes = {2, 5, 3, 4, 1, 5, 1, 5, 5, 3};
        int N = 5;
        int K = 2;
        int ret = sol.solution(votes, N, K);

        System.out.println("ret = " + ret);
    }
}
