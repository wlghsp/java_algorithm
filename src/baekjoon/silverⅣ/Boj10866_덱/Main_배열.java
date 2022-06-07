package baekjoon.silverⅣ.Boj10866_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main_배열 {

    static int front = 10000;
    static int back = 10000;
    static int size = 0;
    static int[] deque = new int[20001];

    /*
     Deque 배열에서 front가 최종적으로 가리키는 위치는 항상 비워둔다.
     즉, 가장 앞에 있는 원소는 front + 1이 된다.

     이유는 만약 front의 최종 위치에 원소를 넣게 되면 다음과 같이 예외가 발생한다.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayDeque<String> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            String[] s = br.readLine().split(" ");

            switch (s[0]) {
                case "push_front":
                    push_front(Integer.parseInt(s[1]));
                    break;
                case "push_back":
                    push_back(Integer.parseInt(s[1]));
                    break;
                case "pop_front":
                    sb.append(pop_front()).append('\n');
                    break;
                case "pop_back":
                    sb.append(pop_back()).append('\n');
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
                case "front":
                    sb.append(front()).append('\n');
                    break;
                case "back":
                    sb.append(back()).append('\n');
                    break;
            }

        }
        System.out.println(sb);
    }

    static void push_front(int val) {
        // 원소를 먼저 넣은 뒤 front를 감소시킨다.
        deque[front] = val;
        front--;
        size++;
    }

    static void push_back(int val) {
        back++;
        size++;
        deque[back] = val;
    }

    static int pop_front(){
        if (size == 0) {
            return -1;
        }
        /*
          front + 1이 front 원소이므로 해당 원소를 임시 변수에 둔 뒤
          front을 +1 증가시킨다.
        */
        int ret = deque[front + 1];
        front++;
        size--;
        return ret;
    }

    static int pop_back() {
        if (size == 0) {
            return -1;
        }
        int ret = deque[back];
        back--;
        size--;
        return ret;
    }

    static int size() {
        return size;
    }

    static int empty() {
        if (size == 0){
            return 1;
        }
        return 0;
    }

    static int front() {
        if (size == 0) {
            return -1;
        }
        return deque[front + 1];
    }

    static int back() {
        if (size == 0) {
            return -1;
        }

        return deque[back];
    }


}
