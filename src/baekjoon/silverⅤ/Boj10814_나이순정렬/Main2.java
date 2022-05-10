package baekjoon.silverⅤ.Boj10814_나이순정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main2 {


    public static class Person {
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return age + " " + name + "\n";
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Person[] p = new Person[N];


        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            p[i] = new Person(age, name);
        }

        Arrays.sort(p, Comparator.comparingInt(o -> o.age));

//        Arrays.sort(p, (o1, o2) -> o1.age - o2.age);


//        Arrays.sort(p, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.age - o2.age;
//            }
//        });

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            //  객체 배열의 객체를 출력하면 해당 인덱스의 객체의 toString()이 출력됨
            sb.append(p[i]);
        }

        System.out.println(sb);






    }
}
