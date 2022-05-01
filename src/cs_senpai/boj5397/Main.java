package cs_senpai.boj5397;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static String getPwd(String pwd) {

        Stack<Character> stk1 = new Stack<>();
        Stack<Character> stk2 = new Stack<>();

        for (char c : pwd.toCharArray()) {
            if (c == '<') {
                if (!stk1.isEmpty()) stk2.push(stk1.pop());
            } else if (c == '>') {
                if (!stk2.isEmpty()) stk1.push(stk2.pop());
            } else if (c == '-') {
                if (!stk1.isEmpty()) stk1.pop();
            } else {
                stk1.push(c);
            }
        }

        while (!stk2.isEmpty()){
            stk1.push(stk2.pop());
        }
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < stk1.size(); j++) {
            sb.append(stk1.elementAt(j));
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        String str;
        for (int i = 0; i < t; i++) {
            str = br.readLine();
            String password = getPwd(str);
            System.out.println(password);
        }

    }
}
