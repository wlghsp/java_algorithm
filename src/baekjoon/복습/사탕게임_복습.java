package baekjoon.복습;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
브루트 포스, 완전탐색 하는 문제 
모든 경우의 수를 시도해보는 문제이다. 


이 문제에는 인접한 서로 다른 문자를 교환하라고 되어 있지만
풀이에는 먼저 무조건 교환하고 탐색한다. 


일단 무조건 교환하고 확인하는 방식으로 전체탐색을 통해 가장 긴 연속 부분(행 또는 열)을 찾아내어 출력한다. 

*/


public class 사탕게임_복습 {

    static char[][] board; // 맵
    static int N; // 맵 가로 세로 크기 
    static int max = 0;  // 먹을 수 있는 최대 사탕의 수 

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());    // 가로세로 길이가 N인 사탕판 입력 
        board = new char[N][N];    // 정사각형 모양이므로 가로세로 길이 동일 
        
        // N*N 사탕입력 받기 
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = str.charAt(j);
            }
        }

        // 가로로 인접한 두 사탕 교환하고 최대 사탕 갯수 찾고 원위치 시킴
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N-1; j++) { // j는 +1을 해서 오른족 사탕과 비교하므로 N-1
                // 가로로 인접한 두 문자 교환 - 가로로 인접한 모든 두 문자들
                // swap(board[i][j], board[i][j+1])
                char temp = board[i][j];
                board[i][j] = board[i][j+1];
                board[i][j+1] = temp;

                // 한번 두 문자의 자리를 바꾸는 경우마다 가로세로 체크
                // 한 페이스마다 가로세로 체크
                // 이 메소드를 여기로 불러와 적용하는 것 !!! (중요) 가로의 두 문자의 위치를 바꾸었어도
                // 반드시 가로 세로 모두 반복되는 문자의 개수를 체크해야함. 
                // (가로줄의 문자 순서 바꾸었을때도 세로줄 개수세는 것에 영향을 주기 때문)
                arrCheck();
                // 이전에 교환한 문자 복구 // 다음 페이스에서 또 이어서 해야하기 때문에
                temp = board[i][j];
                board[i][j] = board[i][j+1];
                board[i][j+1] = temp;

            }
        }

        // 세로로 인접한 두 사탕 교환하고 최대 사탕 개수 찾고 원위치
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N-1; j++) {
                // swap(board[j][i], board[j+1][i])
                char temp = board[j][i];
                board[j][i] = board[j+1][i];
                board[j+1][i] = temp;
                //가로 세로 체크
                arrCheck();

                // 위에서 교환한 문자 복구 
                temp = board[j][i];
                board[j][i] = board[j+1][i];
                board[j+1][i] = temp;
            }

        }
        bw.write(String.valueOf(max));     // 전체탐색하여 그중 최대값 구해서 출력함 
        bw.flush();
        bw.close();
        br.close();
    }


    // 가로 세로로 비교하면서 먹을 수 있는 사탕의 최대 갯수 찾기 
    static void arrCheck() { // 두 문자가 바뀌는 모든 경우의 수마다 각각의 사탕을 체크함. 
        // -> 가로로 체크 
        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = 0; j < N-1; j++) {
                // 이전 사탕과 동일한 경우 -> 계속 만든다. 
                if (board[i][j]==board[i][j+1])
                    count++;
                // 이전과 다른 사탕인 경우 -> 새로 먹어야하므로 1로 초기화
                // 왜 1로 초기화하는가?
                // 하나부터 세기 시작하니까
                else
                    count = 1;
                // 사탕 최대 갯수 저장
                // Math.max(a,b) : a와 b중 더 큰 수를 반환함. 
                // max는 처음에는 0이지만 i=0일 때 세트의 count는 1이상 이기 때문에 max<count이므로 
                // max 에는 count값이 대입되고 이 값을 지닌채로 i=1 페이스에서 이때의 count값과 max의 값을 서로 비교함.
                // i가 N-1 인 페이스까지 이 과정이 반복되고 결국 max에는 최대값이 들어가게 된다. 
                max = Math.max(max, count);
            }
        }

        // 세로로 체크
        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = 0; j < N-1; j++) {
                if(board[j][i] == board[j+1][i])
                    count++;
                else count = 1;
                max = Math.max(max, count);
            }
        }
    }
}
