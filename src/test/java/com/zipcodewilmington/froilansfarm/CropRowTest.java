package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import org.junit.Test;

import static org.junit.Assert.*;

public class CropRowTest {

    @Test
    public void shouldReturnTrueHasBeenFertilized(){
        CropRow cropRow = new CropRow();
        boolean hasBeenFertilized = field.hasBeenFertilized();
        assertTrue(hasBeenFertilized);
    }

    @Test
    public void shouldReturnFalseHasBeenFertilized(){
        CropRow cropRow = new CropRow();
        boolean hasBeenFertilized = field.hasBeenFertilized();
        assertFalse(hasBeenFertilized);
    }


    @Test
    public void shouldReturnTrueHasBeenHarvested(){
        CropRow cropRow = new CropRow();
        boolean hasBeenHarvested = cropRow.hasBeenHarvested();
        assertTrue(hasBeenHarvested);
    }

    @Test
   public void shouldReturnFalseHasBeenHarvested(){
        CropRow cropRow = new CropRow();
       boolean hasBeenHarvested = cropRow.hasBeenHarvested();
        assertFalse(hasBeenHarvested);
    }
    @Test
    public void isArrayListEmpty(){
        CropRow cropRow = new CropRow();
        assertTrue(cropRow.isEmpty());
        Crop crop = new Crop();
        cropRow.add(crop);
        assertFalse(cropRow.isEmpty());
    }

    @Test
    public void testAddCropToCropRow() {
        CropRow cropRow = new CropRow();
       Crop tomato = new Tomato();
        cropRow.add(tomato);
        assertEquals(tomato, cropRow.get(0));
    }
    @Test
    public void testThereAreFiveCropRows() {
        CropRow cropRow = new CropRow();
        cropRow.add(new Crop());
        cropRow.add(new Crop());
        cropRow.add(new Crop());
        cropRow.add(new Crop());
        cropRow.add(new Crop());
        assertEquals(5, cropRow.size());
    }

    @Test
    public void testRemoveCropFromCropRow() {
        CropRow cropRow = new CropRow();
        Crop tomato = new Tomato();
        cropRow.add(tomato);
        assertEquals(tomato, cropRow.get(0));
    }

}
