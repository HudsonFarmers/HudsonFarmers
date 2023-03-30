package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.farm.Field;
import org.junit.Test;

import static org.junit.Assert.*;

public class FieldTest {

    @Test
   public void shouldReturnTrueHasBeenHarvested(){
        Field field = new Field();
        boolean hasBeenHarvested = field.hasBeenHarvested();
      assertTrue(hasBeenHarvested);
    }

    @Test
   public void shouldReturnFalseHasBeenHarvested(){ Field field = new Field();
       boolean hasBeenHarvested = field.hasBeenHarvested;
        assertFalse(hasBeenHarvested);
            }


   @Test
    public void shouldReturnTrueHasBeenFertilized(){
        Field field = new Field();
       boolean hasBeenFertilized = field.hasBeenFertilized();
        assertTrue(hasBeenFertilized);
    }

    @Test
    public void shouldReturnFalseHasBeenFertilized(){
      Field field = new Field();
        boolean hasBeenFertilized = field.hasBeenFertilized();
        assertFalse(hasBeenFertilized);
    }
    @Test
   public void isArrayListEmpty(){
        Field field = new Field();
        assertTrue(field.isEmpty());
        CropRow cropRow = new CropRow();
        field.add(cropRow);
        assertFalse(field.isEmpty());
    }




}
