package ru.mephi.abondarenko.util;


import java.util.Comparator;

public class Arrays {

    public static int binarySearch(byte[] a, byte key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        return Collections.binarySearchInternal(fromIndex, toIndex - 1, key, i -> a[i], Byte::compare);
    }

    public static int binarySearch(char[] a, char key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        return Collections.binarySearchInternal(fromIndex, toIndex - 1, key, i -> a[i], Character::compare);
    }

    public static int binarySearch(double[] a, double key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        return Collections.binarySearchInternal(fromIndex, toIndex - 1, key, i -> a[i], Double::compare);
    }

    public static int binarySearch(float[] a, float key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        return Collections.binarySearchInternal(fromIndex, toIndex - 1, key, i -> a[i], Float::compare);
    }

    public static int binarySearch(int[] a, int key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        return Collections.binarySearchInternal(fromIndex, toIndex - 1, key, i -> a[i], Integer::compare);
    }

    public static int binarySearch(long[] a, long key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        return Collections.binarySearchInternal(fromIndex, toIndex - 1, key, i -> a[i], Long::compare);
    }

    public static int binarySearch(short[] a, short key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        return Collections.binarySearchInternal(fromIndex, toIndex - 1, key, i -> a[i], Short::compare);
    }

    public static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) {
        return binarySearch(a, 0, a.length, key, c);
    }

    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        return Collections.binarySearchInternal(fromIndex, toIndex - 1, key, i -> a[i], c);
    }
}


