package thisIsCodingTest.정렬.성적이낮은순서로학생출력하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;



class Student implements Comparable<Student> {
    public String name;
    public int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int compareTo(Student o) {
        return Integer.compare(this.score, o.score);
    }

}
public class Main {
/*
2
홍길동 95
이순신 77
 */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Student[] students = new Student[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int score = Integer.parseInt(st.nextToken());
            students[i] = new Student(name, score);
        }
        Arrays.sort(students);
        for (int i = 0; i < N; i++) {
            System.out.print(students[i].name + " ");
        }
    }
}
