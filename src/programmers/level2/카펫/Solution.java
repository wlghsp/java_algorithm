package programmers.level2.카펫;

public class Solution {
    /**
     * brown = boundary, yellow = center
     * center = total - boundary
     * boundary = width * 2 + (width - 2) * 2
     * = (width + height - 2) * 2
     * 완전탐색하여 center와 boundary가 yello, brown에 일치하면
     * 그 width, height 를 반환한다.
     */
    public int[] solution(int brown, int yellow) {
        for (int width = 0; width <= 5000; width++) {
            for (int height = 0; height < width; height++) {
                int boundary = (width + height - 2) * 2;
                int center = width * height - boundary;

                if (brown == boundary && yellow == center) {
                    return new int[]{width, height};
                }
            }
        }

        return null;
    }
}
