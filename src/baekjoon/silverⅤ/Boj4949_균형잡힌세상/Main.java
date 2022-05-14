package baekjoon.silverⅤ.Boj4949_균형잡힌세상;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            Stack<String> stk = new Stack<>();
            boolean flag = true;
            String[] s = str.split("");

            for (String c: s) {
                if (c.equals("(") || c.equals("[")) {
                    stk.push(c);
                } else if (c.equals(")")) {
                    if (!stk.isEmpty() && stk.peek().equals("(") ) {
                        stk.pop();
                    } else {
                        flag = false;
                        break;
                    }

                } else if (c.equals("]")) {
                    if (!stk.isEmpty() && stk.peek().equals("[") ) {
                        stk.pop();
                    } else {
                        flag = false;
                        break;
                    }
                }
            }

            if (str.equals(".")) {
                break;
            }
            if (flag && stk.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }

    }
}
