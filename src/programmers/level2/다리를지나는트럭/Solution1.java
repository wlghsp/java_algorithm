package programmers.level2.다리를지나는트럭;

import java.util.LinkedList;
import java.util.Queue;

public class Solution1 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int seconds = 0;
        Queue<Integer> bridge = new LinkedList<>();
        int weightOnBridge = 0;

        // bridge 큐의 길이가 bridge_length와 같은 때 트럭 1대가 건널 수 있음
        for (int truckWeight : truck_weights) {
            while (true) { // 반복하면서 매초마다 bridge 큐를 채워줌
                if (bridge.isEmpty()) {
                    // 다리가 비어 있을 때, 바로 트럭 추가
                    bridge.add(truckWeight);
                    weightOnBridge += truckWeight;
                    seconds++;
                    break;
                } else if (bridge.size() == bridge_length) { // 다리 도착
                    // 다리의 길미만큼 트럭이 다 건넜을때
                    weightOnBridge -= bridge.poll();
                } else { // 다리 도착도 안하고 비어있지 않은 상태
                    if (weightOnBridge + truckWeight <= weight) { // 트럭 추가 okay
                        // 다리에 트럭을 추가할 수 있을 때
                        // break 를 하고 다음 차량(무게)으로 넘어감
                        bridge.add(truckWeight);
                        weightOnBridge += truckWeight;
                        seconds++;
                        break;
                    } else { // 트럭 추가 not okay
                        // 트럭이 추가될 수가 없는 경우. 0을 추가하여 bridge 큐의 길이 증가.
                        bridge.add(0);
                        seconds++;
                    }
                }
            }
        }

        // 마지막 트럭이 다리를 건너는 시간 추가
        seconds += bridge_length;

        return seconds;
    }
}
