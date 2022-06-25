package coding_interview_in_java.LeetCode27_RemoveElement;

public class Solution {

    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = 0;

        /*

        삭제할 값이 아니므로 값을 원래 배열에 넣어준다

         */

        while (j < nums.length) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }

            j++;
        }
        return i;

    }

    public static void main(String[] args) {
        Solution S = new Solution();

        int[] nums = {3, 2, 2, 3};
        System.out.println(S.removeElement(nums, 3));
    }

}
