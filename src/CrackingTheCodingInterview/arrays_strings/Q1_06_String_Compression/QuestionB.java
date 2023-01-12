package CrackingTheCodingInterview.arrays_strings.Q1_06_String_Compression;

public class QuestionB {

    private static String compress(String str) {
        StringBuilder compressed = new StringBuilder();
        int countConsecutive = 0;
        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;

            /* 다음 문자와 현재 문자가 같지 않다면 현재 문자를 결과 문자열에 추가해준다. */
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return compressed.length() < str.length() ? compressed.toString() : str;
    }

    public static void main(String[] args) {
        String str = "aa";
        System.out.println(str);
        System.out.println(compress(str));

    }
}
