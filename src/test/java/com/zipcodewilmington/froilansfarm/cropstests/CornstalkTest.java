package com.zipcodewilmington.froilansfarm.cropstests;

import com.zipcodewilmington.froilansfarm.Crop.CornStalk;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.edible.Edible;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CornstalkTest {
    @Test
  public  void shouldReturnTrueHasBeenFertilized(){
        // Tractor is a FarmVehicle which can harvest a Crop
        // CropDuster is a FarmVehicle and Aircraft which can fertilize a CropRow
        CornStalk cornstalk = new CornStalk();
        CropRow cr = new CropRow();
        cr.add(cornstalk);
        CropDuster cd = new CropDuster();
        cd.fertilize(cr);
        boolean hasBeenFertilized = cornstalk.isFertilized();
        Assert.assertTrue(hasBeenFertilized);
    }

    @Test
   public void shouldReturnFalseHasBeenFertilized(){
        CornStalk cornstalk = new CornStalk();
       boolean hasBeenFertilized = cornstalk.hasBeenFertilized();
        assertFalse(hasBeenFertilized);
    }


    @Test
  public void shouldReturnTrueHasBeenHarvested(){
        CornStalk cornstalk = new CornStalk();
        Tractor tractor = new Tractor();
//        tractor.harvest(cornstalk);
//        boolean hasBeenHarvested = cornstalk.hasBeenHarvested();
//         assertTrue(hasBeenHarvested);
        // maybe checkback on what being passed to the harvest method
        // could be Field, CropRow, Crop => change this accordingly then
    }

    @Test
   public void shouldReturnFalseHasBeenHarvested(){
        CornStalk cornstalk = new CornStalk();
//        boolean hasBeenHarvested = cornstalk.hasBeenHarvested();
//        assertFalse(hasBeenHarvested);
        // maybe checkback on what being passed to the harvest method
        // could be Field, CropRow, Crop => change this accordingly then
    }

    @Test
    public void testYieldsCorn() {
        // CornStalk is a Crop which can yield a EarCorn
        Crop corn = new CornStalk();
        Edible result = corn.yield();
        Assert.assertTrue(result instanceof Corn);
    }

}
