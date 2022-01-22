package com.no.data;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class ListCopierTest {

    @Test
    public void shouldCopyBananasToFruits(){
        // Given a list of Bananas
        List<Banana> bananas = new ArrayList<>();
        bananas.add(new Banana());
        bananas.add(new Banana());
        // When copying into a list of fruits
        List<Fruit> fruits = new ArrayList<>();
        ListCopier.copy(bananas, fruits);
        // Size of fruits should be two
        Assert.assertTrue(bananas.size() == fruits.size());
    }
}
