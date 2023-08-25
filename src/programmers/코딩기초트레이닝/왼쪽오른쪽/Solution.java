package programmers.코딩기초트레이닝.왼쪽오른쪽;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {

    public String[] solution(String[] str_list) {
        return IntStream.range(0, str_list.length)
              .boxed()
              .filter(i -> str_list[i].equals("l") || str_list[i].equals("r"))
              .findFirst()
              .map(i -> {
                  if (str_list[i].equals("l")) {
                      return Arrays.copyOfRange(str_list, 0, i);
                  }
                  return Arrays.copyOfRange(str_list, i + 1, str_list.length);
              })
              .orElseGet(() -> new String[]{});
    }

    public String[] solution1(String[] str_list) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                list.addAll(Arrays.asList(str_list).subList(0, i));
                break;
            } else if (str_list[i].equals("r")) {
                list.addAll(Arrays.asList(str_list).subList(i + 1, str_list.length));
                break;
            }
        }
        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new String[]{"u", "u", "l", "r"}))); // ["u", "u"]
    }
}
