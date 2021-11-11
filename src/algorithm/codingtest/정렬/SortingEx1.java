package algorithm.codingtest.정렬;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class SortingEx1 {
    public static void main(String[] args) throws IOException {
        // 오름차순 정렬하기 
        ArrayList list = new ArrayList<>();

        list.add(3);
        list.add(19);
        list.add(1);
        list.add(4);

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
