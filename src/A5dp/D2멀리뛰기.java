package A5dp;

public class D2멀리뛰기 {
    public static void main(String[] args) {
        int n = 4;
        long solution = solution(n);
        System.out.println("solution = " + solution);
    }

    private static long solution(int n) {
        long answer = 0;
//        식 : f(n) = f(n-1) + f(n-2)
        int[] arr = new int[n + 1];

        arr[1] = 1;
        arr[2] = 2;

        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        answer = arr[n];
        return answer;
    }
}
