package A1Sort;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class S2야근지수 {
    public static void main(String[] args) {
        int n = 4;
        int[] works = {4, 3, 3};

        long solution = solution(n, works);
        System.out.println("solution = " + solution);
    }

    private static long solution(int n, int[] works) {
        long answer = 0L;
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int w : works) {
            pq.add(w);
        }

        while (true) {
            if (n == 0) break;
            if (pq.isEmpty()) break;
            int work = pq.poll();
            pq.add(work - 1);
            n--;
        }

        for (int work : pq) {
            answer += (long) work * work;
        }

        return answer;
    }
}
