package java_study;

public class InitializationTest {
    int a;  // int, String, Boolean 선언
    String b;
    Boolean c;
    // 클래스 영역 변수 선언은 초기화를 하지 않아도
    // 컴파일러가 자동으로 값 할당을 해준다. 
    public static void main(String[] args) {
        InitializationTest it = new InitializationTest();  // 객체화
        System.out.println(it.a);        
        System.out.println(it.b);        
        System.out.println(it.c); 
        // int a;
        // System.out.println(a);// 오류가 난다. 
        // 메서드 안에서 변수 선언하고 초기화를 하지 않으면
        // 에러가 발생한다.   
    }
}
