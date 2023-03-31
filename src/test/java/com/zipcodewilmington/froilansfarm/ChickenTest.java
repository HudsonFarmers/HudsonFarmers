package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.edible.Egg;
import com.zipcodewilmington.froilansfarm.edible.Produce;
import com.zipcodewilmington.froilansfarm.farm.Animal.Animal;
import com.zipcodewilmington.froilansfarm.farm.Animal.Chicken;
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
    Assert.assertTrue(chicken instanceof Animal);    }


@Test
public void makesNoiseTest(){
    Chicken<Corn,Egg> chicken= new Chicken<>();
    String expected = "bak bak";
    Assert.assertEquals(expected, chicken.makeNoise());
}
    @Test
    public void testYield(){
        Chicken chicken= new Chicken();
        Egg actual = chicken.yield();
        Assert.assertNotNull(actual);
    }
    @Test
    public void testFailYield(){
        Chicken chicken= new Chicken();
        Egg actual= chicken.yield();
        actual.setIsFertilized(true);
        Assert.assertNull(actual);
    }
    @Test
    public void testEat() {
        Chicken chicken = new Chicken();
        Corn corn = new Corn ();
        chicken.eat(corn);

        Boolean expected = true;
        //Boolean actual = chicken.hasEaten(corn);

        //Assert.assertEquals(expected, actual);
    } // possibly test quantity of food in storage?


}
