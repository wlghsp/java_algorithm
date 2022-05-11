package programmers.level1.음양더하기;

public class 음양더하기 {

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            answer += absolutes[i] * (signs[i]? 1: -1);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] ab = new int[]{4,7,12};
        boolean[] signs = new boolean[]{true, false, true};
        System.out.println(solution(ab ,signs));
    }
}
