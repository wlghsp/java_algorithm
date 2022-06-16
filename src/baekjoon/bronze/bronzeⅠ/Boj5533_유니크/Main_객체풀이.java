package baekjoon.bronze.bronzeⅠ.Boj5533_유니크;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_객체풀이 {
    // https://www.acmicpc.net/source/14716946
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] checkNum = new int[3][101]; // 각 게임의 점수의 빈도수 기록
        Person[] people = new Person[N];

        for (int i = 0; i < N; i++) {
            String[] splitedStr = br.readLine().split(" ");
            int[] scores = new int[3];

            for (int j = 0; j < 3; j++) {
                scores[j] = Integer.parseInt(splitedStr[j]);
                checkNum[j][scores[j]]++; // 각 게임의 해당 숫자의 빈도수 기록
            }

            people[i] = new Person(scores[0], scores[1], scores[2]);
        }

        for (int i = 0; i < N; i++) {
            int sum = 0;

            for (int j = 0; j < 3; j++) {
                int score = people[i].scores[j];

                if (checkNum[j][score] == 1) { // 빈도수가 1인 점수
                    sum += score;
                }
            }
            System.out.println(sum);
        }
    }
}

class Person {
    int[] scores = new int[3];

    public Person(int first, int second, int third) {
        scores[0] = first;
        scores[1] = second;
        scores[2] = third;
    }
}
