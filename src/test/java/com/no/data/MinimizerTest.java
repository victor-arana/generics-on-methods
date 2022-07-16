package com.no.data;

import com.no.data.model.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
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
        List<Person> madMen = Arrays.asList(
                new Person("Don Draper", 89),
                new Person("Peggy Olson", 65),
                new Person("Bert Cooper", 100)
        );

        // When calling min method on this list
        Person actualYoungestPerson = Minimizer.min(madMen);

        // Then return youngest Person
        Person expectedYoungestPerson = new Person("Peggy Olson", 65);
        Assert.assertEquals(expectedYoungestPerson, actualYoungestPerson);

    }

}
