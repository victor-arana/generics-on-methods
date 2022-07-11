package com.no.data;

import com.no.data.model.Person;

import java.util.List;

/**
 * Hello world!
 *
 */
public class Minimizer
{

    public static Person min(List<Person> people) {

        if(people.isEmpty()){
            throw new IllegalArgumentException("List is empty, cannot find minimum");
        }

        return null;

    }

}
