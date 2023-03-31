package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class Person {

    @Test
    public void testImplementation() {
        Person person = new Person();
        Assert.assertTrue(person instanceof Animal);
    }
    @Test
    String makeNoise() {
        Person person = new Person();
        String actual = person.makeNoise();
        String expected = "Hello!";
        Assert.assertEquals(expected,actual);
    }
}
