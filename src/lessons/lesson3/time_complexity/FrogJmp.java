package lessons.lesson3.time_complexity;

public class FrogJmp {

    public static int solution(int X, int Y, int D) {

        int toJump = Y - X;

        if (toJump == 0)
            return 0;

        int jumps;
        if (toJump > D) {
            jumps = toJump / D;
            if (toJump % D != 0)
                jumps++;
            return jumps;
        }
        return 1;
    }

    //czyjeś ładniejsze rozwiązanie
    public static int solution2(int X, int Y, int D) {

        return (Y-X) % D > 0 ? (Y-X)/D+1 : (Y-X)/D;

    }

}
