package com.zipcodewilmington.froilansfarm.cropstests;

import com.zipcodewilmington.froilansfarm.Animal.persons.Farmer;
import com.zipcodewilmington.froilansfarm.Animal.persons.Pilot;
import com.zipcodewilmington.froilansfarm.Crop.CornStalk;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.edible.Edible;
import com.zipcodewilmington.froilansfarm.farm.Field;
import com.zipcodewilmington.froilansfarm.farm.Storage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CornstalkTest {
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
        farmer.plant(new CornStalk(),cropRow);

        // crop should NOT be fertilized or harvested
        for(Crop c : cropRow) {
            Assert.assertFalse(c.isFertilized());
            Assert.assertFalse(c.isHarvested());
        }

        // pilot mounts the crop-duster
        pilot.mount(cropDuster);
        cropDuster.operate(field);

        // all crops should be fertilized
        for(Crop c : cropRow){
            Assert.assertTrue(c.isFertilized());
        }

    }
//    @Test
//   public void shouldReturnFalseHasBeenFertilized(){
//        // create crop and add in crop row
//        cropRow.clear();
//        farmer.plant(new CornStalk(),cropRow);
//
//        // crop should NOT be fertilized or harvested
//        for(Crop c : cropRow) {
//            Assert.assertFalse(c.isFertilized());
//            Assert.assertFalse(c.isHarvested());
//        }
//    }
    @Test
  public void shouldReturnTrueHasBeenHarvested(){
        // farmer plants 5 cornstalks in crop row
        cropRow.clear();
        farmer.plant(new CornStalk(), cropRow);
        Integer expected = Storage.getCornStorage().size() + 5;

        // fertilize the crops
        pilot.mount(cropDuster);
        cropDuster.operate(field);

        // harvest the crops =>  add 5 more corns in storage if harvested successfully
        farmer.mount(tractor);
        tractor.operate(field);
        Integer actual = Storage.getCornStorage().size();

        Assert.assertEquals(expected,actual);
    }
}
