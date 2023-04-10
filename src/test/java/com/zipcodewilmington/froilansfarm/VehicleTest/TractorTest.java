package com.zipcodewilmington.froilansfarm.VehicleTest;
import com.zipcodewilmington.froilansfarm.Animal.animals.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Animal.persons.Farmer;
import com.zipcodewilmington.froilansfarm.Animal.persons.Pilot;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Vehicle.*;
import com.zipcodewilmington.froilansfarm.edible.Tomato;
import com.zipcodewilmington.froilansfarm.farm.Field;
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
    public void testTractorHarvest() {
        Farmer<Tractor> farmer = new Farmer();
        Tractor tractor = new Tractor();

        Pilot pilot = new Pilot();
        CropDuster cropDuster = new CropDuster();
//
//        CropRow cropRow = new CropRow();
//        TomatoPlant tomatoPlant = new TomatoPlant();
//
//        cropRow.add(tomatoPlant);
//        pilot.mount(cropDuster);
//        cropDuster.fly(cropRow);
//        farmer.mount(tractor);
//        tractor.operate(cropRow);
//
//        Assert.assertTrue(foodStorage.contains(tomatoPlant));
    }

    @Test
    public void testOperate() {
//        Tractor tractor = new Tractor();
//        Pilot pilot = new Pilot();
//        CropDuster cropDuster = new CropDuster();
//        CropRow cropRow = new CropRow();
//
//        Field field = new Field();
//        field.add(cropRow);
//
//        cropRow.add(new TomatoPlant());
//        pilot.mount(cropDuster);
//        cropDuster.fly(field);
//
//        tractor.operate(cropRow);
//        String expected = "Chugga Chugga";
//        Assert.assertTrue((cropRow.canBeHarvested() == true) && (expected == tractor.makeNoise()));
    }
}
