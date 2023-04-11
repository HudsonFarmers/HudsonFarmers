package com.zipcodewilmington.froilansfarm.VehicleTest;

import com.zipcodewilmington.froilansfarm.Animal.animals.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Animal.persons.Pilot;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Vehicle.*;
import com.zipcodewilmington.froilansfarm.farm.Field;
import org.junit.Assert;
import org.junit.Test;

public class CropDusterTest {
    @Test
    public void testMakeNoise() {
        String expected = "whatever sounds a crop-duster makes";
        String actual = new CropDuster().makeNoise();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testOperateFalse() {
        CropDuster cd = new CropDuster<>();
        boolean status = cd.operate(new Field());
        Assert.assertFalse(status);
    }

    @Test
    public void testTractorConstructor() {
        CropDuster cropDuster = new CropDuster();
        Vehicle CropDuster = new CropDuster();

        Assert.assertTrue(cropDuster instanceof Rideable && CropDuster instanceof Vehicle);
    }

    @Test
    public void testInheritanceNoiseMaker() {
        CropDuster cropDuster = new CropDuster();

        Assert.assertTrue(cropDuster instanceof NoiseMaker);
    }

    @Test
    public void testInheritanceRideable() {
        CropDuster cropDuster = new CropDuster();

        Assert.assertTrue(cropDuster instanceof Rideable);
    }
    @Test
    public void testInheritanceFarmVehicle() {
        CropDuster cropDuster = new CropDuster();

        Assert.assertTrue(cropDuster instanceof FarmVehicle);
    }
    @Test
    public void testInheritanceAirCraft() {
        CropDuster cropDuster = new CropDuster();

        Assert.assertTrue(cropDuster instanceof AirCraft);
    }
}
