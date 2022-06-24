package inflearn.q42_응급실;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static Queue<Person> queue;

    public int solution(int[] arr, int M){
        int answer = 0;
        queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            queue.offer(new Person(i, arr[i]));
        }

        while (!queue.isEmpty()) {
            Person tmp = queue.poll();
            for (Person p : queue) {
                if (p.priority > tmp.priority) {
                    queue.offer(tmp);
                    tmp = null;
                    break;
                }
            }

            if (tmp != null) {
                answer++;
                if (tmp.id == M) return answer;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(arr, M));

    }
}

class Person {
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}