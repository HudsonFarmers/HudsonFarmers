package com.zipcodewilmington.froilansfarm.Animal.animals;

import com.zipcodewilmington.froilansfarm.Animal.persons.Rider;
import com.zipcodewilmington.froilansfarm.Vehicle.FarmRides;
import com.zipcodewilmington.froilansfarm.Vehicle.Rideable;
import com.zipcodewilmington.froilansfarm.edible.Edible;
import com.zipcodewilmington.froilansfarm.farm.Storage;

public class Horse<Corn extends Edible,T extends Rider> implements FarmRides<T>, Animal<Corn> {
    private boolean isMounted;

    public Horse (){
        isMounted = false;
    }

    @Override
    public String makeNoise(){
        return "NEIGH!";
    }

    @Override
    public boolean eat(Corn food) {
        if(Storage.getCornStorage().size()>0){
            Storage.getCornStorage().remove(0);
            return true;
        }
        return false;
    }

    @Override
    public boolean isMounted() {
        return isMounted;
    }

    @Override
    public void setMounted(boolean mounted) {
        this.isMounted = mounted;
    }

}
