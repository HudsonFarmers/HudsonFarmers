package com.zipcodewilmington.froilansfarm.VehicleTest;

import com.zipcodewilmington.froilansfarm.Animal.animals.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Animal.persons.Pilot;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Vehicle.*;
import org.junit.Assert;
import org.junit.Test;

public class CropDusterTest {
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

    @Test
    public void testFly() {
        Pilot pilot = new Pilot();
        CropDuster cropDuster = new CropDuster();
        CropRow cropRow = new CropRow();
//        cropRow.add(tomato);
//
//        pilot.mount(cropDuster);
//        cropDuster.fly(cropRow);
//
//        Assert.assertTrue(cropRow[0].hasBeenFertilized);
    }

    @Test
    public void testOperate() {
//        Pilot pilot = new Pilot();
//        CropDuster cropDuster = new CropDuster();
//
//        cropRow.add(tomato);
//        pilot.mount(cropDuster);
//        cropDuster.fly(cropRow);
//
//        tractor.operate(cropRow);
//        String expected = "Chugga Chugga";
//        Assert.assertTrue((crowRow.canBeHarvested() == true) && (expected == tractor.makeNoise()));
    }
}
