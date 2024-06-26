package A4greedy;

import java.util.*;

public class G3구명보트 {
    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};
        int limit = 100;

        int solution = solution(people, limit);
        System.out.println("solution = " + solution);
    }

    private static int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        Deque<Integer> deque = new ArrayDeque<>();

        for(int p : people) {
            deque.add(p);
        }

        while(!deque.isEmpty()) {
            int last = deque.pollLast();
            answer++;
            if (!deque.isEmpty() && last + deque.peekFirst() <= limit) {
                deque.pollFirst();
            }
        }
        return answer;
    }
}
