package A3bfs;

import java.util.*;

public class B3Basic3 {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    static int[] distance;

    public static void main(String[] args) {
//        start 에서 end 까지 최소 거리
        int[][] arr = {{0, 1}, {0, 2}, {1, 3}, {2, 3}, {2, 4}};
        distance = new int[5];
        adjList = new ArrayList<>();
        visited = new boolean[5];

        for (int i = 0; i < 5; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] a : arr) {
            adjList.get(a[0]).add(a[1]);
        }

//        bfs 로 나오는 각 노드를 방문하고 출력
        Queue<Integer> queue = new LinkedList<>();
        int start = 0;
        int end = 3;
        int minDistance = bfs(start, end);

        System.out.println("minDistance = " + minDistance);
    }

    static int bfs(int start, int end) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[0] = true;

        while (!queue.isEmpty()) {
            int temp = queue.poll();
            visited[temp] = true;
            for (int target : adjList.get(temp)) {
//                    target 을 q 에 add 하기 전에 true 로 세팅
                if (!visited[target]) {
                    queue.add(target);
//                        거리 찾기
                    distance[target] = distance[temp] + 1;
                    visited[target] = true;
                    if (target == end) {
                        return distance[target];
                    }
                }
            }
        }
        return -1;
    }
}