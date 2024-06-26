package A3bfs;

import java.util.LinkedList;
import java.util.Queue;

public class B6게임맵 {
    public static void main(String[] args) {
        int[][] maps = {{1,0,1,1,1},
                        {1,0,1,0,1},
                        {1,0,1,1,1},
                        {1,1,1,0,1},
                        {0,0,0,0,1}};

        int solution = solution(maps);
        System.out.println("solution = " + solution);
    }

    public static int solution(int[][] maps) {
        int answer = -1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0,1});
        int[] dx = {-1 ,1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        maps[0][0] = -1;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = current[0] + dx[i];
                int ny = current[1] + dy[i];
                if (nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length) {
                    if(maps[nx][ny] == 1) {
                        queue.add(new int[]{nx, ny, current[2] + 1});
                        maps[nx][ny] = -1;
                        if(nx == maps.length - 1 && ny == maps[0].length - 1) {
                            answer = current[2] + 1;
                            break;
                        }
                    }
                }
            }
        }
        return answer;
    }
}
