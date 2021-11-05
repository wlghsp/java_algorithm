package codeup.one_dim_array;



/*
영어 공부에 빠져 있는 주현이는 영어 책을 자주 본다.
어느 날 영어 문장을 보면서 어떤 알파벳 문자가 많이 사용되는지 궁금해졌다.
영어 문장이 주어지면 a부터 z까지 알파벳 문자가 각각 몇 번 나왔는지 출력하는 프로그램을 작성하시오.

입력
① 90글자 이내의 영어로 된 문장이 입력된다.
② 이 문장은 영어 소문자, 공백 및 특수 문자로만 이루어져 있다.

출력
a부터 z까지 사용된 알파벳 개수를 [입출력 예시]를 참고하여 출력한다. 특수문자와 공백의 개수는 출력하지 않는다.

입력 예시   
oh! my god!

출력 예시
a:0
b:0
c:0
d:1
e:0
f:0
g:1
h:1
i:0
j:0
k:0
l:0
m:1
n:0
o:2
p:0
q:0
r:0
s:0
t:0
u:0
v:0
w:0
x:0
y:1
z:0

*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Codeup1412 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Character> chList = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
        ArrayList<Integer> intList = new ArrayList<>(Collections.nCopies(26, 0));
        char[] chArr = br.readLine().toCharArray();
        for (char s : chArr) {
            for (int i = 0; i < chList.size(); i++) {
                if (s == chList.get(i)) {
                    int oldVal = intList.get(i);
                    int newVal = oldVal + 1;
                    intList.set(i, newVal); 
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chList.size(); i++) {
            sb.append(chList.get(i) + ":" + intList.get(i) + "\n");            
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
