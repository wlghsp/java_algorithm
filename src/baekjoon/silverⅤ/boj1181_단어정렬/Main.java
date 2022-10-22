package baekjoon.silverⅤ.boj1181_단어정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Word implements Comparable<Word> {
    public int length;
    public String word;
    Word(int length, String word) {
        this.length = length;
        this.word = word;
    }

    @Override
    public int compareTo(Word o) {
        if (this.length == o.length) {
            return this.word.compareTo(o.word);
        }
        return this.length - o.length;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Word[] arr = new Word[N];

        for (int i = 0; i < N; i++) {
            String tmp = br.readLine();
            arr[i] = new Word(tmp.length(), tmp);
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0].word).append('\n');

        for (int i = 1; i < arr.length; i++) {
            if (!arr[i].word.equals(arr[i-1].word)) {
                sb.append(arr[i].word).append('\n');
            }
        }

        System.out.println(sb);
    }
}
