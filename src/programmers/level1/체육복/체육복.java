package programmers.level1.체육복;

import java.util.Arrays;

/*
점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다. 다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다. 
학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다. 
예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다. 
체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.

전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 
여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때, 
체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.

제한사항

    전체 학생의 수는 2명 이상 30명 이하입니다.
    체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
    여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
    여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
    여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다. 이때 이 학생은 체육복을 하나만 도난당했다고 가정하며, 남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.

입출력 예
n 	lost 	reserve 	return
5 	[2, 4] 	[1, 3, 5] 	 5
5 	[2, 4] 	[3] 	     4
3 	[3] 	[1] 	     2
입출력 예 설명

예제 #1
1번 학생이 2번 학생에게 체육복을 빌려주고, 3번 학생이나 5번 학생이 4번 학생에게 체육복을 빌려주면 학생 5명이 체육수업을 들을 수 있습니다.

예제 #2
3번 학생이 2번 학생이나 4번 학생에게 체육복을 빌려주면 학생 4명이 체육수업을 들을 수 있습니다.

*/


public class 체육복 {
    public int solution1(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length; // 전체에서 잃어버린 사람 빼서 현재 시점의 체육수업 가능자 수 

        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 여분 체육복이 있지만 체육복을 잃어버린 학생 제거
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++; // lost에서 빠지므로 체육가능자 증가
                    lost[i] = reserve[j] = -10; // -1로 처리 해줌 
                    break;
                }
            }
        }

        // 체육복 빌려주기
        for (int lostPerson : lost) {
            for (int i = 0; i < reserve.length; i++) {
                if (reserve[i] == lostPerson -1 || reserve[i] == lostPerson + 1) {
                    answer++;
                    reserve[i] = -10; // 체육복빌려줬으니 -1 처리하여 다시 빌려줄 일 없게 함.  
                    break; // 안쪽 for문 종료 후 바깥쪽for문 돌리게 함. 한 명의 인원 구하기 
                }
            }
        }
        return answer;
    }

    public int solution2(int n, int[] lost, int[] reserve) {
        int[] all = new int[n];
        for (int i : reserve) {
            all[i-1]++;
        }

        for (int i : lost) {
            all[i-1]--;
        }

        System.out.println(Arrays.toString(all));
        for (int i = 0; i < all.length; i++) {
            if (all[i] < 0) {
                if (i != all.length -1 && all[i+1] > 0) {
                    all[i]++;
                    all[i+1]--;
                } else if (i != 0 && all[i-1] > 0) {
                    all[i]++;
                    all[i-1]++;
                }
                    
                
            }
        }

        int answer = 0;
        System.out.println(Arrays.toString(all));
        for (int i = 0; i < all.length; i++) {
            if (!(all[i] < 0)) {
                answer++;
            }
        }

        return answer;
    }
    

    public static void main(String[] args) {
        체육복 sol = new 체육복();
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        System.out.println(sol.solution2(n, lost, reserve));

    }
}
