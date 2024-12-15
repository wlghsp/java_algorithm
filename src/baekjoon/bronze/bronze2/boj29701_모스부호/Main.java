package baekjoon.bronze.bronze2.boj29701_모스부호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class Main {

    private static Map<String, String> makeMap() {
        return Map.ofEntries(
                Map.entry(".-", "A"), Map.entry("-...", "B"), Map.entry("-.-.", "C"), Map.entry("-..", "D"),
                Map.entry(".", "E"), Map.entry("..-.", "F"), Map.entry("--.", "G"), Map.entry("....", "H"),
                Map.entry("..", "I"), Map.entry(".---", "J"), Map.entry("-.-", "K"), Map.entry(".-..", "L"),
                Map.entry("--", "M"), Map.entry("-.", "N"), Map.entry("---", "O"), Map.entry(".--.", "P"),
                Map.entry("--.-", "Q"), Map.entry(".-.", "R"), Map.entry("...", "S"), Map.entry("-", "T"),
                Map.entry("..-", "U"), Map.entry("...-", "V"), Map.entry(".--", "W"), Map.entry("-..-", "X"),
                Map.entry("-.--", "Y"), Map.entry("--..", "Z"), Map.entry(".----", "1"), Map.entry("..---", "2"),
                Map.entry("...--", "3"), Map.entry("....-", "4"), Map.entry(".....", "5"), Map.entry("-....", "6"),
                Map.entry("--...", "7"), Map.entry("---..", "8"), Map.entry("----.", "9"), Map.entry("-----", "0"),
                Map.entry("--..--", ","), Map.entry(".-.-.-", "."), Map.entry("..--..", "?"), Map.entry("---...", ":"),
                Map.entry("-....-", "-"), Map.entry(".--.-.", "@")
        );
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = makeMap();

        int N = Integer.parseInt(br.readLine());
        String[] message = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for (String m : message) {
            sb.append(map.get(m));
        }

        System.out.println(sb);
    }
}
