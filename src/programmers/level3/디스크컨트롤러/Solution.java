package programmers.level3.디스크컨트롤러;


import java.util.*;

public class Solution {

    public int solution(int[][] rawJobs) {
        // Job객체 배열에 담아 정렬한다.
        Job[] jobs = new Job[rawJobs.length];
        for (int i = 0; i < jobs.length; i++) {
            jobs[i] = new Job(rawJobs[i][0], rawJobs[i][1]);
        }
        // 시작 시간으로 정렬하여 큐에 담는다
        Arrays.sort(jobs, Comparator.comparingInt(job -> job.start));
        Queue<Job> q = new LinkedList<>(Arrays.asList(jobs));
        // 작업 시간으로 정렬하여 우선순위 큐에 담아 작업시간이 작은 작업이 우선 배치된다.
        PriorityQueue<Job> pq = new PriorityQueue<>(Comparator.comparingInt(job -> job.duration));

        int exec = 0; // 작업의 요청 시간부터 종료 시간까지 누적합
        int time = 0; // 현재 시간
        while (!q.isEmpty() || !pq.isEmpty()) {
            // 작업 처리
            // 큐에서 요청 시간이 지난 작업을 우선순위 큐에 담는다.
            while (!q.isEmpty() && q.peek().start <= time) {
                pq.add(q.poll());
            }

            // 우선순위 큐가 비어 있다면 작업이 없다는 의미
            // 가장 요청 시간이 이른 작업까지 대기
            if (pq.isEmpty()) {
                time = q.peek().start;
                continue;
            }

            Job job = pq.poll();
            exec += time + job.duration - job.start;
            time += job.duration;

        }

        return exec / jobs.length;
    }



    private static class Job {
        public final int start;
        public final int duration;

        public Job(int start, int duration) {
            this.start = start;
            this.duration = duration;
        }
    }
}
