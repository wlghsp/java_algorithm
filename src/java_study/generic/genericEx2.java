package java_study.generic;

// 제네릭 클래스

class ClassName1<K, V> {

    private K first; // K 타입 (제네릭)
    private V second; // V 타입 (제네릭)

    void set(K first, V second) {   // 제네릭 파라미터 메소드
        this.first = first;
        this.second = second;
    }


    K getFirst() {
        return first;
    }

    V getSecond() {
        return second;
    }

    
}



public class genericEx2 {
    public static void main(String[] args) {
        

        ClassName1<String, Integer> a = new ClassName1<String,Integer>();

        a.set("10", 10);


        System.out.println(" first data : " + a.getFirst());
        // 반환된 변수의 타입 출력
        System.out.println(" K Type : " + a.getFirst().getClass().getName());


        System.out.println(" second data : " + a.getSecond());
        // 반환된 변수의 타입 출력
        System.out.println(" V Type : " + a.getSecond().getClass().getName());

    
    
    }   
}
