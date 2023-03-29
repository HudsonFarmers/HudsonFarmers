package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.edible.Edible;
import com.zipcodewilmington.froilansfarm.edible.Tomato;
import org.junit.Assert;
import org.junit.Test;

public class TomatoTest {
    @Test
    public void testInheritanceOfEdible(){
        Tomato tomato = new Tomato();

        Assert.assertTrue(tomato instanceof Edible);
    }
}
