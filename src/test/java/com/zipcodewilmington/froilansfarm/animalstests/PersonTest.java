package com.zipcodewilmington.froilansfarm.animalstests;

import com.zipcodewilmington.froilansfarm.Animal.persons.Farmer;
import com.zipcodewilmington.froilansfarm.Animal.persons.Person;
import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.edible.Egg;
import com.zipcodewilmington.froilansfarm.edible.Tomato;
import com.zipcodewilmington.froilansfarm.farm.Storage;
import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void testEatCorn(){
        Person farmer = new Farmer();
        Assert.assertFalse(farmer.eat(new Corn()));
        Storage.getCornStorage().add(new Corn());
        Assert.assertTrue(farmer.eat(new Corn()));
    }

    @Test
    public void testEatEgg(){
        Person farmer = new Farmer();
        Storage.getEggStorage().add(new Egg());
        Assert.assertTrue(farmer.eat(new Egg()));
    }

    @Test
    public void testEatTomato(){
        Person farmer = new Farmer();
        Storage.getTomatoStorage().add(new Tomato());
        Assert.assertTrue(farmer.eat(new Tomato()));
    }

}
