package A7이분탐색;

import java.util.Arrays;

// 외우기
public class B1Basic1 {
    public static void main(String[] args) {
//        이분탐색은 사전에 오름차순 정렬이 되어 있어야 가능한 알고리즘
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 17;
        int start = 0;
        int end = arr.length - 1;
        int index = -1;
        Arrays.sort(arr);

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                index = mid;
                break;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("index = " + index);
    }
    
}
