package baekjoon.bronze.bronzeⅠ.Boj2456_나는학급회장이다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    //https://www.acmicpc.net/source/25102073
    // 객체배열 정렬 풀이

    static int N;
    static Student[] students = new Student[3];
    static StringBuilder answer = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < 3; i++) {
            students[i] = new Student(i+1);
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            record(0, Integer.parseInt(st.nextToken()));
            record(1, Integer.parseInt(st.nextToken()));
            record(2, Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(students);
        int max = students[0].score;
        if (students[0].three == students[1].three) {
            if (students[0].two == students[1].two) {
                answer.append(0).append(" ").append(max);
                System.out.println(answer);
                return;
            }
        }

        answer.append(students[0].index).append(" ").append(max);

        System.out.println(answer);

    }

    private static void record(int index, int score) {
        if (score == 3) {
            students[index].score += 3;
            students[index].three++;
        }

        else if (score == 2) {
            students[index].score += 2;
            students[index].two++;
        }

        else {
            students[index].score += 1;
        }
    }
}

class Student implements Comparable<Student> {
    int index;
    int score;
    int three;
    int two;
    public Student(int index) {
        this.index = index;
        this.score = 0;
        this.three = 0;
        this.two = 0;
    }

    @Override
    public int compareTo(Student o) {
        if (o.score == this.score) {
            if (o.three == this.three)
                return o.two - this.two;
            return o.three - this.three;
        }

        return o.score - this.score;
    }
}