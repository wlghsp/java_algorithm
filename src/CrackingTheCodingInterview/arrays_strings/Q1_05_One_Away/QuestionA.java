package CrackingTheCodingInterview.arrays_strings.Q1_05_One_Away;

public class QuestionA {


    private static boolean oneEditAway(String first, String second) {
        if (first.length() == second.length()) {
            // 둘의 길이가 같으면 문자 교체
            return oneEditReplace(first, second);
        } else if (first.length() + 1 == second.length()) {
            //
            return oneEditInsert(first, second);
        } else if (first.length() - 1 == second.length()) {
            return oneEditInsert(second, first);
        }
        return false;
    }
    // 문자 하나 교체로 가능한가?
    // 문자 하나가 다른 것을 발견하면 foundDifference가 true가 되고
    // 문자가 다른 경우가 또 있다면 문자하나로 교체 불가능하다는 false를 반환한다.
    private static boolean oneEditReplace(String s1, String s2) {
        boolean foundDifference = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }

    // s1에 문자 하나를 삽입해서 s2를 만들 수 있는지 확인
    private static boolean oneEditInsert(String s1, String s2) {
        int index1 = 0;
        int index2 = 0;
        while (index2 < s2.length() && index1 < s1.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String a = "pse";
        String b = "pale";
        boolean isOneEdit = oneEditAway(a, b);
        System.out.println(a + ", " + b + ": " + isOneEdit);
    }
}
