package test;

import java.util.ArrayList;

public class VarTest {
    public static void main(String[] args) {
        var string = "Hello, World";

        if(string instanceof String) {
            System.out.println("This is a String: " + string);
        }

        var list = new ArrayList<String>();

        if (list instanceof ArrayList) {
            System.out.println("This is a ArrayList");
        }


        int[] arr = {1, 2, 3};
        for (var i : arr) {
            System.out.println("n: " + i);
        }

        /*
        1. var는 지역변수에만 사용, 클래스의 멤버변수로 사용 불가
        2. 초기화 필수, 초기화하지 않으면 어떤 타입인지 추론할 수 없기 때문에 컴파일 에러 발생
        3. null로 초기화 불가, 어떤객체든 null이 할당될 수 있기 때문에, 타입 추론을 할 수 없으며 컴파일 에러가 발생함
        4. 배열에 사용 불가
        5. Lambda에 사용불가..10에서는 였으나, 11부터 var 사용 가능

         */
    }
}
