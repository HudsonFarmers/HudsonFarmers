package com.zipcodewilmington.froilansfarm.personstests;

import com.zipcodewilmington.froilansfarm.farm.Animal.Horse;
import org.junit.Test;

public class FarmerTest {
    /*
    Farmer (class)
 extends Person
implements botanist, Rider<Tractor>
     */
    @Test
    public void testInstanceOfPerson(){
        Farmer farmer = new Farmer();

        //Assert.assertTrue(farmer instanceof Person);
    }

    @Test
    public void testInstanceOfNoiseMaker(){
        Farmer farmer = new Farmer();
        //Assert.assertTrue(farmer instanceof NoiseMaker);
    }

    @Test
    public void testInstanceOfAnimal(){
        Farmer farmer = new Farmer();
        //Assert.assertTrue(farmer instanceof Animal);
    }

    @Test
    public void testInstanceOfBotanist(){
        Farmer farmer = new Farmer();
        //Assert.assertTrue(farmer instanceof Botanist);
    }

    @Test
    public void testInstanceOfEater(){
        Farmer farmer = new Farmer();
        //Assert.assertTrue(farmer instanceof Eater);
    }

    @Test
    public void testInstanceOfRider(){
        Farmer farmer = new Farmer();
        //Assert.assertTrue(farmer instanceof Rider<Tractor>);
    }
}
