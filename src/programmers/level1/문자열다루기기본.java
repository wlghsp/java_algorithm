package programmers.level1;

/*
문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

제한 사항
    s는 길이 1 이상, 길이 8 이하인 문자열입니다.

입출력 예
s 	    return
"a234" 	false
"1234" 	true


*/

public class 문자열다루기기본 {
    // 1. 아스키코드 활용 숫자 판별 
    public static boolean solution1(String s) {
        char tmp;
        if (s.length() != 4 && s.length() != 6) return false;
        for (int i = 0; i < s.length(); i++) {
            tmp = s.charAt(i);
            if ('0' > tmp || tmp > '9') return false;
        }
        return true;
    }

    // 2. Integer.parseInt의 예외 발생 활용.
    public static boolean solution2(String s) {
        int length = s.length();
        if (length == 4 || length == 6) {
            try {
                Integer.parseInt(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return false;
    }
    

    public static void main(String[] args) {
        

        System.out.println(solution2("1234"));
    }
}
