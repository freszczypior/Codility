package lessons.lesson2.arrays;


import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

    static int[] A = {9,3,9,3,9,9,7};

    public static void main(String[] args) {
        System.out.println(solutionV1(A));
        System.out.println(solutionV2(A));
    }

    public static int solutionV1(int[] A) {
        int unpaired = 0;
        Map<Integer, Integer> map = new HashMap();
        for (Integer elem : A) {
            Integer temp = map.get(elem);
            if (temp == null)
                map.put(elem, 1);
            else
                map.put(elem, map.get(elem)+1);
        }
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() % 2 != 0)
            unpaired = entry.getKey();
        }
        return unpaired;
    }

    public static int solutionV2(int[] A) {
        int result = 0;
        for (int a : A) {
            result ^= a; //XOR, czyli operator porówniania binarek, zwraca More simply, you can also think of xor as "this or that, but not both!".
        }
        return result;
        }
    }

