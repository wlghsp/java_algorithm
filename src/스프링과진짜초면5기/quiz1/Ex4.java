package 스프링과진짜초면5기.quiz1;

interface I1{
    void m1();
}

interface I2 extends I1{
    void m2();
}

interface I3{
    void m3();
}

class C1 implements I3{
    public void m3(){}
}

class C2 extends C1 implements I2{
    public void m1(){}
    public void m2(){}
}


public class Ex4 {

    public static void main(String[] args) {
        C1 a = new C1();
        C2 b = new C2();

        I1 i1 = b;
//        I2 i2 = a;  // C1은 I3를 상속 받고 있어 오류가 남
        I3 i3 = b;
        a = b;
    }
}
