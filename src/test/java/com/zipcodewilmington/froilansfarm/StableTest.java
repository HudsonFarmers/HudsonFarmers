package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StableTest {
    @Test
    public void testInheritanceOfArrayList(){
        // Given
        Stable cc = new Stable();

        Assert.assertTrue(cc instanceof ArrayList<Horse>);
    }
}
