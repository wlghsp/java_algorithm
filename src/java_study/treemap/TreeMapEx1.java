package java_study.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/*
 TreeMap은 이진탐색트리의 문제점을 보완한 레드-블랙 트리로 이루어져 있다.
 일반적인 이진 탐색 트리는 트리의 높이만큼 시간이 필요하다.
 값이 전체 트리에 잘 분산되어 있다면 효율성에 크게 문제가 없으나 데이터가 들어올 때 값이 한쪽으로 편향되게 들어올 경우
 한쪽 방면으로 크게 치우쳐진 트리가 되어 굉장히 비효율적인 퍼포먼스를 낸다. 이 문제를 보완하기 위해 레드 블랙 트리가 등장!

 레트 블랙 트리는 부모노드보다 작은 값을 가지는 노드는 왼쪽 자식으로, 큰 값을 가지는 노드는 오른쪽 자식으로 배치하여 데이터의 추가나
 삭제 시 트리가 한쪽으로 치우쳐지지 않도록 균형을 맞추어준다.
 */


public class TreeMapEx1 {

    public static void main(String[] args) {
        TreeMap<Integer, String> map1 = new TreeMap<>(); // TreeMap 생성
        TreeMap<Integer, String> map2 = new TreeMap<>(); // new에서 타입 파라미터 생략 가능
        TreeMap<Integer, String> map3 = new TreeMap<>(map1); // map1의 모든 값을 가진 TreeMap 생성
        TreeMap<Integer, String> map6 = new TreeMap<>(){{ // 초기값 설정
            put(1,"a");
        }};
        /*
        TreeMap을 생성하기 위해서는 키로 저장할 객체타입과 값으로 저장할 객체 타입을 타입파라미터로 주고 기본 생성자를 호출하면 된다.
        생성하는 명령어는 HashMap과 크게 다르지 않으나 선언 시 크기를 지정해줄 수는 없다.
         */

        map1.put(1, "사과"); // 값 추가
        map1.put(2, "복숭아");
        map1.put(3, "수박");

        /*
         TreeMap은 구조만 HashMap과 다를 뿐이지 기본적으로 Map 인터페이스를 같이 상속받고 있으므로 기본적인 메소드의
         사용법 자체는 HashMap과 동일하다. TreeMap에 값을 추가하려면 put(key, value)메소드를 사용하면 된다.

         TreeMap의 타입 파라미터와 같은 타입의 key와 value 값을 넣어야 정상적으로 값이 input 되며 만약 입력되는 키 값이 TreeMap 내부에 존재한다면
         기존의 값은 새로 입력되는 값으로 대치된다.
         */

//        map1.remove(1); // key값 1 제거
//        map1.clear(); // 모든 값 제거

//        System.out.println(map1); // 전체 출력
//        System.out.println(map1.get(1)); // key의 1의 value 얻기
//        System.out.println(map1.firstEntry()); // 최소 Entry 출력 : 1= 사과
//        System.out.println(map1.firstKey()); // 최소 Key 출력 : 1
//        System.out.println(map1.lastEntry()); // 최대 entry 출력 : 3 = 사과
//        System.out.println(map1.lastKey()); // 최대 key 출력 : 3

        // entrySet() 활용
//        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
//            System.out.println("[key]:" + entry.getKey() + " [Value]:" + entry.getValue());
//        }
//
//        // KeySet() 활용
//        for (Integer i : map1.keySet()) {
//            System.out.println(i +" " + map1.get(i));
//        }

        Iterator<Map.Entry<Integer, String>> entries = map1.entrySet().iterator();

        while (entries.hasNext()) {
            Map.Entry<Integer, String> entry = entries.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Iterator<Integer> keys = map1.keySet().iterator();

        while (keys.hasNext()) {
            int key = keys.next();
            System.out.println(key + " " + map1.get(key));
        }

    }
}
