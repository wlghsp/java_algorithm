package goorm.출석부;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Person implements Comparable<Person> {
    public String name;
    public Double height;

    Person (String name, Double height) {
        this.name = name;
        this.height = height;
    }


    @Override
    public int compareTo(Person o) {
        if (o.name.equals(this.name)) {
            return this.height.compareTo(o.height);
        }
        return this.name.compareTo(o.name);
    }
}


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Person[] arr = new Person[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            Double he = Double.parseDouble(st.nextToken());
            arr[i] = new Person(name, he);
        }

        Arrays.sort(arr);
        System.out.printf("%s %.2f", arr[K-1].name, arr[K-1].height);

    }
}
