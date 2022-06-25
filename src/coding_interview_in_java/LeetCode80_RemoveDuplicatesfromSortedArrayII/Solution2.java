package coding_interview_in_java.LeetCode80_RemoveDuplicatesfromSortedArrayII;

public class Solution2 {

    public int removeDuplicates(int[] nums) {
        if (nums == null) return 0;

        if (nums.length < 2) return nums.length;

        int i = 1; // point to previous
        int j = 2; // point to current

        while (j < nums.length) {
            if (nums[j] == nums[i] && nums[j] == nums[i - 1]) {
                j++;
            } else {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }


        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        Solution2 S = new Solution2();
        System.out.println(S.removeDuplicates(nums));
    }
}
