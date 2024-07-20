package baekjoon.silver.silver3.boj20920_영단어암기는괴로워;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    /**
     * 1. 빈도수 많은 순
     * 2. 단어의 길이 긴 순서
     * 3. 알파벳 사전 순
     */
    static int N, M;
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver3/boj20920_영단어암기는괴로워/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        Map<String, Word> map = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            String w = br.readLine();
            if (w.length() < M) continue;
            Word word = map.getOrDefault(w, new Word(w, 0, w.length()));
            word.increaseFrequency();
            map.put(w, word);
        }

        List<Word> list = new ArrayList<>(map.values());
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (Word word : list) {
            sb.append(word.text).append(System.lineSeparator());
        }

        System.out.println(sb);

    }
}

class Word implements Comparable<Word>{

    public String text;
    public int frequency;
    public int length;

    public Word(String text, int frequency, int length) {
        this.text = text;
        this.frequency = frequency;
        this.length = length;
    }

    public void increaseFrequency() {
        frequency++;
    }

    @Override
    public int compareTo(Word o) {
        if (o.frequency == this.frequency) {
            if (o.length == this.length) {
                return this.text.compareTo(o.text);
            }
            return o.length - this.length;
        }
        return o.frequency - this.frequency;
    }
}