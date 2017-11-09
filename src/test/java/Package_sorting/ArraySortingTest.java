package Package_sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySortingTest {

    @Test
    public void test_sort_insertion () throws Exception {

        int[] not_sorted_array = {15, 26, 44, 21, 23, 77, 79, 36, 67, 33};
        int[] sorted_array = {15, 21, 23, 26, 33, 36, 44, 67, 77, 79};

        ArraySortingInsertion as = new ArraySortingInsertion(10);
        as.array = not_sorted_array;
        as.sort();

        assertArrayEquals(sorted_array, as.array);

    }

    @Test
    public void test_sort_selection () throws Exception {

        int[] not_sorted_array = {88, 63, 68, 12, 82, 6, 41, 75, 36, 95};
        int[] sorted_array = {6, 12, 36, 41, 63, 68, 75, 82, 88, 95};

        ArraySortingSelection as = new ArraySortingSelection(10);
        as.array = not_sorted_array;
        as.sort();

        assertArrayEquals(sorted_array, as.array);

    }

    @Test
    public void test_sort_bubble () throws Exception {

        int[] not_sorted_array = {99, 46, 93, 89, 23, 6, 35, 74, 98, 90};
        int[] sorted_array = {6, 23, 35, 46, 74, 89, 90, 93, 98, 99};

        ArraySortingBubble as = new ArraySortingBubble(10);
        as.array = not_sorted_array;
        as.sort();

        assertArrayEquals(sorted_array, as.array);

    }

}
