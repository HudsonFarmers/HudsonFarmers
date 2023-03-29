package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.farm.FarmHouse;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class FarmHouseTest {
    @Test
    public void testInheritanceOfArrayList(){
        // Given
        FarmHouse cc = new FarmHouse();

        Assert.assertTrue(cc instanceof ArrayList<Chicken>);
    }
}
