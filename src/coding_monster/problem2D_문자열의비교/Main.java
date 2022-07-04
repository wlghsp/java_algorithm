package coding_monster.problem2D_문자열의비교;

class StringUtil {

    public static int compare(char[] s1, char[] s2){
        int n = Math.min(s1.length, s2.length);
        for (int i = 0; i < n; i += 1) {
            if (s1[i] != s2[i]) {
                return (int) s1[i] - s2[i];
            }
        }
        return s1.length - s2.length;
    }

    public static boolean equals(char[] s1, char[] s2){
		/* 두 문자열 s1, s2가 일치하면 true
		 일치하지 않으면 false를 반환하는 함수
		*/
        if (s1.length != s2.length) return false;

        // 길이가 일치한 경우
        for (int i = 0; i < s1.length; i ++) {
            if (s1[i] != s2[i]) return false;
        }


        return true;
    }
}

public class Main {

    public static void main(String[] args) {
        // 이 공간에서는 자유롭게 테스트 및 출력을 해도 됩니다
        char[] s1 = "algorithm".toCharArray();
        char[] s2 = "allergy".toCharArray();

        System.out.printf("compare() Result : %d\n", StringUtil.compare(s1,s2) );
        System.out.printf("equals() Result : %b\n", StringUtil.equals(s1,s2) );
    }
}