package com.no.data;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MinimizerTest
{

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnYoungestCastMember()
    {
        // Given an empty list
        List<Person> madMen = new ArrayList<>();
        // When calling min method
        Minimizer.min(madMen, new AgeComparator());
        // Should throw an IllegalArgumentException
    }

    @Test
    public void shouldReturnMinimumElementByAge(){
        // Given an unordered by age list with size > 1
        List<Person> madMen = new ArrayList<>();
        madMen.add(new Person("Don Draper", 89));
        madMen.add(new Person("Peggy Olson", 65));
        madMen.add(new Person("Bert Cooper", 100));

        // When calling min method on this list
        final Person actualPerson = Minimizer.min(madMen, new AgeComparator());

        // Should return the element having the minimum age
        final Person expectedPerson = new Person("Peggy Olson", 65);
        Assert.assertEquals(expectedPerson, actualPerson);
    }
}
