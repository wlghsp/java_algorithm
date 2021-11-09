package java_study.heap;

public class CompareEx1 {
    public static void main(String[] args) {
        
        // int a = 1;
        // int b = 2;

        // if (a > b) {
        //     System.out.println("a가 b보다 큽니다.");
        // } else if(a == b) {
        //     System.out.println("a와 b는 같습니다.");
        // } else{
        //     System.out.println("b가 a보다 큽니다.");
        // }

        // primitive type 은 자바 자체 제공으로 비교 가능. 부등호로 ok
        
        Student a = new Student(17, 2); // 17살 2반
        Student b = new Student(18, 1); // 18살 1반

        /* 
            어떻게 비교..?

            if(a>b) ..?
        */

        

    }
}


class Student {
    int age;    // 나이
    int classNumber; //학급

    Student(int age, int classNumber) {
        this.age = age;
        this.classNumber = classNumber;
    }
}

/*

Comparable 은 "자기 자신과 매개변수 객체를 비교"

Comparator 은 "두 매개변수 객체를 비교"

*/