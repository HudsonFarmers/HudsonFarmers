package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.VehicleTest.CropDuster;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import com.zipcodewilmington.froilansfarm.edible.Edible;
import com.zipcodewilmington.froilansfarm.edible.Tomato;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TomatoPlantTest {

   @Test
    public  void shouldReturnTrueHasBeenFertilized(){
        // Tractor is a FarmVehicle which can harvest a Crop
        // CropDuster is a FarmVehicle and Aircraft which can fertilize a CropRow
       Crop tp = new TomatoPlant();
        CropRow cr = new CropRow();
        cr.add(tp);
       CropDuster cd = new CropDuster();
        cd.fertilize(cr);
        boolean hasBeenFertilized = tp.hasBeenFertilized();
        assertTrue(hasBeenFertilized);
    }

    @Test
    public void shouldReturnFalseHasBeenFertilized(){
       TomatoPlant tp = new TomatoPlant();
        boolean hasBeenFertilized = tp.hasBeenFertilized();
        assertFalse(hasBeenFertilized);
    }


    @Test
   public void shouldReturnTrueHasBeenHarvested(){
        TomatoPlant tp = new TomatoPlant();
        Tractor t = new Tractor();
//        t.harvest(tp);
//        boolean hasBeenHarvested = tp.hasBeenHarvested();
//        assertTrue(hasBeenHarvested);
    }

    @Test
   public void shouldReturnFalseHasBeenHarvested(){
        TomatoPlant tp = new TomatoPlant();
//        boolean hasBeenHarvested = tp.hasBeenHarvested;
//        assertFalse(hasBeenHarvested);
    }

    @Test
    public void testYieldsTomato() {
        Crop tomato = new TomatoPlant();
        Edible result = tomato.yield();
        Assert.assertTrue(result instanceof Tomato);
    }


}
