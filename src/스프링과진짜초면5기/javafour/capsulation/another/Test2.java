package 스프링과진짜초면5기.javafour.capsulation.another;

import 스프링과진짜초면5기.javafour.capsulation.SuperClass;

public class Test2 {

    public static void main(String[] args) {
        SuperClass parent = new SuperClass();
        // 다른 패키지에서는 public을 제외하고  모두 에러
//        System.out.println(parent.a);
//        System.out.println(parent.b);
//        System.out.println(parent.c);
        System.out.println(parent.d);
    }
}


class SubClass extends SuperClass {
    public void printEach() {
//        System.out.println(a); //  private 변수 사용 에러
//        System.out.println(b);  // default 변수 사용 에러
        System.out.println(c); // ## 상속 받은 경우 다른패키지에서도 protected는 사용 가능 ##
        System.out.println(d);

    }
}