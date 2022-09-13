package test;

public class NumTest {

    public static void main(String[] args) {

        String m = "0099";
        int num = Integer.parseInt(m) + 1;
        String forMattedNum = String.format("%0" + m.length() + "d", num);
        String newRewardNum = "2022" + "-" + forMattedNum;
        System.out.println(newRewardNum);
    }
}
