package programmers.level2.뉴스클러스터링;

import java.util.*;

public class Solution1 {

    public int solution(String str1, String str2) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        makeList(str1, list1);
        makeList(str2, list2);

        Map<String, Integer> map1 = createFrequencyMap(list1);
        Map<String, Integer> map2 = createFrequencyMap(list2);

        Set<String> allElements = new HashSet<>(map1.keySet());
        allElements.addAll(map2.keySet());

        int interSectionSize = 0;
        int unionSize = 0;

        for (String element : allElements) {
            Integer count1 = map1.getOrDefault(element, 0);
            Integer count2 = map2.getOrDefault(element, 0);

            interSectionSize += Math.min(count1, count2);
            unionSize += Math.max(count1, count2);
        }

        double ans = unionSize == 0 ? 1.0 : (double) interSectionSize / unionSize;
        return (int) (ans * 65536);
    }

    private void makeList(String str, List<String> list2) {
        for (int i = 0; i < str.length() - 1; i++) {
            String substring = str.substring(i, i + 2);
            if (containsNonAlphabetic(substring)) continue;
            list2.add(substring.toUpperCase());
        }
    }

    public boolean containsNonAlphabetic(String s) {
        return s.matches(".*[^a-zA-Z].*");
    }

    private Map<String, Integer> createFrequencyMap(List<String> list) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String s : list) {
            frequencyMap.put(s, frequencyMap.getOrDefault(s, 0) + 1);
        }
        return frequencyMap;
    }
}
