package com.zipcodewilmington.froilansfarm.animalstests;

import com.zipcodewilmington.froilansfarm.Animal.animals.Animal;
import com.zipcodewilmington.froilansfarm.Animal.animals.Eater;
import com.zipcodewilmington.froilansfarm.Animal.animals.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Animal.persons.AirLicenseRider;
import com.zipcodewilmington.froilansfarm.Animal.persons.Person;
import com.zipcodewilmington.froilansfarm.Animal.persons.Pilot;
import com.zipcodewilmington.froilansfarm.Animal.persons.Rider;
import org.junit.Assert;
import org.junit.Test;

public class PilotTest {
    @Test
    public void testInstanceOfPerson(){
        Pilot pilot = new Pilot();
        Assert.assertTrue(pilot instanceof Person);
    }

    @Test
    public void testInstanceOfNoiseMaker(){
        Pilot pilot = new Pilot();
        Assert.assertTrue(pilot instanceof NoiseMaker);
    }

    @Test
    public void testInstanceOfAnimal(){
        Pilot pilot = new Pilot();
        Assert.assertTrue(pilot instanceof Animal);
    }

    @Test
    public void testInstanceOfAirLicenseRider(){
        Pilot pilot = new Pilot();
        Assert.assertTrue(pilot instanceof AirLicenseRider);
    }

    @Test
    public void testInstanceOfEater(){
        Pilot pilot = new Pilot();
        Assert.assertTrue(pilot instanceof Eater);
    }

    @Test
    public void testInstanceOfRider(){
        Pilot pilot = new Pilot();
        Assert.assertTrue(pilot instanceof Rider);
    }
}