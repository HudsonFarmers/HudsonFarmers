package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class Person {
    Person person = new Person();
@Test
    public void testImplementation() {
        Assert.assertTrue(person instanceof Animal);
    }
    @Test
    String makeNoise() {
        String actual = person.makeNoise();
        String expected = "Hello!";
        Assert.assertEquals(expected,actual);
    }
}
