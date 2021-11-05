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
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Codeup1420 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<Integer> gradeList = new ArrayList<>();
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int grade = Integer.parseInt(st.nextToken());
            nameList.add(name);
            gradeList.add(grade);
        }
        ArrayList<Integer> gradeList2 = new ArrayList<>(gradeList);
        // Collections.sort(gradeList2, Collections.reverseOrder()); 1. 내림차순 정렬
        gradeList2.sort(Comparator.reverseOrder());

        int third = gradeList2.get(2); // 3등인 2번 인덱스 값을 third에 할당
        System.out.println(nameList.get(gradeList.indexOf(third))); // indexOf로 값의 인덱스를 앞에서부터 찾는다. lastIndexOf는 뒤에서부터 찾는다.
        // 없을 경우 -1 반환
        // 정렬되지 않은 성적리스트에서 third 값의 인덱스를 구해서 이름리스트에서 그 인덱스로 이름을 찾는다. 

    }
}
