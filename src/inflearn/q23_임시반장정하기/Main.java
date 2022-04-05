package inflearn.q23_임시반장정하기;

import java.util.*;

public class Main {

    public void solution(int n, int[][] table) {
        int grade = 0;
        int num = 0;

        for (int i = 0; i < n; i++) { // 학생
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < 5; j++) { // 학년
                for (int k = 0; k < n; k++) {
                    if (i==k) continue;
                    if (table[i][j] == table[k][j]) {
                        System.out.printf("[(%d) 번 학생과 (%d) 학생은 (%d) 학년일 때 (%d)과 (%d)반으로 같음]   ", i+1, k+1, j+1, table[i][j], table[k][j]);
                        set.add(k);
                    }
                }
            }
            System.out.printf("%d 번 학생이 총 중복되는 학생은 %d 명임", i + 1, set.size());

            if (num < set.size()) {
                num = set.size();
                grade = i + 1;
            }
            System.out.println(num);
        }
        if (grade == 0 ) {
            System.out.println(1);
        } else {
            System.out.println(grade);
        }

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] table = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                table[i][j] = sc.nextInt();
            }
        }

       T.solution(n, table);
    }
}
