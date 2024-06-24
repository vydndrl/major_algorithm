package A2dfs;


public class D4피로도 {
//    순열
    static boolean[] visited;
    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80,20},{50,40},{30,10}};

        int solution = solution(k, dungeons);
        System.out.println("solution = " + solution);
    }

    private static int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];

        dfs(k, dungeons, visited);
    }

    private static void dfs(int k, int[][] dungeons, boolean[] visited) {
        for (int i = 0; i < dungeons.length; i++) {
            if (dungeons[i][0] <= k) {
                visited[i] = true;
                dfs(i, dungeons, visited);
            }
        }
    }
}
