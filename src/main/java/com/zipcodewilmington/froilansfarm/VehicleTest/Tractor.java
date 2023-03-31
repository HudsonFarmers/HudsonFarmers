package com.zipcodewilmington.froilansfarm.VehicleTest;

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
    public ArrayList<Edible> harvest(CropRow cropRow){
        //check what passed in operate
        //for (int i = 0; i < croprow.length; i++){
        //      if (croprow[i].hasbeenfertilized == true)
        //          cropRow[i].setHarvested == true;
        //          cropRow[i].yield();
        //          cropRow.remove[i]
        //              yield(){}
        //                  Tomato tomato = new Tomato();
        //                  instance.put(tomato, getCount + 1);
        // }
        return null;
    }
}
