package ru.mephi.abondarenko.util;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Collections {
    static <T> int binarySearchInternal(int low, int high, T key, Function<Integer, T> elementAt, Comparator<? super T> comparator) {
        while (low <= high) {
            int mid = (low + high) >>> 1;
            T midVal = elementAt.apply(mid);
            int cmp = comparator.compare(midVal, key);

            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -(low + 1);
    }

    public static <T extends Comparable<? super T>> int binarySearch(List<? extends T> list, T key) {
        return binarySearch(list, key, Comparator.naturalOrder());
    }

    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c) {
        return binarySearchInternal(0, list.size() - 1, key, list::get, c);
    }
}
