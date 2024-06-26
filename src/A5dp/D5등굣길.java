package A5dp;

import java.util.Arrays;

public class D5등굣길 {
    public static void main(String[] args) {
        int m = 4;
        int n = 3;
        int[][] puddles = {{2, 2}};

        int solution = solution(m, n, puddles);
        System.out.println("solution = " + solution);
    }

    private static int solution(int m, int n, int[][] puddles) {
        int[][] maps = new int[n][m];

        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length; j++) {
                maps[i][j] = 1;
                if (i == puddles[0][0] && j == puddles[0][1]) {
                    maps[i -1][j- 1] = -1;
                }
            }
        }


        System.out.println("maps = " + Arrays.deepToString(maps));
        return 1;
    }
}
