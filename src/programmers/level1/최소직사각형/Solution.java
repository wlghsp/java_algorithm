package programmers.level1.최소직사각형;

public class Solution {
    public int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;

        for (int i = 0; i < sizes.length; i++) {
            int w = sizes[i][0];
            int h = sizes[i][1];
            if(w < h) {
                swap(sizes, i);
            }
            maxW = Math.max(sizes[i][0], maxW);
            maxH = Math.max(sizes[i][1], maxH);
        }

        return maxW * maxH;
    }

    private void swap(int[][] sizes, int i) {
        int[] size = sizes[i];
        int tmp = size[0];
        size[0] = size[1];
        size[1] = tmp;
    }
}
