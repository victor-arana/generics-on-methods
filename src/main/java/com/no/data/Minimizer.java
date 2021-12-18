package com.no.data;

import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Minimizer
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static Object min(List list, Comparator comparator) {
        if(list.isEmpty()){
            throw new IllegalArgumentException("List is empty, cannot find minimum.");
        }
        return null;
    }
}
