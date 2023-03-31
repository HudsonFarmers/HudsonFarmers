package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Vehicle.Rideable;
import com.zipcodewilmington.froilansfarm.farm.Animal.Horse;
import org.junit.Assert;
import org.junit.Test;

public class HorseTest {
    Horse horse =new Horse();
    @Test
    public void testImplementation(){
        Assert.assertTrue(horse instanceof Animal);
    }

    @Test
    public void testInheritance(){
        Assert.assertTrue(horse instanceof Rideable);
    }

    @Test
    public void testMakeNoise() {
        String actual = horse.makeNoise();
        String expected = "NEIGH!";

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testRidingStatusMounted(){
        Farmer farmer = new Farmer();
        farmer.mount(horse);
        boolean actual = farmer.riderStatus();
        Assert.assertTrue(actual);
    }
    @Test
    public void testRidingStatusDismounted(){
        Farmer farmer = new Farmer();
        Horse horse= new Horse();
        farmer.mount(horse);
        farmer.dismount(horse);
        boolean actual = horse.getIsMounted();
        Assert.assertFalse(actual);
    }

}
