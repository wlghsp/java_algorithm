package leetcode.finished;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Leetcode350_IntersectionOfTwoArraysⅡ {

    public int[] intersect1(int[] nums1, int[] nums2) {
         /*
        1. 먼저 HashMap에 nums1의 값을 키로 담고 값에 빈도를 담아준다. map에 있을 경우 1을 늘려주는 방식으로 빈도를 담는다.
        2. list를 생성하고 nums2의 값이 map의 키로 존재하는데, map의 값이 1보다 클 경우 map에다 다시 1을 뺀 값을 담아준다.
        3. map의 값이 1일 경우 삭제하여 중복으로 담기지 않게 한다.

        이해가 안되니 좀 더 줄여서 써 보자
        1.  map으로 nums1 의 숫자를 키로 하고 그 빈도수를 기록한다.
        2. nums2의 값들을 nums1의 값들의 빈도가 기록된 map에서 포함여부를 체크하고 빈도가 1보다 클 경우 빈도 1을 줄이고 map에 담아준다.
        3. 빈도가 1인 키는 제거하여 준다. 그리고 값을 리스트에 담는다.
        4. 리스트 값들을 배열에 담아 반환한다.
     */
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums1) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i : nums2) {
            if (map.containsKey(i)) { //
                if (map.get(i) > 1) { //
                    map.put(i, map.get(i) - 1);
                } else {
                    map.remove(i); // 삭제 됨으로써 중복이 발생하지 않는다. 포함여부 체크할 때 중복값이 리스트에 추가 안되게 한다.
                }
                list.add(i);
            }
        }

        int[] result = new int[list.size()];
        int i = 0;
        while (i < list.size()) { // 리스트 값들을 배열로 옮겨 담기
            result[i] = list.get(i);
            i++;
        }
        return result;
    }

    public int[] intersect(int[] nums1, int[] nums2) {
         /*
           배열이 정렬되어 있다면 어떻게 최적화할 것인가?
           투 포인터 를 활용한다.
           1. p1, p2 변수를 설정하고 while문의 조건은 각자 두 숫자 배열의 길이만큼이다.
           2. 정렬된 배열이므로 한쪽이 클 경우 작은 쪽 배열의 포인터를 증가시켜 비교한다.
           3. 그리고 서로 크거나 작지 않다면, list에 담아 주고 두 포인터를 증가시킨다.

         */
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> list = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] < nums2[p2]) {
                p1++;
            } else if (nums1[p1] > nums2[p2]) {
                p2++;
            } else {
                list.add(nums1[p1]);
                p1++;
                p2++;
            }
        }

        int[] result = new int[list.size()];
        int i = 0;
        while (i< list.size()) {
            result[i] = list.get(i).intValue();
            i++;
        }

        return result;

    }

    public static void main(String[] args) {
        Leetcode350_IntersectionOfTwoArraysⅡ T = new Leetcode350_IntersectionOfTwoArraysⅡ();

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};

        System.out.println(Arrays.toString(T.intersect(nums1, nums2))); // [2,2]
        System.out.println(Arrays.toString(T.intersect(nums3, nums4))); // [4,9]
    }
}
