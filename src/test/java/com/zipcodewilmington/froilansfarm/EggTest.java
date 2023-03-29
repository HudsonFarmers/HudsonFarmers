package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.edible.Edible;
import com.zipcodewilmington.froilansfarm.edible.Egg;
import org.junit.Assert;
import org.junit.Test;

public class EggTest {
    @Test
    public void testInheritanceOfEdible(){
        Egg egg = new Egg();
        Assert.assertTrue(egg instanceof Edible);
    }

}
