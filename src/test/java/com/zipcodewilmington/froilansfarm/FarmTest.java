package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.farm.ChickenCoops;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.FarmHouse;
import com.zipcodewilmington.froilansfarm.farm.Stables;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class FarmTest {
    @Test
    public void testNullaryConstructor(){
        // Given
        Farm farm = new Farm();

        // When
        // Then
        Assert.assertNotNull(farm.getChickenCoops());
        Assert.assertNotNull(farm.getStables());
        Assert.assertNotNull(farm.getFarmhouse());
    }

    @Test
    public void testConstructor(){
        // Given
        ArrayList<ChickenCoops> chickenCoops = new ArrayList<ChickenCoops>();
        ArrayList<Stables> stables = new ArrayList<Stables>();
        FarmHouse farmHouse = new FarmHouse();
        Farm farm = new Farm(stables,chickenCoops,farmHouse);

        // When
        // Then
        Assert.assertEquals(chickenCoops,farm.getChickenCoops());
        Assert.assertEquals(stables,farm.getStables());
        Assert.assertEquals(farmHouse,farm.getFarmhouse());
    }

}
