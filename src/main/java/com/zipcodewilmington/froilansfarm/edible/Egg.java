package com.zipcodewilmington.froilansfarm.edible;

public class Egg extends Edible{
    private boolean isFertilized;
    public Egg() {
        this.isFertilized = false;
    }
    public void setIsFertilized(boolean fertilized) {
        isFertilized = fertilized;
    }
    public boolean isFertilized() {
        return isFertilized;
    }




}
