package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberReplacement {
    public static void main(String[] args) {
        String input1 = "55.0 < V < 56.9";
        String minCurrent = "50.0";
        String maxCurrent = "79.0";

        // 정규 표현식 패턴 설정
        Pattern pattern = Pattern.compile("\\d+\\.\\d+");

        Matcher matcher = pattern.matcher(input1);
        StringBuffer output = new StringBuffer();

        String firstNumber = null;
        String lastNumber = null;

        while (matcher.find()) {
            if (firstNumber == null) {
                firstNumber = matcher.group();
            }
            lastNumber = matcher.group();
        }

        // minCurrent를 첫 번째 숫자로 교체
        String replacedInput1 = input1.replaceFirst(Pattern.quote(firstNumber), minCurrent);

        // maxCurrent를 마지막 숫자로 교체
        replacedInput1 = replacedInput1.replaceAll(Pattern.quote(lastNumber), maxCurrent);

        System.out.println(replacedInput1);

    }

}
