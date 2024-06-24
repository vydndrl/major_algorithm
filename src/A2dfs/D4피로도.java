package A2dfs;


public class D4피로도 {
//    순열
    static boolean[] visited;
    static int answer;
    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80,20},{50,40},{30,10}};

        int solution = solution(k, dungeons);
        System.out.println("solution = " + solution);
    }

    public static int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];

        dfs(0, k, dungeons);

        return answer;
    }

    public static void dfs(int start, int k, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && dungeons[i][0] <= k) {
                visited[i] = true;
                dfs(start + 1, k - dungeons[i][1], dungeons);
                visited[i] = false;
            }
        }
        answer = Math.max(answer, start);
    }
}
