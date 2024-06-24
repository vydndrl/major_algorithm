package A3bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class B2Basic2 {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    static int[] distance;
    public static void main(String[] args) {
//        배열을 하나 만들어서
//        이 배열에 각 노드가 start node 에서 얼마나 떨어져 있는지 숫자 값 담기
        int[][] arr = { {0, 1}, {0, 2}, {1, 3}, {2, 3}, {2, 4} };
        distance = new int[5];
        adjList = new ArrayList<>();
        visited = new boolean[5];

        for (int i = 0; i < 5; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] a : arr) {
            adjList.get(a[0]).add(a[1]);
        }

        System.out.println("adjList = " + adjList);
//        bfs 로 나오는 각 노드를 방문하고 출력
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
//                        거리 찾기
                        distance[target] = distance[temp] + 1;
                        visited[target] = true;
                    }
                }
            }
        }
    }