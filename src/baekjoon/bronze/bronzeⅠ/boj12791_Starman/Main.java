package baekjoon.bronze.bronzeⅠ.boj12791_Starman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int Q;
    static int[] years = {1967, 1969, 1970, 1971, 1972, 1973, 1973, 1974, 1975, 1976, 1977, 1977, 1979,
            1980, 1983, 1984, 1987, 1993, 1995, 1997, 1999, 2002, 2003, 2013, 2016};
    static String[] albums = {"DavidBowie", "SpaceOddity", "TheManWhoSoldTheWorld", "HunkyDory", "TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars",
            "AladdinSane", "PinUps", "DiamondDogs", "YoungAmericans", "StationToStation", "Low", "Heroes", "Lodger",
            "ScaryMonstersAndSuperCreeps", "LetsDance", "Tonight", "NeverLetMeDown", "BlackTieWhiteNoise", "1.Outside",
            "Earthling", "Hours", "Heathen", "Reality", "TheNextDay", "BlackStar"};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Q = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < Q; i++) {
            StringBuilder sb = new StringBuilder();
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cnt = 0;
            for (int j = 0; j < 25; j++) {
                if (start <= years[j] && end >= years[j]) {
                    cnt++;
                    sb.append(years[j]).append(" ").append(albums[j]).append("\n");
                }
            }

            if (cnt == 0) {
                System.out.println(cnt);
            } else {
                System.out.println(cnt);
                System.out.print(sb);
            }
        }
    }
}

