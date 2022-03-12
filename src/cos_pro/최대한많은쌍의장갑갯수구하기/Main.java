package cos_pro.최대한많은쌍의장갑갯수구하기;

public class Main {


    final int maxProductNumber = 10;

    public int[] func_a(int[] gloves) {
        int[] counter = new int[maxProductNumber+1];

        for (int i = 0; i < gloves.length; i++) {
            counter[gloves[i]]++;
        }
        return counter;
    }

    public int solution(int[] leftGloves, int[] rightGloves) {
        int[] leftCounter = func_a(leftGloves);
        int[] rightCounter = func_a(rightGloves);
        int total = 0;

        for (int i = 0; i <= maxProductNumber; i++) {
            total += Math.min(leftCounter[i], rightCounter[i]);
        }
        return total;

    }

    public static void main(String[] args) {
        Main sol = new Main();
        int[] leftGloves = {2, 1, 2, 2, 4};
        int[] rightGloves = {1, 2, 2, 4, 4, 7};

        int ret = sol.solution(leftGloves, rightGloves);

        System.out.println("ret = " + ret);
    }
}
