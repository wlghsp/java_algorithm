package baekjoon.bronze.bronzeⅣ.boj17009_WinningScore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int apples = 0;
        int bananas = 0;

        apples += Integer.parseInt(br.readLine()) * 3;
        apples += Integer.parseInt(br.readLine()) * 2;
        apples += Integer.parseInt(br.readLine());

        bananas += Integer.parseInt(br.readLine()) * 3;
        bananas += Integer.parseInt(br.readLine()) * 2;
        bananas += Integer.parseInt(br.readLine());

        if (bananas > apples) System.out.println("B");
        else if (apples > bananas) System.out.println("A");
        else System.out.println("T");


    }
}
