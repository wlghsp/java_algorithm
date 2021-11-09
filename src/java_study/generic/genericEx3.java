package java_study.generic;

// 제네릭 클래스

class ClassName2<E> {

    private E element; // 제네릭 타입 변수

    void set(E element) {   // 제네릭 파라미터 메소드
        this.element = element;
    }

    E get() {   //  제네릭 타입 반환 메소드
        return element;
    }

    <T> T genericMethod(T o) {  // 제네릭 메소드
        return o;
    }
}



public class genericEx3 {
    public static void main(String[] args) {
        

        ClassName2<String> a = new ClassName2<String>();
        ClassName2<Integer> b = new ClassName2<Integer>();

        a.set("10");
        b.set(10);


        System.out.println("a data : " + a.get());
        // 반환된 변수의 타입 출력
        System.out.println("a E Type : " + a.get().getClass().getName());


        System.out.println();
        System.out.println("b data : " + b.get());
        //반환된 변수의 타입 출력
        System.out.println("b E Type : " + b.get().getClass().getName());
        System.out.println();
        

        // 제네릭 메소드 Integer
        System.out.println("<T> returnType : " + a.genericMethod(3).getClass().getName());

        // 제네릭 메소드 String
        System.out.println("<T> returnType : " + a.genericMethod("ABCD").getClass().getName());

        // 제네릭 메소드 ClassName2 b
        System.out.println("<T> returnType : " + a.genericMethod(b).getClass().getName());


    
    }   
}
