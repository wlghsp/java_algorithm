package problemSolving.twoSum;

public class TwoSum2 {
    /*
     * 시간 복잡도 <-> 공간 복잡도 대안1. brute-foce 모든 조합을 시도. n*(n-1) / 2 - 시간: O(n^2) - 공간:
     * O(1) 대안2. 해쉬맵 사용, 루프 1개 돌면서 이미 봤던 값을 해쉬맵에 넣음. - 시간: O(n) - 공간: O(n)
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] ret = new int[2];
                    ret[0] = i;
                    ret[1] = j;
                    return ret;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 2, 7, 11, 15 };
        System.out.println(twoSum(nums, 9).toString());
    }
}