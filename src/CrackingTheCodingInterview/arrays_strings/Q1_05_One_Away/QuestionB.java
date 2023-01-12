package CrackingTheCodingInterview.arrays_strings.Q1_05_One_Away;

public class QuestionB {


    private static boolean oneEditAway(String first, String second) {
        /* 길이 체크 */
        if (Math.abs(first.length() - second.length()) > 1) {
            return false;
        }

        /* 길이가 짧은 문자열과 긴 문자열 찾기 */
        String s1 = first.length() < second.length() ? first : second;
        String s2 = first.length() < second.length() ? second : first;

        int index1 = 0;
        int index2 = 0;
        boolean foundDifference = false;
        while (index2 < s2.length() && index1 < s1.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                /* 반드시 첫 번째로 다른 문자여야 한다.*/
                if (foundDifference) return false;
                foundDifference = true;
                if (s1.length() == s2.length()) { // 교체의 경우 짧은 문자열의 포인터를 증가
                    index1++;
                }
            } else {
                index1++; // 동일하다면 짧은 문자열의 포인터를 증가
            }
            index2++; // 긴 문자열의 포인터는 언제나 증가
        }
        return true;

    }

    public static void main(String[] args) {
        String a = "palee";
        String b = "pale";
        boolean isOneEdit1 = oneEditAway(a, b);
        System.out.println(a + ", " + b + ": " + isOneEdit1);

        String c = "pale";
        String d = "pkle";
        boolean isOneEdit2 = oneEditAway(c, d);
        System.out.println(c + ", " + d + ": " + isOneEdit2);
    }
}
