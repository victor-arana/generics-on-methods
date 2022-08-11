package com.no.data;

import com.no.data.model.Person;
import org.junit.Assert;
import org.junit.Test;

public class PersonCompareTest {

    @Test
    public void youngerCompareToOlderReturns_negative(){

        // Given a person A younger than a Person B
        Person A = new Person("Ana", 35);
        Person B = new Person("Victor", 40);

        // When compared
        boolean personAisYoungerThanPersonB = A.compareTo(B) < 0;

        // Then comparison result is negative
        Assert.assertTrue(personAisYoungerThanPersonB);

    }

    @Test
    public void sameAgePeopleReturns_0(){

        // Given two persons having the same age
        Person A = new Person("Ana", 35);
        Person B = new Person("Carolina", 35);

        // When compared
        boolean personAandPersonBareTheSameAge = A.compareTo(B) == 0;

        // Then comparison result is zero
        Assert.assertTrue(personAandPersonBareTheSameAge);
    }

    @Test
    public void olderComparesToYounger_returnsPositive(){

        // Given an older person compared to a younger person
        Person A = new Person("Ana", 35);
        Person B = new Person("Victor", 40);

        // When compared
        boolean personBisOlderThanPersonA = B.compareTo(A) > 0  ;

        // Then comparison result is positive
        Assert.assertTrue(personBisOlderThanPersonA);
    }


}
