package com.zipcodewilmington.froilansfarm.animalstests;

import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.edible.Egg;
import com.zipcodewilmington.froilansfarm.edible.Produce;
import com.zipcodewilmington.froilansfarm.Animal.animals.Animal;
import com.zipcodewilmington.froilansfarm.Animal.animals.Chicken;
import com.zipcodewilmington.froilansfarm.farm.Storage;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {
    @Test
    public void testInheritanceOfProduce(){
        Chicken<Corn,Egg> chicken= new Chicken<>();
        Assert.assertTrue(chicken instanceof Produce);
    }
@Test
    public void testInheritanceOfAnimal() {
    Chicken<Corn,Egg> chicken= new Chicken<>();
    Assert.assertTrue(chicken instanceof Animal);
    }


@Test
public void makesNoiseTest(){
    Chicken<Corn,Egg> chicken= new Chicken<>();
    String expected = "bak bak";
    Assert.assertEquals(expected, chicken.makeNoise());
}
    @Test
    public void testYield(){
        Chicken<Corn,Egg> chicken= new Chicken();
        Egg actual = chicken.yield();
        Assert.assertNotNull(actual);
    }
    @Test
    public void testFailYield(){
        Chicken<Corn,Egg> chicken= new Chicken<>();
        Egg actual= chicken.yield();
        actual.setIsFertilized(true);
        Assert.assertFalse(actual.isEdible()); // egg is not edible because it's fertilized
    }
    @Test
    public void testEat() {
        Chicken<Corn,Egg> chicken = new Chicken<>();
        Corn corn = new Corn();

        // added corn in corn storage
        Storage.getCornStorage().add(corn);

        // make sure corn is in storage
        Assert.assertTrue(Storage.getCornStorage().contains(corn));

        // chicken eats corn will remove the corn in the storage
        chicken.eat(corn);

        // check to make sure corn is not in storage
        Assert.assertFalse(Storage.getCornStorage().contains(corn));
    }


}
