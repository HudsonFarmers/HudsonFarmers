package com.zipcodewilmington.froilansfarm.edible;

public class Egg extends Edible{
    public void setIsFertilized(boolean fertilized) {
        isFertilized = fertilized;
    }
    public boolean isFertilized() {
        return isFertilized;
    }



    private boolean isFertilized;
}
