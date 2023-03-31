package com.zipcodewilmington.froilansfarm.edible;

public abstract class Edible {
    private boolean isFertilized;
    public void setIsFertilized(boolean fertilized) {
        isFertilized = fertilized;
    }
    public boolean isFertilized() {
        return isFertilized;
    }
}
