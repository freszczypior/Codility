package lesson3;

import lessons.lesson3.time_complexity.TapeEquilibrium;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TapeEquilibriumTest {


    @Test
    public void checkIfReturCorrectlyValue() {
        //give
        TapeEquilibrium elem = new TapeEquilibrium();

        //when
        int[] tab1 = {1, 2, 3};
        int[] tab2 = {2, 3, 4};
        int[] tab3 = {1};
        int[] tab4 = {};
        int[] tab5 = {1, 2, 3, 5};
        int[] tab6 = {100001};
        int[] tab7 = {2, 3, 1, 5};

        //then
        assertEquals(0, elem.solution(tab1));
        assertEquals(1, elem.solution(tab2));
        assertEquals(2, elem.solution(tab3));
        assertEquals(1, elem.solution(tab4));
        assertEquals(4, elem.solution(tab5));
        assertEquals(100000, elem.solution(tab6));
        assertEquals(4, elem.solution(tab7));

    }

}
