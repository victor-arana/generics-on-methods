package com.no.data;

import java.util.List;

public class ListCopier {
    public static <T> void copy(List<? extends T> source, List<T> target) {
        for(T element: source){
            target.add(element);
        }
    }
}
