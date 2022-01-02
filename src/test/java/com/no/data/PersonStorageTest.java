package com.no.data;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void shouldSaveAndLoadArrayOfPeople() throws Exception {
        // Given an array of two Person objects
        Person[] persons = new Person[2];
        persons[0] = new Partner("Don Draper", 89);
        persons[1] = new Partner("Bert Cooper", 100);
        // When save the array of persons
        saver.saveAll(persons);

        Assert.assertEquals(persons[0], loader.load());
        Assert.assertEquals(persons[1], loader.load());
    }

    @Test(expected = ArrayStoreException.class)
    public void shouldThrowException() throws Exception {
        // Given an array of two Person objects
        Person[] persons = new Employee[2];
        persons[0] = new Partner("Don Draper", 89);
    }

    @Test
    public void shouldSaveAndLoadListOfPeople() throws Exception {
        // Given a List of persons
        List<Person> persons = new ArrayList<>();
        persons.add(new Partner("Don Draper", 89));
        persons.add(new Partner("Bert Cooper", 100));

        // When save the array of persons
        saver.saveAll(persons);
        // Then should load list of people
        Assert.assertEquals(persons.get(0), loader.load());
        Assert.assertEquals(persons.get(1), loader.load());
    }

    @Test
    public void shouldSaveAndLoadListOfPartners() throws Exception {
        // Given a List of persons
        List<Partner> persons = new ArrayList<>();
        persons.add(new Partner("Don Draper", 89));
        persons.add(new Partner("Bert Cooper", 100));

        // When save the array of persons
        saver.saveAll(persons);
        // Then should load list of people
        Assert.assertEquals(persons.get(0), loader.load());
        Assert.assertEquals(persons.get(1), loader.load());
    }

    // Run after each test
    @After
    public void tearDown(){
        if(file.exists()){
            file.delete();
        }
    }
}
