package java_study.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapEx2 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer,String>(){{//초기값 지정
            put(1,"사과");
            put(2,"바나나");
            put(3,"포도");
        }};
                
        System.out.println(map); //전체 출력 : {1=사과, 2=바나나, 3=포도}
        System.out.println(map.get(1));//key값 1의 value얻기 : 사과
                
        //entrySet() 활용
        for (Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
        }
        //[Key]:1 [Value]:사과
        //[Key]:2 [Value]:바나나
        //[Key]:3 [Value]:포도
        
        //KeySet() 활용
        for(Integer i : map.keySet()){ //저장된 key값 확인
            System.out.println("[Key]:" + i + " [Value]:" + map.get(i));
        }
        //[Key]:1 [Value]:사과
        //[Key]:2 [Value]:바나나
        //[Key]:3 [Value]:포도

    }
    
}
