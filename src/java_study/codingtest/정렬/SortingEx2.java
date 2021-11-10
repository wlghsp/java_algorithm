package java_study.codingtest.정렬;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingEx2 {
    public static void main(String[] args) throws IOException {
        // 내림차순 정렬하기 
        ArrayList list = new ArrayList<>();

        list.add(3);
        list.add(19);
        list.add(1);
        list.add(4);

        Collections.sort(list, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return -1;
                }
                return 0;
            }
            
        });

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
