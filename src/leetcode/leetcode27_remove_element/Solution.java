package leetcode.leetcode27_remove_element;

public class Solution {

    public int removeElement(int[] nums, int val) {
        int l = 0, r = nums.length - 1;
        while (l <= r) { // 반복은 l과 r이 같아 질 때까지
            if (nums[l] == val) { // val과 같은 수를 발견하면
                swap(nums, l, r); // l과 r의 인덱스의 수를 교환
                r--; // r의 위치를 채워 넣었으니 r을 감소시킴
            } else { // val과 다른 수라면
                l++; // val 과 같은 수가 아니므로 l을 증가시킨다.
            }
        }
        return l; // val과 같지 않은 숫자의 갯수를 반환
    }

    private void swap(int[] nums, int i , int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
