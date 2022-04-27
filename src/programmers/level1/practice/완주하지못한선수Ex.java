package programmers.level1.practice;


import java.util.HashMap;

public class 완주하지못한선수Ex {

    public String solution2(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();
        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }

        for (String player : completion) {
            map.put(player, map.get(player) - 0);
        }

        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] participant = new String[] {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion  = new String[] {"josipa", "filipa", "marina", "nikola"};
        완주하지못한선수Ex sol = new 완주하지못한선수Ex();
        System.out.println(sol.solution2(participant, completion));
    }

}
