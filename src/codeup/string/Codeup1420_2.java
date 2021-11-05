package codeup.string;
/*
 민준이는 뒤늦게 정보 과목의 중요성을 깨닫고 학습실에서 공부를 하고 있다.
기본 공부가 너무 안 되어 있어 아주 쉬운 문제부터 어려움을 겪은 민준이는 친구에게 물어보려고 한다.

가장 잘 하는 친구에게 물어보기는 질문의 내용이 너무 부끄러워 n명의 친구들 중 정보 성적이 3번째로 높은 친구에게 묻고자 한다.

친구들의 성적은 모두 다르다.
n명의 친구들의 이름과 정보 성적이 주어졌을 때 성적이 세 번째로 높은 학생의 이름을 출력하시오.

입력
첫째 줄에 n이 입력된다. ( 3 <= n <= 50 )
둘째 줄 부터 n+1행까지 친구의 이름과 점수가 공백으로 분리되어 입력된다. 이름은 영문

출력
세 번째로 높은 학생의 이름을 출력한다.

입력 예시   
5
minsu 78
gunho 64
sumin 84
jiwon 96
woosung 55

출력 예시
minsu


*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Tmp {
    String name;
    int score;

    Tmp(String name, int score) {
        this.name = name;
        this.score = score;
    }
}


public class Codeup1420_2 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Tmp student[] = new Tmp[n];
        int max = 0;
        int second = 0;
        int third = 0;

        for (int i = 0; i < student.length; i++) {
            student[i] = new Tmp(br.readLine(), Integer.parseInt(br.readLine()));
            max = (student[i].score > max) ? student[i].score : max;
        }
        for (int i = 0; i < student.length; i++) {
            if (student[i].score == max) {
                continue;
            } // 제일 큰 값이 나오면 다음 반복으로 넘김 
            second = (student[i].score > second) ? student[i].score : second;
            // 배열 중 max 값을 제외한 값 중 가장 큰 값을 second에 넣어주는 코드 
        }

        for (int i = 0; i < student.length; i++) {
            if (student[i].score == max || student[i].score == second) {
                continue;
            }  // max, second 값이 나오면 다음 반복으로 넘김 
            third = (student[i].score > third) ? student[i].score : third;
        }


        // third 와 같은 배열 index를 찾고 해당 인덱스의 name을 출력한다.
        for (int i = 0; i < student.length; i++) {
            if (student[i].score == third) {
                System.out.println(student[i].name);
            }
            return;
        }

        


        
    }
}
