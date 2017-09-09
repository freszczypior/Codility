package lessons.lesson1.iterations;

// Find longest sequence of zeros in binary representation of an integer.

public class BinaryGap {

    public static void main(String[] args) {

        System.out.println(solution(561892));
    }


    public static int solution(int N) {
        int BASE = 2;
        StringBuilder sb = new StringBuilder();
        int longestSeq = 0;
        int tempLongest = 0;
        int index = 0;
        while (N > 0) {
            sb.insert(0, N % BASE);
            N /= BASE;
        }
        while (index < sb.length()) {
            if (sb.charAt(index) == '0') {
                tempLongest++;
                if (index != sb.length() - 1) {
                    if (sb.charAt(index + 1) != '0') {
                        if (tempLongest >= longestSeq) {
                            longestSeq = tempLongest;
                        }
                        tempLongest = 0;
                    }
                }
            }
            index++;
        }
        return longestSeq;
    }
}


