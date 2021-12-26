package com.no.data;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class PersonStorageTest {

    private File file;
    private PersonSaver saver;
    private PersonLoader loader;

    // Run Before each test
    @Before
    public void setUp() throws IOException {
        file = File.createTempFile("tmp", "people");
        saver = new PersonSaver(file);
        loader = new PersonLoader(file);
    }

    @Test
    public void shouldSaveAndLoadPerson() throws Exception {
        // Given a Person object
        Person person = new Person("Bob", 20);
        // When save and load the same Person
        saver.save(person);
        // Then loaded person is equals to saved person
        Person actualPerson = loader.load();
        Assert.assertEquals(person, actualPerson);
    }

    @Test
    public void shouldSaveAndLoadPartner() throws Exception {
        // Given a Partner instance
        Person person = new Partner("Don Draper", 89);
        saver.save(person);
        // Then loaded person is equals to saved person
        final Person actualPerson = loader.load();
        Assert.assertEquals(person, actualPerson);
    }

    @Test
    public void shouldSaveAndLoadEmployee() throws Exception {
        // Given an Employee instance
        Person person = new Employee("Peggy Olson", 65);
        saver.save(person);
        // Then loaded person is equals to saved person
        final Person actualPerson = loader.load();
        Assert.assertEquals(person, actualPerson);
    }

    // Run after each test
    @After
    public void tearDown(){
        if(file.exists()){
            file.delete();
        }
    }
}