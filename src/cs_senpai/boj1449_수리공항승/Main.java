package cs_senpai.boj1449_수리공항승;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        boolean[] coord = new boolean[1001];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int loc = Integer.parseInt(st.nextToken());
            coord[loc] = true;
        }

        int ans = 0;
        int x = 0;
        while (x <= 1000) {
            if (coord[x]){
                ans++;
                x += L;
            }

            else {
                x++;
            }
        }
        System.out.println(ans);

    }
}
