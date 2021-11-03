package codeup.basic100;

import java.util.Scanner;

/*
3 6 9 게임을 하던 영일이는 3 6 9 게임에서 잦은 실수로 계속해서 벌칙을 받게 되었다.
3 6 9 게임의 왕이 되기 위한 마스터 프로그램을 작성해 보자.

참고
중첩의 원리
반복 실행 구조 안에 선택 실행 구조를 자유롭게 중첩할 수 있다.

예시
int i;
for(i=1; i<=100; i++) //1부터 100까지 반복
{
  if(i%3==0 || i%5==0) printf("%d ", i); //3또는 5의 배수인 경우 그 수 출력
}

** 3 6 9 게임은?
여러 사람이 순서를 정해 순서대로 수를 부르는 게임이다.
만약 3, 6, 9 가 들어간 수를 자신이 불러야 하는 상황이면, 대신 "박수" 를 쳐야 한다.
33까지 진행했다면? "짝짝"과 같이 박수를 두 번 치는 형태도 있다.


9

1 2 X 4 5 X 7 8 X
*/

public class Codeup1083 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0) {
        System.out.print("X" + " ");
      } else {
        System.out.print(i + " ");
      }
    }

  }
}
