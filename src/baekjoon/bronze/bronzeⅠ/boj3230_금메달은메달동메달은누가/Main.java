package baekjoon.bronze.bronzeⅠ.boj3230_금메달은메달동메달은누가;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

class Player implements Comparable<Player>{
    public int id;
    public int rank;

    Player(int id, int rank) {
        this.id = id;
        this.rank = rank;
    }

    public int compareTo(Player p) {
        return this.rank - p.rank;
    }

}
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static void makeRank(Player[] p, int sz) throws IOException {

        for (int i = 0; i < sz; i++) {
            p[i].rank = Integer.parseInt(br.readLine());
            for (int j = 0; j < sz; j++) {
                if (p[i].id == p[j].id) continue;
                else if (p[i].rank <= p[j].rank) { // 새로 입력된 랭크와 같거나 크면 랭크를 올려준다
                    p[j].rank++;
                }
            }
        }

    }
    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Player[] players = new Player[N];

        for (int i = 0; i < N; i++) {
            players[i] = new Player(i + 1, 0);
        }

        makeRank(players, N);
        Arrays.sort(players); // 오름차순 정렬
        Player[] secondP = Arrays.copyOfRange(players, 0, M); // M등까지 배열 복사
        Arrays.sort(secondP, Collections.reverseOrder()); // 내림차순 정렬
        makeRank(secondP, M); // 랭크만들기
        Arrays.sort(secondP); // 오름차순 정렬

        for (int i = 0; i < 3; i++) {
            System.out.println(secondP[i].id);
        }
    }
}
