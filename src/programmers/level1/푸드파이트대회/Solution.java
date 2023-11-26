package programmers.level1.푸드파이트대회;

public class Solution {

    public String solution(int[] food) {
        StringBuilder front = new StringBuilder();
        StringBuilder back = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            while (food[i] >= 2) {
                front.append(i);
                back.insert(0, i);
                food[i] -= 2;
            }
        }

        return front + "0" + back;
    }
}
