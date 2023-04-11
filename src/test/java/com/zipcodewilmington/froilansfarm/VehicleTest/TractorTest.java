package com.zipcodewilmington.froilansfarm.VehicleTest;
import com.zipcodewilmington.froilansfarm.Animal.animals.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Animal.persons.Farmer;
import com.zipcodewilmington.froilansfarm.Vehicle.*;
import org.junit.Assert;
import org.junit.Test;

public class TractorTest {
    @Test
    public void testTractorConstructor() {
        Tractor<Farmer> tractor = new Tractor<>();

        Assert.assertTrue(tractor instanceof Tractor);
        Assert.assertTrue(tractor instanceof Vehicle);
    }

    @Test
    public void testInheritanceNoiseMaker() {
        Tractor tractor = new Tractor();

        Assert.assertTrue(tractor instanceof NoiseMaker);
    }

    @Test
    public void testInheritanceRideable() {
        Tractor tractor = new Tractor();

        Assert.assertTrue(tractor instanceof Rideable);
    }
    @Test
    public void testInheritanceFarmVehicle() {
        Tractor tractor = new Tractor();

        Assert.assertTrue(tractor instanceof FarmVehicle);
    }

    @Test
    public void testMakeNoise() {
        String expected = "Vroom";
        String actual = new Tractor().makeNoise();
        Assert.assertEquals(expected,actual);
    }


}
