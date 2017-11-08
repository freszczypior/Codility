package lessons.lesson2.arrays;
//
//A zero-indexed array A consisting of N integers is given.
// Rotation of the array means that each element is shifted right by one index,
// and the last element of the array is also moved to the first place.
//
//        For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7].
// The goal is to rotate array A K times; that is, each element of A will be shifted to the right by K indexes.
//
//        Write a function:
//
//class Solution { public int[] solution(int[] A, int K); }
//that, given a zero-indexed array A consisting of N integers and an integer K, returns the array A rotated K times.
//
//        For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function should return [9, 7, 6, 3, 8].
//
//        Assume that:
//
//        N and K are integers within the range [0..100];
//        each element of array A is an integer within the range [−1,000..1,000].
//        In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.

public class CyclicRotation {

    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6, 9, -999, 1000, -1000};
        int[] result = solution(tab, 2);
        for (int temp : result) {
            System.out.print(temp + " ");
        }
    }

    public static int[] solution(int[] A, int K) {
        if (A.length > 1) {
            for (int i = 0; i < K; i++) {
                int lastElem = A[A.length - 1];
                System.arraycopy(A, 0, A, 1, A.length - 1);
                A[0] = lastElem;
            }
            return A;
        }
        return A;
        }
//    public static int[] solution(int[] A, int K) {      // 87% codilla
//        int[] resultTab = new int[A.length];
//        int[] tempTab = A;
//        if (A.length <= 1 || (A.length == 2 && K % 2 == 0) || A.length == K)
//            resultTab = A;
//        else if (A.length == 2 && A.length % 2 != 0) {
//            resultTab[0] = A[1];
//            resultTab[1] = A[0];
//        } else
//            for (int i = 0; i < K; i++) {
//                resultTab[0] = tempTab[tempTab.length - 1];
//                for (int j = 0; j < tempTab.length - 1; j++) {
//                    resultTab[j + 1] = tempTab[j];
//                }
//                tempTab = resultTab.clone();
//            }
//        return resultTab;
//    }
}
