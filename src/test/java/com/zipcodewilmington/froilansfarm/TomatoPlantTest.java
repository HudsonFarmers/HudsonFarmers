package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
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
        t.harvest(tp);
        boolean hasBeenHarvested = tp.hasBeenHarvested();
        assertTrue(hasBeenHarvested);
    }

    @Test
   public void shouldReturnFalseHasBeenHarvested(){
        TomatoPlant tp = new TomatoPlant();
        boolean hasBeenHarvested = tp.hasBeenHarvested;
        assertFalse(hasBeenHarvested);
    }

    @Test
    public void testYieldsTomato() {
        Crop tomato = new TomatoPlant();
        result = tomato.yield();
        assert result instanceof Tomato();
    }


}
