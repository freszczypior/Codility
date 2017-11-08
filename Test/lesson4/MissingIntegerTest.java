package lesson4;

import lessons.lesson4.counting_elements.MissingInteger;

import org.junit.Test;

import static org.junit.Assert.*;


public class MissingIntegerTest {

    @Test
    public void checkIfReturCorrectlyValue() {
        int[] tab1 = {-15, 100, 200};
        int[] tab2 = {1, 2, 3};
        int[] tab3 = {-5, -4};
        int[] tab4 = {100};
        int[] tab5 = {-15, 0, 100, 200};
        int[] tab6 = {-15, 0, 1, 2};
        int[] tab7 = {-15, -1, 0, 1, 2, 4};
        int[] tab8 = {-15, 0, 0, 0, 100, 200};
        int[] tab9 = {0, 2};
        int[] tab10 = {-3,-2,-1,0};
        int[] tab11 = {2};

        MissingInteger missingInteger = new MissingInteger();
        assertEquals(1, MissingInteger.solution(tab1));
        assertEquals(4, MissingInteger.solution(tab2));
        assertEquals(1, MissingInteger.solution(tab3));
        assertEquals(1, MissingInteger.solution(tab4));
        assertEquals(1, MissingInteger.solution(tab5));
        assertEquals(3, MissingInteger.solution(tab6));
        assertEquals(3, MissingInteger.solution(tab7));
        assertEquals(1, MissingInteger.solution(tab8));
        assertEquals(1, MissingInteger.solution(tab9));
        assertEquals(1, MissingInteger.solution(tab10));
        assertEquals(1, MissingInteger.solution(tab11));
    }

}
