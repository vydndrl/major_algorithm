package A7이분탐색;

public class B3입국심사 {
    public static void main(String[] args) {
        int n = 6;
        int[] times = {7, 10};

        long solution = solution(n, times);
        System.out.println("solution = " + solution);
    }

    private static long solution(int n, int[] times) {
        long answer = 0;
        long start = 0;
        long end = (long) times[times.length - 1] * n;

        while (start <= end){
            long mid = (start + end) / 2;
            long usablePeople = 0;
            for (int time : times) {
                usablePeople += mid / time; // mid 시간동안 각각 처리할수있는 수
            }
            System.out.println("start : " + start + "| END : " + end + "| MID : " + mid + "| 가능한사람 : " + usablePeople );
            if(usablePeople >= n){
                end = mid - 1;
                answer = mid;
            }else{
                start = mid + 1;
            }
        }
        return answer;
    }
}
