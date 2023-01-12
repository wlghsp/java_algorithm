package CrackingTheCodingInterview.arrays_strings.Q1_06_String_Compression;

public class QuestionC {

    private static String compress(String str) {
        /* 압축된 문자열의 길이가 입력 문자열보다 길다면 입력 문자열을 반환한다. */
        int finalLength = countCompression(str);
        if (finalLength >= str.length()) return str;

        StringBuilder compressed = new StringBuilder(finalLength); // 처음 크기
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
        return compressed.toString();
    }

    private static int countCompression(String str) {
        int compressedLength = 0;
        int countConsecutive = 0;
        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;

            /* 다음 문자와 현재 문자가 같지 않다면 길이를 증기시킨다. */
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressedLength += 1 + String.valueOf(countConsecutive).length();
                countConsecutive = 0;
            }
        }
        return compressedLength;
    }

    public static void main(String[] args) {
        String str = "aa";
        System.out.println(str);
        System.out.println(compress(str));

    }
}
