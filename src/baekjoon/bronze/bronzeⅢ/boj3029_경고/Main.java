package baekjoon.bronze.bronzeⅢ.boj3029_경고;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String t = br.readLine();
        if (n.equals(t)) {
            System.out.println("24:00:00");
            System.exit(0);
        }
        String[] now = n.split(":");
        int hh = Integer.parseInt(now[0]);
        int mm = Integer.parseInt(now[1]);
        int ss = Integer.parseInt(now[2]);
        String[] time = t.split(":");
        int hh1 = Integer.parseInt(time[0]);
        int mm1 = Integer.parseInt(time[1]);
        int ss1 = Integer.parseInt(time[2]);
        int finalHH = hh1 - hh;
        int finalMM = mm1 - mm;
        int finalSS = ss1 - ss;
        if (finalSS < 0){
            finalSS += 60;
            finalMM--;
        }
        if (finalMM < 0){
            finalMM += 60;
            finalHH--;
        }
        if (finalHH < 0) {
            finalHH += 24;
        }

        System.out.printf("%02d:%02d:%02d", finalHH, finalMM, finalSS);
    }
}
/*
23:45:22
00:11:11

00:00:00
00:00:00
 */