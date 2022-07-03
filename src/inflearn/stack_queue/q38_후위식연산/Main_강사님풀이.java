package inflearn.stack_queue.q38_후위식연산;


import java.util.Scanner;
import java.util.Stack;

public class Main_강사님풀이 {
    public static void main(String[] args) {
        Main_강사님풀이 T = new Main_강사님풀이();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(T.solution(s));
    }
    private int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (char x : s.toCharArray()) {
            if (Character.isDigit(x)) stack.push(x - 48);
            else {
                int rt = stack.pop();
                int lt = stack.pop();
                if (x=='+') stack.push(lt + rt);
                else if (x== '-') stack.push(lt - rt);
                else if (x== '*') stack.push(lt * rt);
                else if (x== '/') stack.push(lt / rt);

            }
        }

        answer = stack.get(0);
        return answer;
    }
}
