package codesignal;

public class CheckPalindrome {

    static boolean solution(String str) {

        // 투 포인터
        int p = 0;
        int q = str.length() - 1;
        while (p < q) {
            if (str.charAt(p++) != str.charAt(q--)) {
                return false;
            }
        }

        return true;
    }

    // https://www.baeldung.com/java-palindrome
    public boolean isPalindrome(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();

        int length = clean.length();

        int forward = 0;

        int backward = length - 1;

        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward++);
            if (forwardChar != backwardChar) {
                return false;
            }
        }

        return true;
    }





    public static void main(String[] args) {
        System.out.println(solution("aabaa"));
        System.out.println(solution("abac"));
        System.out.println(solution("a"));
    }

}
