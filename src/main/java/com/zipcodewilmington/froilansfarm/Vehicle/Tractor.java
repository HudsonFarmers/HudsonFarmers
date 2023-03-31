package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.edible.Edible;
import com.zipcodewilmington.froilansfarm.farm.CropRow;

import java.util.ArrayList;

public class Tractor implements Vehicle, FarmVehicle {
    boolean isMounted;
    public Tractor() {
        this.isMounted = false;
    }
    public String makeNoise() {
        return "Vroom";
    }

    public void setMounted(boolean mounted) {
        isMounted = mounted;
    }

    public boolean isMounted() {
        return isMounted;
    }
    public boolean operate(CropRow cropRow){
        //pass in field<croprows<crops>>
        //if (mounted) {
        // } harvest(this.cropRow);
        System.out.println("Need rider to operate!");
        return false;
    }
    public CropRow harvest(CropRow cropRow){
            for (Crop crop : cropRow) {
                if (crop.isFertilized()) {
                    crop.setHarvested(true);
                    crop.yield();
                }
            }
            cropRow.clear();
            return cropRow;
    }
}
