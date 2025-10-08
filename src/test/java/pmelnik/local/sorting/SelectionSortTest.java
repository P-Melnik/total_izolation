package pmelnik.local.sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    SelectionSort selectionSort = new SelectionSort();

//    int [] initialArray = {2, 1, 3, 5, 4, 9, 6, 10, 8, 7};
//    int [] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    @Test
    void testSort() {

        int [] initialArray = {2, 1, 3, 5, 4, 9, 6, 10, 8, 7};

        selectionSort.sort(initialArray);

        printArray(initialArray);

        assertEquals(1, initialArray[0]);
        assertEquals(2, initialArray[1]);
        assertEquals(3, initialArray[2]);
        assertEquals(4, initialArray[3]);
        assertEquals(5, initialArray[4]);
        assertEquals(6, initialArray[5]);
        assertEquals(7, initialArray[6]);
        assertEquals(8, initialArray[7]);
        assertEquals(9, initialArray[8]);
        assertEquals(10, initialArray[9]);

    }

    void printArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }

}