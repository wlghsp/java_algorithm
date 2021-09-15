package java_study.split;

public class SplitEx1 {
    public static void main(String[] args) {
        String str = "010-1234-5678";
        String[] mobNum = str.split("-");
        String ret1 = mobNum[0];
        String ret2 = mobNum[1];
        String ret3 = mobNum[2];

        System.out.println("ret1 = " + ret1);
        System.out.println("ret2 = " + ret2);
        System.out.println("ret3 = " + ret3);

        System.out.println("휴대폰번호 => " + ret1+"-" + ret2 + "-" + ret3);

    }
}
