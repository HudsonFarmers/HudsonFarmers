package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.edible.Edible;
import org.junit.Assert;
import org.junit.Test;

public class CornTest {
    @Test
    public void testInheritanceOfEdible(){
        Corn corn = new Corn();

        Assert.assertTrue(corn instanceof Edible);
    }

}
