package leetcode.leetcode239_sliding_window_maximum;

import java.util.*;

public class Solution {

    /**
     *  우선순위 큐
     */

    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        // 인덱스를 저장하는 데크 선언
        Deque<Integer> dq = new LinkedList<>();


        // 배열 전체 순회
        for (int i = 0; i < nums.length; i++) {
            // 데크 맨 앞이 윈도우 바깥에 있다면 삭제
            if (!dq.isEmpty() && dq.peek() < i - k + 1) {
                dq.poll();
            }
            //  현재 값보다 작은면 데크에서 모두 삭제, 데크에는 현재 값보다 큰 인덱스만 남는다.
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) dq.pollLast();
            // 데크에 현재 인덱스 추가
            dq.add(i);
            // 데크의 첫 번째 값은 가장 큰 값이므로 정답으로 추가
            if (i >= k - 1) {
                result.add(nums[dq.peek()]);
            }

        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }




    /**
     * 큐 사용
     * 시간 초과
     */
    public int[] maxSlidingWindow2(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        // 윈도우 값이 저장될 큐
        Queue<Integer> window = new LinkedList<>();

        // 최댓값의 초깃값은 가장 작은 값으로 설정
        int currentMax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            // 윈도우 데크에 삽입
            window.add(nums[i]);
            // 현재 위치가 슬라이딩 윈도우 크기 안에 있다면 스킵
            if (i < k  - 1) continue;

            // 최댓값이 초깃값이라면 최댓값 다시 설정
            if (currentMax == Integer.MIN_VALUE) {
                currentMax = window.stream().max(Integer::compareTo).get();

            } else if (currentMax < nums[i]) {
                // 현재 값이 기존 최댓값보다 크다면 교체
                currentMax = nums[i];
            }

            // 최댓값을 정답으로 추가
            result.add(currentMax);
            // 큐에서 가장 오래된 값을 삭제하면서, 최댓값이 큐에서 빠진다면 다음번에 다시 구해야 하므로 최댓값 초기화
            if (currentMax == window.poll()) {
                currentMax = Integer.MIN_VALUE;
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     *  브루트 포스
     *  시간 초과
     */
    public int[] maxSlidingWindow1(int[] nums, int k) {
        // 예외 처리
        if (nums.length == 0) {
            return new int[0];
        }

        List<Integer> result = new ArrayList<>();

        // 배열 전체를 순회하며 슬라이드 윈도우별 최댓값을 구한다.
        for (int i = 0; i < nums.length - k + 1; i++) {
            // 첫 번째 값을 최댓값으로 임시 선언
            int max = nums[i];
            // k 크기만큼 순회하며 최댓값 구하기
            for (int j = i + 1; j < i + k; j++) {
                if (nums[j] > max) {
                    max = nums[j];
                }
            }
            result.add(max);
        }
        // List<Integer> → int[] 변환하여 리턴
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
