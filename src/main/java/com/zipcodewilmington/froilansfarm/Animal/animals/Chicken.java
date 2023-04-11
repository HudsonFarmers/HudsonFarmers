package com.zipcodewilmington.froilansfarm.Animal.animals;

import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.edible.Edible;
import com.zipcodewilmington.froilansfarm.edible.Egg;
import com.zipcodewilmington.froilansfarm.edible.Produce;
import com.zipcodewilmington.froilansfarm.farm.Storage;

public class Chicken<T extends Edible, E extends Edible> implements Animal<T>, Produce<E> {
// T is Corn, E is egg // chicken eats corn and produces egg

    @Override
    public String makeNoise() {
        return "bak bak";
    }

    @Override
    public Egg yield() {
        Egg egg = new Egg();
        Storage.getEggStorage().add(egg);
        return egg;
    }

    @Override
    public boolean eat(Edible food) {
        if(Storage.getCornStorage().size()>0){
            Storage.getCornStorage().remove(0);
            return true;
        }
        return false;
    }
}
