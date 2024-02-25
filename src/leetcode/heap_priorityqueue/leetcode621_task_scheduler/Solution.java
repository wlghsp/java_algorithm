package leetcode.heap_priorityqueue.leetcode621_task_scheduler;

import java.util.*;

class Count {
    public int cnt;
    public int idleTime;

    public Count(int cnt, int idleTime) {
        this.cnt = cnt;
        this.idleTime = idleTime;
    }
}

public class Solution {
    public int leastInterval(char[] tasks, int n) {
        if (n == 0) return tasks.length;

        Map<Character, Integer> count = new HashMap<>();
        for (char task : tasks) {
            count.put(task, count.getOrDefault(task, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (Integer value : count.values()) {
            pq.offer(value);
        }

        Queue<Count> queue = new LinkedList<>();
        int time = 0;

        while (!pq.isEmpty() || !queue.isEmpty()) {
            time++;

            if (!pq.isEmpty()) {
                int cnt = pq.poll() - 1;
                if (cnt > 0) queue.offer(new Count(cnt, time + n));
            }

            if (!queue.isEmpty() && queue.peek().idleTime == time) {
                pq.offer(queue.poll().cnt);
            }
        }

        return time;
    }
}
