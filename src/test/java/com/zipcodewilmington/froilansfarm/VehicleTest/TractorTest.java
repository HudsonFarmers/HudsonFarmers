package com.zipcodewilmington.froilansfarm.VehicleTest;

import com.zipcodewilmington.froilansfarm.Animal.animals.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Animal.persons.Farmer;
import com.zipcodewilmington.froilansfarm.Animal.persons.Pilot;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Vehicle.*;
import com.zipcodewilmington.froilansfarm.farm.Field;
import com.zipcodewilmington.froilansfarm.farm.Storage;
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
    public void testMounted() {
        Farmer<Tractor> farmer = new Farmer();
        Tractor tractor = new Tractor();
        farmer.mount(tractor);

        Assert.assertTrue(tractor.isMounted());
    }
    @Test
    public void testDismount() {
        Farmer<Tractor> farmer = new Farmer();
        Tractor tractor = new Tractor();
    }
    @Test
    public void testMakeNoise() {
        Farmer<Tractor> farmer = new Farmer();
        Tractor tractor = new Tractor();

        farmer.mount(tractor);
        String expected = "Vroom";

        Assert.assertEquals(expected, tractor.makeNoise());
    }

    @Test
    public void testTractorOperate() {
        Farmer<Tractor> farmer = new Farmer();
        Tractor tractor = new Tractor();

        Pilot pilot = new Pilot();
        CropDuster cropDuster = new CropDuster();

        CropRow cropRow = new CropRow();
        TomatoPlant tomatoPlant = new TomatoPlant();
        Field field = new Field();
        farmer.plant(tomatoPlant, cropRow);
        field.add(cropRow);

        cropRow.add(tomatoPlant);
        pilot.mount(cropDuster);
        cropDuster.operate(field);
        farmer.mount(tractor);
        tractor.operate(field);
        int expected = 6;

        Assert.assertEquals(expected, Storage.getTomatoStorage().size());
    }

}

