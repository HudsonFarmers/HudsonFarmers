package com.zipcodewilmington.froilansfarm.animalstests;

import com.zipcodewilmington.froilansfarm.Animal.animals.Animal;
import com.zipcodewilmington.froilansfarm.Animal.persons.Farmer;
import com.zipcodewilmington.froilansfarm.Vehicle.Rideable;
import com.zipcodewilmington.froilansfarm.Animal.animals.Horse;
import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.farm.Storage;
import org.junit.Assert;
import org.junit.Test;

public class HorseTest {
    @Test
    public void testImplementation(){
        Horse horse = new Horse();
        Assert.assertTrue(horse instanceof Animal);
    }

    @Test
    public void testInheritance(){
        Horse horse = new Horse();
        Assert.assertTrue(horse instanceof Rideable);
    }

    @Test
    public void testMakeNoise() {
        Horse horse =new Horse();
        String actual = horse.makeNoise();
        String expected = "NEIGH!";

        Assert.assertEquals(actual,expected);
    }
    // Farmer needs to have the <Horse> or <Horse>
    @Test
    public void testRidingStatusMounted(){
        Horse horse =new Horse();
        Farmer<Horse> farmer = new Farmer();
        boolean expectedFarmerMounted = farmer.mount(horse);
        boolean expectedHorseIsMounted = horse.isMounted();

        // horse has NOT been mounted, so return true to show that farmer successully mounted the horse
        Assert.assertTrue(expectedFarmerMounted);

        // check horse status if it has been mounted by the farmer
        Assert.assertTrue(expectedHorseIsMounted);
    }

    @Test
    public void testRidingStatusMounted2(){
        Horse horse =new Horse();
        Farmer<Horse> farmer = new Farmer();
        Farmer<Horse> farmer2 = new Farmer();

        farmer.mount(horse);
        boolean expectedFarmerMounted = farmer2.mount(horse);
        boolean expectedHorseIsMounted = horse.isMounted();

        // horse HAS BEEN mounted, so return true to show that farmer successully mounted the horse
        Assert.assertFalse(expectedFarmerMounted);

        // check horse status if it has been mounted by the farmer
        Assert.assertTrue(expectedHorseIsMounted);
    }
    @Test
    public void testRidingStatusDismounted(){
        Farmer farmer = new Farmer();
        Horse horse= new Horse();

        // check if horse been mounted by farmer
        farmer.mount(horse);
        Assert.assertTrue(horse.isMounted());

        // check if horse been dismounted by farmer
        farmer.disMount(horse);
        Assert.assertFalse(horse.isMounted());
    }

    @Test
    public void testEat(){
        Storage.getCornStorage().clear();
        Storage.getCornStorage().add(new Corn());
        Integer expected = 0;
        Horse horse= new Horse();

        horse.eat(new Corn());
        Integer actual = Storage.getCornStorage().size();
        Assert.assertEquals(expected,actual);
    }

}
