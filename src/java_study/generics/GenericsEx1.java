package java_study.generics;

import java.util.ArrayList;

public class GenericsEx1 {
    public static void main(String[] args) {
        /*
        * 좀 더 명확한 타입체크가 가능해진다.
        *
        * 자료형에 대한 형변환 과정이 필요없다.
        *
        *  제네릭스를 이용하면 형변환에 의한 불필요한 코딩, 잘못된 형변환에 의한
        *  런타임 오류등에서 벗어날 수 있다.
         * */
        ArrayList<String> aList = new ArrayList<>();

        aList.add("hello");
        aList.add("java");

        String hello = aList.get(0);
        String java = aList.get(1);


        System.out.println(hello + java);

    }

}
