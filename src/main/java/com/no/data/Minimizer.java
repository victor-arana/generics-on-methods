package com.no.data;

import java.util.Comparator;
import java.util.List;

public class Minimizer
{

    public static Object min(List list, Comparator comparator) {
        if(list.isEmpty()){
            throw new IllegalArgumentException("List is empty, cannot find minimum.");
        }
        return null;
    }
}
