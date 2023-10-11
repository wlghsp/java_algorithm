package programmers.level1.비밀지도;

public class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            String binaryString = decimalToBinary(n, arr1[i] | arr2[i]);
            StringBuilder sb = new StringBuilder();
            for (char c : binaryString.toCharArray()) {
                if (c == '1') sb.append("#");
                else sb.append(" ");
            }
            answer[i] = sb.toString();
        }

        return answer;
    }

    public String decimalToBinary(int size, int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return String.format("%0" + size + "d", Long.parseLong(sb.reverse().toString()));
    }

}
