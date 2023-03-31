package com.zipcodewilmington.froilansfarm.VehicleTest;

import com.zipcodewilmington.froilansfarm.farm.CropRow;

public class CropDuster implements Vehicle, AirCraft {
    boolean isMounted;

    public CropDuster() {
        this.isMounted = false;
    }

    public boolean isMounted() {
        return isMounted;
    }

    public void setMounted(boolean mounted) {
        isMounted = mounted;
    }

    @Override
    public String makeNoise() {
        return "BlupBlup";
    }

    public void fly(CropRow cropRow) {
        for (int i = 0; i < cropRow.size(); i++) {
            if (!cropRow.get(i).isFertilized()) {

            }
        }
    }
}
