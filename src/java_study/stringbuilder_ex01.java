package java_study;

public class stringbuilder_ex01 {
    public static void main(String[] args) {
        String word = "abcde";
        
        // reverse
        StringBuffer sb = new StringBuffer(word);
        String reversedWord = sb.reverse().toString();

        System.out.println(reversedWord);

    }
}
