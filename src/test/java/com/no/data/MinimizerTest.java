package com.no.data;

import com.no.data.model.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MinimizerTest
{

    @Test(expected = IllegalArgumentException.class)
    public void onEmptyList_throw_IllegalArgumentException()
    {

        // Given an empty list
        List<Person> madMen = new ArrayList<>();

        // When calling min method
        Person madMan = Minimizer.min(madMen);

        // Then throw an IllegalArgumentException
    }

    @Test
    public void onNonEmptyList_return_youngestPerson(){
        // Given an unordered list of people with size > 1
        // When calling min method on this list
        // Then return youngest Person
    }

}
