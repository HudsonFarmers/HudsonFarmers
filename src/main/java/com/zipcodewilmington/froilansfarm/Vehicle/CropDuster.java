package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Animal.persons.AirLicenseRider;
import com.zipcodewilmington.froilansfarm.Animal.persons.Rider;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.farm.Field;

public class CropDuster<T extends AirLicenseRider> implements AirCraft<T>, FarmVehicle {
    private boolean isMounted;

    public CropDuster() {
        this.isMounted = false;
    }
    public boolean isMounted() {
        return isMounted;
    }

    public void setMounted(boolean mounted) {
        isMounted = mounted;
    }

    private boolean fly(Field field) {
        for(CropRow cr : field){
            fertilize(cr);
        }
        return false;
    }

    // not sure how operate and fly methods connecting so I guess
    // just have the cropDuster fly -> operate -> fertilize
    @Override
    public boolean operate(Field field) {
        // go thru the crop rows in field and fertilize all crops
        if(isMounted){
            fly(field);
            return true;
        }
        return false;
    }

    private void fertilize(CropRow cropRow){
        // go thru all crops in cropRow and fertilize them
        for(Crop c : cropRow){
                c.setFertilized(true);
        }
    }

    @Override
    public String makeNoise() {
        return "whatever sounds a crop-duster makes";
    }
}
