package thisIsCodingTest.구현.시각;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int h = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i = 0; i < h + 1; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    String time = "";
                    time += String.valueOf(i);
                    time += String.valueOf(j);
                    time += String.valueOf(k);

                    if (time.contains("3")) cnt++;
                    /*for (int l = 0; l < time.length(); l++) {
                        if (time.charAt(l) == '3') {
                            cnt++;
                            break;
                        }
                    }*/
                }
            }
        }
        System.out.println(cnt);
    }

}
