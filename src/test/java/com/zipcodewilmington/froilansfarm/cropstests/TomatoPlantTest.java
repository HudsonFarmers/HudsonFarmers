package com.zipcodewilmington.froilansfarm.cropstests;
import com.zipcodewilmington.froilansfarm.Animal.persons.Farmer;
import com.zipcodewilmington.froilansfarm.Animal.persons.Pilot;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import com.zipcodewilmington.froilansfarm.farm.Field;
import com.zipcodewilmington.froilansfarm.farm.Storage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TomatoPlantTest {
    CropDuster cropDuster;
    Tractor tractor;
    Farmer farmer;
    Pilot pilot;
    Field field;
    CropRow cropRow;


    @Before
    public void setUp(){
        field = new Field();
        cropRow = new CropRow();
        field.add(cropRow);

        pilot = new Pilot();
        farmer = new Farmer();
        cropDuster = new CropDuster();
        tractor = new Tractor<>();
    }


   @Test
    public  void shouldReturnTrueHasBeenFertilized(){
        // create crop and add in crop row
        Crop tomatoPlant = new TomatoPlant();
        cropRow.add(tomatoPlant);

        // crop should NOT be fertilized or harvested
        Assert.assertFalse(tomatoPlant.isFertilized());
        Assert.assertFalse(tomatoPlant.isHarvested());

        // pilot mounts the crop-duster
       pilot.mount(cropDuster);
       cropDuster.operate(field);
       Assert.assertTrue(tomatoPlant.isFertilized());
    }

    @Test
    public void shouldReturnTrueHasBeenHarvested(){
        // farmer plants 5 tomatoPlants in crop row
        cropRow.clear();
        farmer.plant(new TomatoPlant(), cropRow);
        Integer expected = Storage.getTomatoStorage().size() + 5;

        // fertilize the crops
        pilot.mount(cropDuster);
        cropDuster.operate(field);

        // harvest the crops =>  add 5 more corns in storage if harvested successfully
        farmer.mount(tractor);
        tractor.operate(field);
        Integer actual = Storage.getTomatoStorage().size();

        Assert.assertEquals(expected,actual);
    }
}
