package com.zipcodewilmington.froilansfarm.VehicleTest;

import com.zipcodewilmington.froilansfarm.Animal.Farmer;
import com.zipcodewilmington.froilansfarm.Animal.Pilot;
import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.edible.Tomato;
import com.zipcodewilmington.froilansfarm.farm.Crop;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.farm.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Animal.persons.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicle.*;
import org.junit.Assert;
import org.junit.Test;

public class TractorTest {
    @Test
    public void testTractorConstructor() {
        Tractor tractor = new Tractor();

        Assert.assertTrue(tractor instanceof Tractor && tractor instanceof Vehicle);
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
    public void testTractorHarvest() {
        Farmer farmer = new Farmer();
        Tractor tractor = new Tractor();
        Pilot pilot = new Pilot();
        CropDuster cropDuster = new CropDuster();
        CropRow cropRow = new CropRow();
        TomatoPlant tomatoPlant = new TomatoPlant();

        cropRow.add(tomatoPlant);
        pilot.mount(cropDuster);
        cropDuster.fly(cropRow);
        farmer.mount(tractor);
        tractor.operate(cropRow);

        Assert.assertTrue(foodStorage.contains(tomatoPlant));
    }

    @Test
    public void testOperate() {
        Tractor tractor = new Tractor();
        Pilot pilot = new Pilot();
        CropDuster cropDuster = new CropDuster();

        cropRow.add(tomato);
        pilot.mount(cropDuster);
        cropDuster.fly(cropRow);

        tractor.operate(cropRow);
        String expected = "Chugga Chugga";
        Assert.assertTrue((crowRow.canBeHarvested() == true) && (expected == tractor.makeNoise()));
    }
}
