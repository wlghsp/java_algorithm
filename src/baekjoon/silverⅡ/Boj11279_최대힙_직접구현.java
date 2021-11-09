package baekjoon.silverⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;


/*
널리 잘 알려진 자료구조 중 최대 힙이 있다. 
최대 힙을 이용하여 다음과 같은 연산을 지원하는 프로그램을 작성하시오.

    배열에 자연수 x를 넣는다.
    배열에서 가장 큰 값을 출력하고, 그 값을 배열에서 제거한다.

프로그램은 처음에 비어있는 배열에서 시작하게 된다.

입력
첫째 줄에 연산의 개수 N(1 ≤ N ≤ 100,000)이 주어진다. 
다음 N개의 줄에는 연산에 대한 정보를 나타내는 정수 x가 주어진다. 
만약 x가 자연수라면 배열에 x라는 값을 넣는(추가하는) 연산이고, 
x가 0이라면 배열에서 가장 큰 값을 출력하고 그 값을 배열에서 제거하는 경우이다. 
입력되는 자연수는 231보다 작다.

출력
입력에서 0이 주어진 회수만큼 답을 출력한다. 
만약 배열이 비어 있는 경우인데 가장 큰 값을 출력하라고 한 경우에는 0을 출력하면 된다.

13
0
1
2
0
0
3
2
1
0
0
0
0
0


0
2
1
3
2
1
0
0

*/

public class Boj11279_최대힙_직접구현 {

    static int[] heap = new int[100001];
    static int size = 0;
    static StringBuilder sb = new StringBuilder();

    static void swap(int x, int y) {
        int temp = heap[x];
        heap[x] = heap[y];
        heap[y] = temp;
    }

    static void push(int x) {
        heap[++size] = x;// 힙 크기를 하나 증가하고 마지막 노드에 x를 넣는다.
        // 삽입한 것 부터 힙인지 확인, 힙이 아니면 계속 부모노드로 올라가고 힙이면 break
        for (int i = size; i > 1; i/=2) {
            /// 마지막 노드가 자신의 부모 노드보다 크면 swap
            if (heap[i/2] < heap[i]) {
                swap(i/2, i);
            } else {
                break;
            }
        }
    }

    static void pop() {
        sb.append(heap[1] + "\n");
        heap[1] = heap[size]; // 마지막 노드의 값을 루트노드에 둔다.
        heap[size--] = 0; // 힙 크기를 하나 줄이고 마지막 노드를 0으로 초기화
        for (int i = 1; i*2 <= size;) { // 삭제 후 1에서 부터 힙으로 만들어주는 과정
            // 마지막 노드가 왼쪽 노드와 오른쪽 노드보다 크면 반복문을 나감.
            if (heap[i] > heap[i*2] && heap[i] > heap[i*2 +1]) {
                break;
            // 왼쪽 노드가 더 큰 경우, 왼쪽 노드와 마지막 노드를 swap
            } else if (heap[i*2] > heap[i*2 +1]){
                swap(i, i*2);
                i = i * 2;
            // 오른쪽 노드가 더 큰 경우,  오른쪽 노드와 마지막 노드를 swap
            } else {
                swap(i, i*2 +1);
                i = i*2 + 1;
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(br.readLine());
            if (val == 0) {
                if (size == 0) sb.append(0 +"\n");
                else pop();
            } else {
                push(val);
            }
        }
        System.out.print(sb.toString());
        
    }
}
