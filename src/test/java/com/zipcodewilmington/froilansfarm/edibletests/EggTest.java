package com.zipcodewilmington.froilansfarm.edibletests;

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

    @Test
    public void testEdibleFalse(){
        Egg egg = new Egg();
        egg.setIsFertilized(true);
        Assert.assertFalse(egg.isEdible());
    }

    @Test
    public void testEdibleTrue(){
        Egg egg = new Egg();
        Assert.assertTrue(egg.isEdible());
    }

}
