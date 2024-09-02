package programmers.level2.주차요금계산;

import java.util.*;

public class Solution {

    public int[] solution(int[] fees, String[] records) {
        int basicTime = fees[0], basicFee = fees[1], perMin = fees[2], plusFee = fees[3];

        // 1. 차량 번호 키 누적 주차 시간 저장 맵 생성
        Map<String, Integer> car = new HashMap<>();
        for (String record : records) {
            String[] idx = record.split(" ");
            car.put(idx[1], 0);
        }

        // 2. 차량 입차 시간 기록 맵 생성 후 records 에 따라 기록 car 맵 업데이트
        Map<String, Integer> dic = new HashMap<>();
        for (String record : records) {
            String[] idx = record.split(" ");
            String[] time = idx[0].split(":");
            int inTime = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);

            if (idx[2].equals("IN")) { // 입차인 경우
                dic.put(idx[1], inTime); // 입차 시간 기록
            } else if (idx[2].equals("OUT")) { // 출차인 경우
                if (dic.containsKey(idx[1])) { // 입차 기록이 있는 경우
                    // 누적 주차 시간 계산
                    Integer in = car.get(idx[1]);
                    in += inTime - dic.get(idx[1]);
                    car.put(idx[1], in); //
                    dic.put(idx[1], -1); // 출차 처리 완료 표시
                }
            }
        }

        // 3.출차 기록이 없는 차량의 주차 시간 계산
        for (Map.Entry<String, Integer> entry : dic.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            if (value != -1) { // 입차는 했지만 출차 기록이 없는 경우
                int fee = car.get(key) + (1439 - dic.get(key));
                car.put(key, fee);
            }
        }

        List<int[]> answer = new ArrayList<>();

        // 4. 각 차량에 대해 요금 계산
        for (Map.Entry<String, Integer> entry : car.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value <= basicTime) {
                answer.add(new int[]{Integer.parseInt(key), basicFee});
            } else {
                double totalFee = basicFee + Math.ceil((double) (value - basicTime) / perMin) * plusFee;
                answer.add(new int[]{Integer.parseInt(key), (int)totalFee});
            }
        }

        answer.sort(Comparator.comparingInt(a -> a[0]));

        return answer.stream()
                .mapToInt(a -> a[1])
                .toArray();
    }
}
