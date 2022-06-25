package coding_interview_in_java.LeetCode26_RemoveDuplicatesfromSortedArray;

public class Solution {


    public static int removeDuplicates(int[] nums) {
        if (nums.length < 2) { // 2개 미만이면 중복이 없어 그 크기를 그대로 반환
            return nums.length;
        }

        int j = 0;
        int i = 1;

        while (i < nums.length) {
            if (nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }

            i++;
        }

        return j + 1; // j는 중복숫자를 카운팅하기도 함
    }


    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(removeDuplicates(nums));
    }
}
