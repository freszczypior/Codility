package lessons.lesson3.time_complexity;

import java.util.Arrays;

public class TapeEquilibrium {

    public int solution(int[] A) {

        Integer min = null;
        int sum = 0;
        int first = 0;
        int second;
        int diff;

        for (int i = 0; i < A.length; i++)
            sum += A[i];

        for (int i = 0; i < A.length - 1; i++){
            first += A[i];
            second = sum - first;
            diff = first - second;
            if (diff < 0)
                diff *= -1;
            if (i != 0) {
                min = min < diff ? min : diff;
            } else {
                min = diff;
            }
        }
        return min;
    }
}
