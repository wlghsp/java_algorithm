package programmers.level1.햄버거만들기;

public class Solution {

    // 느리지만 통과함
    public int solution(int[] ingredient) {
        int answer = 0;
        for (int i = 0; i < ingredient.length - 3; i++) {
            if (ingredient[i] == 1 && ingredient[i + 1] == 2
            && ingredient[i + 2] == 3 && ingredient[i + 3] == 1) {
                for (int j = i + 3; j > 0; j--) {
                    ingredient[j] = (j > 3) ? ingredient[j - 4] : 0;
                }
                answer++;
            }
        }
        return answer;
    }
    // 졸라 빠름
    public int solution1(int[] ingredient) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for (int i : ingredient) {
            sb.append(i);
            if (sb.length() > 3 && sb.subSequence(sb.length() - 4, sb.length()).equals("1231")) {
                answer++;
                sb.delete(sb.length() - 4, sb.length());
            }
        }
        return answer;
    }
}
