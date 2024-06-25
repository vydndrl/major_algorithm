package A2dfs;

public class D6타겟넘버 {
    static int answer;
       public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println("solution(numbers, target) = " + solution(numbers, target));
       }

    private static int solution(int[] numbers, int target) {
           answer = 0;
           dfs(0, numbers, 0, target);
           return answer;
    }
    static void dfs(int depth, int[] numbers, int sum, int target) {
        if (depth == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }
        dfs(depth + 1, numbers, sum + numbers[depth], target);
        dfs(depth + 1, numbers, sum - numbers[depth], target);
    }
}
