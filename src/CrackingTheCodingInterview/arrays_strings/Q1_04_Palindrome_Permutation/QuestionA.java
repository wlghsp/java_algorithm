package CrackingTheCodingInterview.arrays_strings.Q1_04_Palindrome_Permutation;

public class QuestionA {

    /*
     각 문자에 숫자를 대응시킨다. a → 0, b → 1, c → 2, 등등.
     대소문자 구분이 없고, 문자가 아닌 경우에는 1로 대응시킨다.
     알파벳 대소문자 구분 없이 getNumbericValue는 10~35 사이의 숫자를 반환함
     */
    private static int getCharNumber(Character c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');

        int val = Character.getNumericValue(c);
        if (a <= val && val <= z) {
            return val - a;
        }
        return -1;
    }
    // 각 문자가 몇 번 등장했는지 센다.
    private static int[] buildCharFrequencyTable(String phrase) {
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                table[x]++;
            }
        }
        return table;
    }
    private static boolean isPermutationOfPalindrome(String phrase) {
        int[] table = buildCharFrequencyTable(phrase);
        return checkMaxOneOdd(table);
    }

    // 홀수 문자가 한 개 이상 존재하는지 확인한다.
    private static boolean checkMaxOneOdd(int[] table) {
        boolean foundOdd = false;
        for (int count : table) {
            if (count % 2 == 1) {
                if (foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String pali = "Rats live on no evil star";
        System.out.println(isPermutationOfPalindrome(pali));
    }
}