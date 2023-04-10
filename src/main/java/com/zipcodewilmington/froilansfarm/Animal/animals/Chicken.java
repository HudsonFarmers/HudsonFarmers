package com.zipcodewilmington.froilansfarm.Animal.animals;

import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.edible.Edible;
import com.zipcodewilmington.froilansfarm.edible.Egg;
import com.zipcodewilmington.froilansfarm.edible.Produce;
import com.zipcodewilmington.froilansfarm.farm.Storage;

public class Chicken<T extends Edible, E extends Edible> implements Animal<T>, Produce<E> {
// T is Corn, E is egg // chicken eats corn and produce egg

    @Override
    public String makeNoise() {
        return "bak bak";
    }


    @Override
    public void eat(Edible food) {
        Storage.getCornStorage().remove(food);
    }

    @Override
    public Egg yield() {
        return new Egg();
    }
}
