package programmers.level1.완주하지못한선수;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수_개취풀이 {


    public String solution1(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        // 2. 두 배열이 다를 때까지 찾는다.
        int i = 0;
        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                break;
            }
        }
       
        // 3 여기까지 왔다면, 마지막 주자가 완주하지 못한 선수다.
        return participant[i];
    }

    public String solution2(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1); // Key에 해당하는 Value가 있으면 가져오고, 아닐 경우 0을 Default로 지정하여 사용하겠다는 의미
        }
        for (String player : completion) {
            map.put(player, map.get(player) - 1); // player를 찾아 1을 빼준다. 참가자로 1 이었다면 0이 된다. 또는 2이였다면 1, 0이라면 -1이 되므로 값이 0 이 되지 않은 키를 찾아 전달하면 끝
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                answer = entry.getKey();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] participant = new String[] {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion  = new String[] {"josipa", "filipa", "marina", "nikola"};
        완주하지못한선수_개취풀이 sol = new 완주하지못한선수_개취풀이();
        System.out.println(sol.solution1(participant, completion));
    }
}
