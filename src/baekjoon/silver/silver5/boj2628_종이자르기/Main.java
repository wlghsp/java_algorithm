package baekjoon.silver.silver5.boj2628_종이자르기;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int width, length, cutCnt;
    static ArrayList<Integer> widthList, lengthList;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver5/boj2628_종이자르기/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        width = Integer.parseInt(st.nextToken());
        length = Integer.parseInt(st.nextToken());
        cutCnt = Integer.parseInt(br.readLine());

        widthList = new ArrayList<>();
        lengthList = new ArrayList<>();

        // 시작과 끝 경계 추가
        widthList.addAll(List.of(0, width));
        lengthList.addAll(List.of(0, length));

        for (int i = 0; i < cutCnt; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == 0) {
                lengthList.add(b);
            } else {
                widthList.add(b);
            }
        }
        widthList.sort(Comparator.naturalOrder());
        lengthList.sort(Comparator.naturalOrder());

        // 배열에서 0이 가장 넓은 구간의 길이 구하기 함수
        int maxOne = findMaxGap(widthList);
        int maxTwo = findMaxGap(lengthList);

        System.out.println(maxTwo * maxOne);

    }

    private static int findMaxGap(List<Integer> list) {
        int result = Integer.MIN_VALUE;
        for (int i = 1; i < list.size(); i++) {
            result = Math.max(result, list.get(i) - list.get(i - 1));
        }
        return result;
    }
}
