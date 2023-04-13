package com.zipcodewilmington.froilansfarm.animalstests;

import com.zipcodewilmington.froilansfarm.Animal.animals.Animal;
import com.zipcodewilmington.froilansfarm.Animal.animals.Eater;
import com.zipcodewilmington.froilansfarm.Animal.animals.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Animal.persons.AirLicenseRider;
import com.zipcodewilmington.froilansfarm.Animal.persons.Person;
import com.zipcodewilmington.froilansfarm.Animal.persons.Pilot;
import com.zipcodewilmington.froilansfarm.Animal.persons.Rider;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import org.junit.Assert;
import org.junit.Test;

public class PilotTest {

    @Test
    public void testMakeNoise(){
        String expected = "idk, im pilot?";
        String actual = new Pilot().makeNoise();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testMountFalse(){
        CropDuster cd = new CropDuster<>();
        cd.setMounted(true);
        Assert.assertFalse(new Pilot().mount(cd));
    }

    @Test
    public void testDismountTrue(){
        CropDuster cd = new CropDuster<>();
        Pilot p = new Pilot();
        p.mount(cd);
        Assert.assertTrue(p.disMount(cd));
    }

    @Test
    public void testDismountFalse(){
        Assert.assertFalse(new Pilot().disMount(new CropDuster()));
    }

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
