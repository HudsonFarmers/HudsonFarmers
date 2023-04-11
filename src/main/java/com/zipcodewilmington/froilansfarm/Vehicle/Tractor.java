package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Animal.persons.Rider;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.farm.Field;

import java.util.ArrayList;

public class Tractor<T extends Rider> implements FarmVehicle<T>, FarmRides<T> {
    private boolean isMounted;

    public Tractor() {
        this.isMounted = false;
    }

    public boolean isMounted() {
        return isMounted;
    }

    public void setMounted(boolean mounted) {
        isMounted = mounted;
    }
    public String makeNoise() {
        return "Vroom";
    }

    @Override
    public boolean operate(Field field) {
        for(CropRow cr : field){
            harvest(cr);
        }
        return true;
    }

    private void harvest(CropRow cropRow){
        ArrayList<Crop> toBeRemove = new ArrayList<>();
        for(Crop cr : cropRow){
            if(cr.isFertilized()){
                cr.yield();
                toBeRemove.add(cr);
            }
        }
        cropRow.removeAll(toBeRemove);
    }
}
