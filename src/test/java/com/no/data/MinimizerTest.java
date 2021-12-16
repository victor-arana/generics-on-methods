package com.no.data;


import org.junit.Test;

import java.util.ArrayList;

public class MinimizerTest
{

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnYoungestCastMember()
    {
        // Given an empty list
        List<Person> madMen = new ArrayList<>();
        // When calling min method
        final Person actualPerson =
                (Person) Minimizer.min(madmen, new AgeComparator());
        // Should throw an IllegalArgumentException
    }
}
