package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TractorTest {
    @Test
    public void testTractorConstructor() {
        Tractor tractor = new Tractor();
        Vehicle Tractor = new Tractor();

        Assert.assertTrue(tractor instanceof Tractor && Tractor instanceof Vehicle);
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
    public void testTractorHarvest() {
        Tractor tractor = new Tractor();
        Pilot pilot = new Pilot();
        CropDuster cropDuster = new CropDuster();

        cropRow.add(tomato);
        pilot.mount(cropDuster);
        cropDuster.fly(cropRow);
        tractor.harvest(cropRow);

        Assert.assertTrue(instance.contains(tomato));
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
        Assert.assertTrue(canBeHarvested == true && expected == tractor.makeNoise());
    }
}
