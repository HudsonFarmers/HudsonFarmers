package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {
    Animal.Chicken chicken= new Animal.Chicken();
    Tomato tomato= new Tomato();
    EatCorn corn = new EatCorn();
    Egg egg = new Egg();


@Test
    public void testInheritance(){
        Assert.assertTre(chicken instanceof produce);
    }
@Test
    public void testInheritance() {
        Assert.assertTrue(chicken instanceof Animal);
    }


@Test
public void makesNoiseTest(){
    String expected = "bak bak";
    Assert.assertEquals(expected, chicken.makesNoise());
}
@Test
    public void testYield(){
        chicken.isFertilized=false;
        Egg actual= chicken.harvestYield();
        Assert.assertTrue(actual instanceof Egg);
    }
    @Test
    public void testFailYield(){
        chicken.isFertilized=true;
        Egg actual= chicken.harvestYield();
        Assert.assertFalse(actual instanceof Egg);
    }
}
