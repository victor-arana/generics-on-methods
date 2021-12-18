package com.no.data;

import java.util.List;

public class Minimizer
{

    public static Object min(List<Person> people, AgeComparator ageComparator) {
        if(people.isEmpty()){
            throw new IllegalArgumentException("List is empty, cannot find minimum.");
        }
        return null;
    }
}
