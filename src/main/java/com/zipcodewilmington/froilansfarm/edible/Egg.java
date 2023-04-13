package com.zipcodewilmington.froilansfarm.edible;

public class Egg extends Edible{
    private boolean isFertilized;
    private boolean isEdible;
    public Egg(){
        isFertilized = false;
        isEdible = true;
    }
    public void setIsFertilized(boolean fertilized) {
        isFertilized = fertilized;
        if(fertilized){
            isEdible = false;
        }
    }
    public boolean isFertilized() {
        return isFertilized;
    }

    public boolean isEdible() {
        if(isFertilized()){
            return false;
        }
        return true;
    }
}
