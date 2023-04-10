package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Animal.persons.Rider;

public interface Rideable<T extends Rider> {
    boolean isMounted();

    void setMounted(boolean mounted);

}
