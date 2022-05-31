package leetcode.finished.LeetCode49_GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solutions {
    /*
       HashMap<String, List<String>> 제네릭 타입이다
       1. hashmap의 키로 정렬한 단어로 하고 그 키들에 정렬 전의 단어들을 집어넣는다
       2. 이때 computeIfAbsent를 사용하여 람다로 부재시에 새 ArrayList를 넣고 아니면 add를 해준다
       3. 완성된 hashmap의 값인 리스트들을 answer에 담아 반환한다
    */
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();

        HashMap<String, List<String>> hm = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            hm.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(s);
        }

        for (List<String> value : hm.values()) {
            answer.add(value);
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        Solutions T = new Solutions();
        StringBuilder sb = new StringBuilder();
        for (List<String> anagram : T.groupAnagrams(strs)) {
            for (String s : anagram) {
                sb.append(s).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

}
