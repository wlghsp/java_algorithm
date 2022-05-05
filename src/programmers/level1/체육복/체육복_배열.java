package programmers.level1.체육복;

public class 체육복_배열 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] student = new int[n+2];

        for (int i : reserve) {
            student[i]++;
        }
        for (int i : lost) {
            student[i]--;
        }

        for (int i = 1; i < n+1; i++) {
            if (student[i] == 1) { // 체육복을 빌려줄 수 있는지 확인
                int front = i-1;
                int back = i+1;
                if (student[front] == -1) {
                    student[i]--;
                    student[front]++;
                } else if (student[back] == -1) {
                    student[i]--;
                    student[back]++;
                }
            }
        }
        for (int i = 1; i < n+1; i++) {
            if (student[i] >= 0) {
                answer++;
            }
        }

        return answer;
    }



    public static void main(String[] args) {
        체육복_배열 sol = new 체육복_배열();
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        System.out.println(sol.solution(n, lost, reserve));

    }
}
