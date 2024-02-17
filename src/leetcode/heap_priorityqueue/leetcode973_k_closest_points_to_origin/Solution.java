package leetcode.heap_priorityqueue.leetcode973_k_closest_points_to_origin;

import java.util.PriorityQueue;

class Point {
    public int x;
    public int y;
    public int distance;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.distance = x * x + y * y;
    }
}

public class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Point> pq = new PriorityQueue<>((a, b) -> a.distance - b.distance);
        for (int[] point : points) {
            pq.offer(new Point(point[0], point[1]));
        }

        int[][] result = new int[k][2];

        for (int i = 0; i < k; i++) {
            Point point = pq.poll();
            result[i][0] = point.x;
            result[i][1] = point.y;
        }

        return result;
    }
}
