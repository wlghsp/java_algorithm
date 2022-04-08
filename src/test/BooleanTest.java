package test;

public class BooleanTest {

    public static void main(String[] args) {



    }

    public boolean bools() {
        boolean result1 = true;
        boolean result2 = true;

        // true는 출장중, false는 출장 아님
        return (result1 == true || result2 == true) ? true : false;
    }
}
