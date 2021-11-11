package programmers.level1;
/*
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
제한사항

    마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
    completion의 길이는 participant의 길이보다 1 작습니다.
    참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
    참가자 중에는 동명이인이 있을 수 있습니다.

입출력 예
   participant 	                                        completion 	                            return
["leo", "kiki", "eden"] 	                         ["eden", "kiki"] 	                         "leo"
["marina", "josipa", "nikola", "vinko", "filipa"] 	["josipa", "filipa", "marina", "nikola"] 	"vinko"
["mislav", "stanko", "mislav", "ana"] 	              ["stanko", "ana", "mislav"] 	            "mislav"

입출력 예 설명
예제 #1
"leo"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

예제 #2
"vinko"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

예제 #3
"mislav"는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.

*/

// 내 풀이는 시간초과가 떴다. 

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class 완주하지못한선수 {
    // 1. Sort/Loop를 사용한 solution
    //  두 배열을 정렬하고, int i 를 따로 초기화 선언 후 이 i로 for문을 돌린다. for문은 완주한 사람들의 길이만큼 돌리고 
    //  참가자와 완주자의 이름이 다르면 반복문을 탈출하고 이때의 i로 참가자를 찾으면 그 참가자는 완주를 못한 것이다. 
    //  참가자와 완주자의 이름이 같은 상태로  break  없이 끝나면 i++로 i가 completion의 길이보다 1 증가한 상태로 for문이 종료되므로 
    //  이때의 i로 참가자 중에 찾으면 완주를 못한 사람을 찾을 수 있다.  
    public String solution1(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        int i; // 초기화는 불필요함. 
        for ( i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                // break; 
                return participant[i]; // 바로 리턴 
            }
        }
        return participant[i];
    }

    // 2.Hash를 사용한 solution
    public String solution2(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1); // Key에 해당하는 Value가 있으면 가져오고, 아닐 경우 0을 Default로 지정하여 사용하겠다는 의미
        }
        for (String player : completion) {
            map.put(player, map.get(player) -1); // player를 찾아 1을 빼준다. 참가자로 1 이었다면 0이 된다. 또는 2이였다면 1, 0이라면 -1이 되므로 값이 0 이 되지 않은 키를 찾아 전달하면 끝
        }

        // 더 간단한 코드 
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer = key;
            }
        }

        return answer;

        // Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
        // while (iter.hasNext()) {
        //     Map.Entry<String, Integer> entry = iter.next();
        //     if (entry.getValue() != 0) { // Key를 하나씩 확인해서 Value가 0이 아닌 경우 answer에 담아주는
        //         answer = entry.getKey();
        //         break;
        //     }
        // }
    }


    public static void main(String[] args) {
        String[] participant = new String[] {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion  = new String[] {"josipa", "filipa", "marina", "nikola"};
        완주하지못한선수 sol = new 완주하지못한선수();
        System.out.println(sol.solution1(participant, completion));
    }
}
