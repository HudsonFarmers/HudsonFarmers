package com.zipcodewilmington.froilansfarm.edibletests;

import com.zipcodewilmington.froilansfarm.edible.Edible;
import com.zipcodewilmington.froilansfarm.edible.Tomato;
import org.junit.Assert;
import org.junit.Test;

public class git TomatoTest {
    @Test
    public void testInheritanceOfEdible(){
        Tomato tomato = new Tomato();

        Assert.assertTrue(tomato instanceof Edible);
    }
}
