package java_study;

public class substring_ex01 {
    public static void main(String[] args) {
        // 1. 마지막 3글자 자르기 
        String str1 = "ABCDEFG"; // 대상 문자열
        String result1 = str1.substring(str1.length()-3, str1.length());
        System.out.println(result1);
        

        // 2. 특정문자 이후의 문자열 제거 
        String str2 = "ABCD/DEFGH"; // 대상 문자열
        String result2 = str2.substring(str2.lastIndexOf("/")+1);
        System.out.println(result2);


        // 3. 특정단어(부분)만 자르기 
        String str3 = "바나나 : 1000원, 사과 : 2000 원, 배 : 3000원";
        String target = "사과";

        int target_num = str3.indexOf(target);
        String result = str3.substring(target_num, (str3.substring(target_num).indexOf("원")+ target_num));
        System.out.println(result +"원");
    }
}


