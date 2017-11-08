package lesson3;

import lessons.lesson3.time_complexity.FrogJmp;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrogJumpTest {

    @Test
    public void shouldCountJumps(){

        int jumps1 = FrogJmp.solution(10,85,30);
        int jumps2 = FrogJmp.solution(10,10,30);
        int jumps3 = FrogJmp.solution(20,100,20);
        int jumps4 = FrogJmp.solution(10,85,100);
        assertEquals(3, jumps1);
        assertEquals(0, jumps2);
        assertEquals(4, jumps3);
        assertEquals(1, jumps4);


    }
}
