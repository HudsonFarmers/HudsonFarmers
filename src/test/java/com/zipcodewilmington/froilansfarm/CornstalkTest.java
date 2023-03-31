package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crop.CornStalk;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.VehicleTest.CropDuster;
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
        boolean hasBeenFertilized = cornstalk.hasBeenFertilized();
        assertTrue(hasBeenFertilized);
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
        tractor.harvest(cornstalk);
        boolean hasBeenHarvested = cornstalk.hasBeenHarvested();
         assertTrue(hasBeenHarvested);
    }

    @Test
   public void shouldReturnFalseHasBeenHarvested(){
        CornStalk cornstalk = new CornStalk();
        boolean hasBeenHarvested = cornstalk.hasBeenHarvested();
        assertFalse(hasBeenHarvested);
    }

    @Test
    public void testYieldsCorn() {
        // CornStalk is a Crop which can yield a EarCorn
        Crop corn = new CornStalk();
        Corn result = corn.yield();
        assert result instanceof Corn();
    }

}
