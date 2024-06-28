package B0628;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class B오큰수 {
    public static void main(String[] args) {
        int n = 4;
        int[] m = {3, 5, 2, 7};

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && m[stack.peek()] < m[i]) {
                m[stack.pop()] = m[i];
            }
            stack.push(i);
        }

        while(!stack.isEmpty()) {
            m[stack.pop()] = -1;
        }

        System.out.println("m = " + Arrays.toString(m));

    }
}
