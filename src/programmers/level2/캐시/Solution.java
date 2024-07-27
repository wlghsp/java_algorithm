package programmers.level2.캐시;

import java.util.LinkedList;

public class Solution {

    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) {
            // 캐시 크기가 0일 경우 모든 접근은 캐시 미스
            return cities.length * 5;
        }

        int totalTime = 0;
        LinkedList<String> cache = new LinkedList<>();

        for (String city : cities) {
            String s = city.toLowerCase();
            if (cache.remove(s)) { // boolean 반환
                totalTime += 1;
                cache.add(s);
            } else {
                totalTime += 5;
                if (cache.size() >= cacheSize) {
                    // 가장 오래된 항목 제거 0 번부터 순서대로임
                    cache.remove(0);
                }
                cache.add(s);
            }
        }

        return totalTime;
    }
}
