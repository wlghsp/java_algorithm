package programmers.코딩기초트레이닝.커피심부름;

public class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for (String s : order) {
            answer += this.getPrice(s);
        }
        return answer;
    }

    private int getPrice(String menu) {
        int result = 0;
        if (menu.contains("americano") || menu.contains("anything")) {
            result += 4500;
        } else if (menu.contains("cafelatte")) {
            result += 5000;
        }
        return result;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new String[]{"cafelatte", "americanoice", "hotcafelatte", "anything"})); // 19000

    }
}
