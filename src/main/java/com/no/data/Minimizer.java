package com.no.data;

import java.util.Comparator;
import java.util.List;

public class Minimizer
{
    // Prevent the instantiation of a utility class
    private Minimizer() {}

    public static <T> T min(List<T> list, Comparator<T> comparator) {
        if(list.isEmpty()){
            throw new IllegalArgumentException("List is empty, cannot find minimum.");
        }

        // Assume the first element is the lowest
        T lowestElement = list.get(0);

        // Look for a lower element on the remaining elements
        for (int i = 1; i < list.size(); i++) {
            final T element = list.get(i);
            if (comparator.compare(element, lowestElement) < 0) {
                lowestElement = element;
            }
        }

        return lowestElement;
    }
}
