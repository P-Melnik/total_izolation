package pmelnik.local.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    QuickSort sut = new QuickSort();

    @Test
    void quickSort() {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        sut.quickSort(array, 0, array.length - 1);

        assertEquals(11, array[0]);
        assertEquals(12, array[1]);
        assertEquals(22, array[2]);
        assertEquals(25, array[3]);
        assertEquals(34, array[4]);
        assertEquals(64, array[5]);
        assertEquals(90, array[6]);
    }
}