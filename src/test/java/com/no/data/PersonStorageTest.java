package com.no.data;

import org.junit.Assert;
import org.junit.Test;

public class PersonStorageTest {

    private PersonSaver saver;
    private PersonLoader loader;

    @Test
    public void shouldSaveAndLoadPerson() {
        // Given a Person object
        Person person = new Person("Bob", 20);
        // When save and load the same Person
        saver.save(person);
        // Then loaded person is equals to saved person
        Assert.assertEquals(person, loader.load());
    }
}
