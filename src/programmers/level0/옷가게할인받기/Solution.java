package programmers.level0.옷가게할인받기;

public class Solution {

    public int solution(int price) {
        int answer = 0;
        if (price >= 100000 && price < 300000) answer = (int) (price * 0.95);
        else if (price >= 300000 && price < 500000) {
            answer = (int) (price * 0.90);
        } else if (price >= 500000) {
            answer = (int) (price * 0.80);
        } else {
            answer = price;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(150000)); // 142500
        System.out.println(s.solution(580000)); // 464000
    }
}
