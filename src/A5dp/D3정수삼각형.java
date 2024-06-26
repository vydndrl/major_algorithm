package A5dp;

import java.util.Arrays;

public class D3정수삼각형 {
    public static void main(String[] args) {
        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};

        int solution = solution(triangle);
        System.out.println("solution = " + solution);
    }

    private static int solution(int[][] triangle) {
        int[][] answerArr = new int[triangle.length][];
        answerArr[0] = Arrays.copyOf(triangle[0], triangle[0].length);
        for (int i = 0; i < triangle.length - 1; i++) {
            answerArr[i + 1] = new int[triangle[i + 1].length];
            for (int j = 0; j < triangle[i].length; j++) {
                if(answerArr[i][j] + triangle[i+1][j] > answerArr[i+1][j]) {
                    answerArr[i+1][j] = answerArr[i][j] + triangle[i+1][j];
                }
                if (answerArr[i][j] + triangle[i+1][j+1] > answerArr[i+1][j+1]) {
                    answerArr[i+1][j+1] = answerArr[i][j] + triangle[i+1][j+1];
                }
            }
        }
        System.out.println("answerArr = " + Arrays.deepToString(answerArr));
        return 1;
    }
}


