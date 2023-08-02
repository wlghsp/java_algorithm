package programmers.코딩기초트레이닝.문자열잘라서정렬하기;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

    public String[] solution(String myString) {
        StringTokenizer st = new StringTokenizer(myString, "x");
        int N = st.countTokens();
        String[] result = new String[N];
        for (int i = 0; i < N; i++) {
            result[i] = st.nextToken();
        }
        Arrays.sort(result);
        return result;
    }

    public String[] solution2(String myString) {
        return Arrays.stream(myString.split("x"))
                .filter(s -> !s.isEmpty())
                .sorted()
                .toArray(String[]::new);
    }

    public String[] solution1(String myString) {
        StringBuilder sb = new StringBuilder();
        String[] arr = new String[100001];
        int cnt = 0;
        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            if (c == 'x' && !sb.toString().isEmpty()) {
                arr[cnt++] = sb.toString();
                sb.setLength(0);
            } else if (c == 'x') {
                continue;
            } else {
                sb.append(c);

            }
            if (i == myString.length() - 1 && sb.length() > 0) {
                arr[cnt++] = sb.toString();
            }
        }
        String[] answer = Arrays.copyOfRange(arr, 0, cnt);
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution("axbxcxdx")));  // ["a","b","c","d"]
        System.out.println(Arrays.toString(s.solution("dxccxbbbxxaaaa")));  // ["aaaa","bbb","cc","d"]

    }
}
