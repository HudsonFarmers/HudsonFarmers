package com.zipcodewilmington.froilansfarm.Animal.persons;

import com.zipcodewilmington.froilansfarm.Animal.animals.Animal;
import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.edible.Edible;
import com.zipcodewilmington.froilansfarm.edible.Egg;
import com.zipcodewilmington.froilansfarm.edible.Tomato;
import com.zipcodewilmington.froilansfarm.farm.Storage;

public abstract class Person implements Animal {
    @Override
    public boolean eat(Edible food) {
        if(food instanceof Corn){
            if(Storage.getCornStorage().size()>0){
                Storage.getCornStorage().remove(0);
                return true;
            }
            return false;
        } else if(food instanceof Tomato){
            if(Storage.getTomatoStorage().size()>0){
                Storage.getTomatoStorage().remove(0);
                return true;
            }
            return false;
        } else {
            if(Storage.getEggStorage().size()>0){
                for(Egg egg : Storage.getEggStorage()){
                    if(egg.isEdible()){
                        Storage.getEggStorage().remove(egg);
                        return true;
                    }
                }
            }
            return false;
        }
    }
}

