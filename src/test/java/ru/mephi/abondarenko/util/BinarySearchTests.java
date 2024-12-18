package ru.mephi.abondarenko.util;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTests {

    @Test
    public void testByteArray() {
        byte[] array = {1, 3, 5, 7, 9};
        assertEquals(2, Arrays.binarySearch(array, (byte) 5));
        assertEquals(-1, Arrays.binarySearch(array, (byte) 0));
        assertEquals(-6, Arrays.binarySearch(array, (byte) 10));
    }

    @Test
    public void testCharArray() {
        char[] array = {'a', 'c', 'e', 'g'};
        assertEquals(1, Arrays.binarySearch(array, 'c'));
        assertEquals(-2, Arrays.binarySearch(array, 'b'));
        assertEquals(-5, Arrays.binarySearch(array, 'z'));
    }

    @Test
    public void testDoubleArray() {
        double[] array = {1.1, 2.2, 3.3, 4.4};
        assertEquals(2, Arrays.binarySearch(array, 3.3));
        assertEquals(-1, Arrays.binarySearch(array, 0.0));
        assertEquals(-5, Arrays.binarySearch(array, 5.0));
    }

    @Test
    public void testFloatArray() {
        float[] array = {1.1f, 2.2f, 3.3f, 4.4f};
        assertEquals(2, Arrays.binarySearch(array, 3.3f));
        assertEquals(-1, Arrays.binarySearch(array, 0.0f));
        assertEquals(-5, Arrays.binarySearch(array, 5.0f));
    }

    @Test
    public void testIntArray() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(3, Arrays.binarySearch(array, 4));
        assertEquals(-1, Arrays.binarySearch(array, 0));
        assertEquals(-6, Arrays.binarySearch(array, 6));
    }

    @Test
    public void testLongArray() {
        long[] array = {10L, 20L, 30L, 40L};
        assertEquals(1, Arrays.binarySearch(array, 20L));
        assertEquals(-1, Arrays.binarySearch(array, 5L));
        assertEquals(-5, Arrays.binarySearch(array, 50L));
    }

    @Test
    public void testShortArray() {
        short[] array = {2, 4, 6, 8};
        assertEquals(2, Arrays.binarySearch(array, (short) 6));
        assertEquals(-1, Arrays.binarySearch(array, (short) 1));
        assertEquals(-5, Arrays.binarySearch(array, (short) 10));
    }

    @Test
    public void testGenericArray() {
        String[] array = {"apple", "banana", "cherry"};
        assertEquals(1, Arrays.binarySearch(array, "banana", String::compareTo));
        assertEquals(-2, Arrays.binarySearch(array, "avocado", String::compareTo));
        assertEquals(-4, Arrays.binarySearch(array, "date", String::compareTo));
    }

    @Test
    public void testGenericList() {
        List<String> list = List.of("cat", "dog", "fish");
        assertEquals(1, Collections.binarySearch(list, "dog"));
        assertEquals(-1, Collections.binarySearch(list, "ant"));
        assertEquals(-4, Collections.binarySearch(list, "zebra"));
    }

    @Test
    public void testGenericListWithComparator() {
        List<String> list = List.of("cat", "dog", "fish");
        assertEquals(1, Collections.binarySearch(list, "dog", String::compareTo));
        assertEquals(-1, Collections.binarySearch(list, "ant", String::compareTo));
        assertEquals(-4, Collections.binarySearch(list, "zebra", String::compareTo));
    }
}
