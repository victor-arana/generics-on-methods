package com.no.data;


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
        final Person actualPerson =
                (Person) Minimizer.min(madMen, new AgeComparator());
        // Should throw an IllegalArgumentException
    }
}
