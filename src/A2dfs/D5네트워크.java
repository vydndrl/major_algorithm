package A2dfs;

public class D5네트워크 {
    public static void main(String[] args) {
        int n = 3; //컴퓨터 개수
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 1, 1}}; //{{}{}{}} -> 각 컴퓨터가 접근할수있는컴퓨터 들
        int solution = new Solution().solution(n, computers);
        System.out.println(solution);
    }

    static class Solution {
        public int solution(int n, int[][] computers) {
            int answer = 0;
            boolean[] visited = new boolean[n];
            for(int i = 0 ; i< n; i++){ //모든 컴퓨터를 방문할때까지
                if(visited[i] == false){ //방문하지 않은 컴퓨터라면
                    dfs(computers,i,visited); //dfs로 방문
                    answer++; //네트워크 개수 증가
                }
            }
            return answer;
        }

        void dfs(int[][]computers, int start, boolean[] visited){
            visited[start] = true; //방문한 컴퓨터 체크

            for(int i = 0 ; i < computers.length; i++){ //모든 컴퓨터를 방문할때까지
                if(computers[start][i] == 1 && visited[i] == false ){ //연결되어있고 방문하지 않은 컴퓨터라면
                    dfs(computers,i,visited); //dfs로 방문
                }
            }

        }
    }
}