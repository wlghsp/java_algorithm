package programmers.level1;

/*
프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
전화번호가 문자열 phone_number_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
제한 조건

    s는 길이 4 이상, 20이하인 문자열입니다.

입출력 예
phone_number_number 	return
"01033334444" 	"*******4444"
"027778888" 	"*****8888"


*/


public class 핸드폰번호가리기 {

    // 1. subString으로 뒤에 4자리 잘라내고, 앞 길이만큼  for문으로 * 채우기 
    public static String solution1(String phone_number) {
        String answer = "";
        String fourNum = phone_number.substring(phone_number.length() -4);
        for (int i = 0; i < phone_number.length() - 4; i++) {
            answer += "*";
        }
        return answer + fourNum;
    }

    // 2. char배열로 변환 후 배열 길이 -4 로 for문 돌리고 '*' 집어 넣음 
    public static String solution2(String phone_number) {
        char[] arr = phone_number.toCharArray();
        for (int i = 0; i < arr.length- 4; i++) arr[i] = '*';
        return String.valueOf(arr);
    }

    public static void main(String[] args) {

        System.out.println(solution2("01033334444"));
    }
}
