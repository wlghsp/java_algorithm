package baekjoon.bronze.bronzeⅢ.boj12790_MiniFantasyWar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int hp = Integer.parseInt(st.nextToken());
            int mp = Integer.parseInt(st.nextToken());
            int attack = Integer.parseInt(st.nextToken());
            int defense = Integer.parseInt(st.nextToken());
            int hp1 = Integer.parseInt(st.nextToken());
            int mp1 = Integer.parseInt(st.nextToken());
            int attack1 = Integer.parseInt(st.nextToken());
            int defense1 = Integer.parseInt(st.nextToken());
            int finalHp = (hp + hp1) < 1 ? 1 : hp + hp1;
            int finalMp = (mp + mp1) < 1 ? 1 : mp + mp1;
            int finalAttack = (attack + attack1) < 0 ? 0 : attack + attack1;
            int finalDefense = defense + defense1;
            System.out.println(finalHp + 5 * finalMp + finalAttack * 2 + finalDefense * 2);
        }

    }
}
