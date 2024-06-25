package A2dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class D7여행경로 {
    static boolean[] visited;
    static List<String> allRoute;

    public static void main(String[] args) {
        String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};

        String[] solution = solution(tickets);
        System.out.println("solution = " + Arrays.toString(solution));
    }

    private static String[] solution(String[][] tickets) {
        String[] answer = {};
        int cnt = 0;
        visited = new boolean[tickets.length];
        allRoute = new ArrayList<>();

        dfs(tickets, "ICN", "ICN", cnt);
        Collections.sort(allRoute);
        answer = allRoute.get(0).split(" ");
        return answer;
    }

    static void dfs(String[][] tickets, String start, String route, int cnt) {

        if (cnt == tickets.length) {
            allRoute.add(route);
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            if (start.equals(tickets[i][0]) && !visited[i]) {
                visited[i] = true;
//                route 부분에 다음 가는 곳을 띄어쓰기 해주고 추가
                dfs(tickets, tickets[i][1], route + " " + tickets[i][1], cnt + 1);
                System.out.println("route = " + route);
                visited[i] = false;
            }
        }
    }
}

