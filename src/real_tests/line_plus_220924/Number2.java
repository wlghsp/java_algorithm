package real_tests.line_plus_220924;

public class Number2 {

    public String solution(int k, String[] dic, String chat) {
        String answer = "";




        return answer;
    }

    public static void main(String[] args) {
        Number2 T = new Number2();
        int k1 = 2;
        String[] dic1 = {"slang", "badword"};
        String chat1 = "badword ab.cd bad.ord .word sl.. bad.word";

        int k2 = 3;
        String[] dic2 = {"abcde", "cdefg", "efgij"};
        String chat2 = ".. ab. cdefgh .gi. .z.";

        System.out.println(T.solution(k1, dic1, chat1));
        System.out.println(T.solution(k2, dic2, chat2));
    }
}
