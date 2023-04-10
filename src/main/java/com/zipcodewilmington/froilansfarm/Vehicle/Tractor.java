package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Animal.persons.Rider;
import com.zipcodewilmington.froilansfarm.farm.Field;

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
        return false;
    }
}
