package A6투포인터;

public class T3숫자의표현 {
    public static void main(String[] args) {
        int n = 15;

        int solution = solution(n);
        System.out.println("solution = " + solution);
    }

    private static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;
                System.out.println("sum = " + sum);

                if (sum == n) {
                    answer++;
                    break;
                }

                if (sum > n) {
                    break;
                }

            }
        }
        return answer;
    }
}
