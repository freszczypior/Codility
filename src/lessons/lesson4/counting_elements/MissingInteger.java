package lessons.lesson4.counting_elements;

import java.util.Arrays;

public class MissingInteger {

    public static int solution(int[] A) {
        Arrays.sort(A);

        if (A[0] > 1 || A[A.length - 1] <= 0)
            return 1;

        if (A.length == 1)
            if (A[0] == 1)
                return A[0] + 1;
            else
                return 1;

        int counter = 0;
        while (A[counter] < 1)
            counter++;
        if (A[counter] != 1)
            return 1;
        for (int i = counter; i < A.length - 1; i++) {
            int current = A[i];
            int next = A[i + 1];
            if (next - current >= 2)
                return current + 1;
            continue;
        }
        return A[A.length - 1] + 1;
    }
}
