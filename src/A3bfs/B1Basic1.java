package A3bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class B1Basic1 {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    public static void main(String[] args) {
        int[][] arr = { {0, 1}, {0, 2}, {1, 3}, {2, 3}, {2, 4} };

        adjList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] a : arr) {
            adjList.get(a[0]).add(a[1]);
        }

        System.out.println("adjList = " + adjList);
//        bfs 로 나오는 각 노드를 방문하고 출력
        visited = new boolean[5];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            int temp = queue.poll();
            System.out.println("temp = " + temp);
                for (int target : adjList.get(temp)) {
//                    target 을 q 에 add 하기 전에 true 로 세팅
                    if (!visited[target]) {
                    queue.add(target);
                    visited[target] = true;
                    }
                }
            }
        }
    }
