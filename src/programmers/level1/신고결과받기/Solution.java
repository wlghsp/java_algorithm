package programmers.level1.신고결과받기;

import java.util.*;

public class Solution {

    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Integer> reported = new HashMap<>();
        Map<String, Set<String>> record = new HashMap<>();
        Set<String> stoppedIds = new HashSet<>();

        // 초기화
        for (String id : id_list) {
            reported.put(id, 0);
            record.put(id, new HashSet<>());
        }

        // 신고 문자열
        for (String text : report) {
            String[] split = text.split(" ");
            String singoja = split[0];
            String warned = split[1];

            // 기록하기
            Set<String> ids = record.get(singoja);
            if (ids.contains(warned)) continue; // 이미 신고했다면 패스
            ids.add(warned);
            record.put(singoja, ids);

            // 신고당한 횟수 기록 및 k번일 때 정지당한 아이디로 추가
            int warnedCnt = reported.get(warned) + 1;
            if (warnedCnt == k) stoppedIds.add(warned);
            reported.put(warned, warnedCnt);
        }

        int[] answer = new int[id_list.length];
        // 처리결과 메일 횟수
        for (int i = 0; i < answer.length; i++) {
            String id = id_list[i];
            Set<String> reportedIds = record.get(id);
            int cnt = 0;
            for (String reportedId : reportedIds) {
                if (stoppedIds.contains(reportedId)) {
                    cnt++;
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }
}
