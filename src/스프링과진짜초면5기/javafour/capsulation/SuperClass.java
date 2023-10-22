package 스프링과진짜초면5기.javafour.capsulation;

public class SuperClass {

    private int a = 1;
    int b = 2;
    protected int c = 3;
    public int d = 4;

    public void printEach() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}


class Test {

    public static void main(String[] args) {
        SuperClass parent = new SuperClass();
//        System.out.println(parent.a); // private 동일 클래스 내부가 변수 접근 에러
        System.out.println(parent.b);
        System.out.println(parent.c);
        System.out.println(parent.d);
    }
}

