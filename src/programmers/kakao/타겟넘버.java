package programmers.kakao;

//https://youtu.be/S2JDw9oNNDk
//https://programmers.co.kr/learn/courses/30/lessons/43165
public class 타겟넘버 {

    int[] numbers;

    int target;
    int answer;

    void dfs(int index, int sum) { // sum 누적합
        // 1. 탈출 조건
        if (index == numbers.length) {
            if (sum == target) answer++; // 누적합이 타겟숫자와 같다면 카운트 증가
            return;
        }
        // 2. 수행 동작
        dfs(index + 1, sum + numbers[index]);
        dfs(index + 1, sum - numbers[index]);
    }

    public int solution(int[] numbers, int target) {
        answer = 0;
        this.numbers = numbers;
        this.target = target;

        dfs(0, 0);

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        타겟넘버 T = new 타겟넘버();
        System.out.println(T.solution(numbers, target)); // 5
    }
}
