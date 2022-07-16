package com.no.data;

import com.no.data.model.Person;

import java.util.List;

public class Minimizer
{

    public static Person min(List<Person> people) {

        if(people.isEmpty()){
            throw new IllegalArgumentException("List is empty, cannot find minimum");
        }

        // Assume the first person is the youngest
        Person youngestPerson = people.get(0);

        // Look for a younger person on the remaining people
        for(int i = 1; i < people.size(); i++){
            final Person person = people.get(i);
            if(person.compareTo(youngestPerson) < 0){
                youngestPerson = person;
            }
        }

        return youngestPerson;

    }

}
