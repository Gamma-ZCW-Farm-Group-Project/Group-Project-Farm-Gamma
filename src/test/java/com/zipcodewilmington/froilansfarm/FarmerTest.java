package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Edibles.Corn;
import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.People.Farmer;

import static org.junit.jupiter.api.Assertions.*;
import com.zipcodewilmington.froilansfarm.People.Person;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import java.util.ArrayList;


public class FarmerTest {

    @Test
    public void testInhertiance(){
        Person froiland = (Person)(Object)new Farmer();

        assertTrue(froiland instanceof Person);
    }

    @Test
    public void testNoiseMakerImplementation(){
        NoiseMaker froiland = (NoiseMaker)(Object) new Farmer();

        assertTrue(froiland instanceof NoiseMaker);
    }

    @Test
    public void testEaterImplementation(){
        Eater froiland = (Eater)(Object)new Farmer();

        assertTrue(froiland instanceof Eater);
    }

    @Test
    public void testRiderImplementation(){
        Rider froiland = (Rider)(Object)new Farmer();

        assertTrue(froiland instanceof Rider);
    }

    @Test
    public void testBotanistImplementation(){
        Botanist froiland = (Botanist)(Object)new Farmer();

        assertTrue(froiland instanceof Botanist);
    }

    @Test
    public void testMakeNoise(){
        Farmer froiland = new Farmer();

        assertEquals("I'm a farmer", froiland.makeNoise());
    }

    @Test
    public void testMount(){
        Farmer froiland = new Farmer();
        boolean mounted = false;
        mounted = froiland.mount();
        assertTrue(mounted);
    }

    @Test
    public void testDismount(){
        Farmer froiland = new Farmer();
        boolean mounted = true;
        mounted = froiland.dismount();
        assertFalse(mounted);
    }

    @Test
    public void testEat(){
        Farmer froiland = new Farmer();
        ArrayList<Edible> farmerFood = new ArrayList<>();
        Edible edible = new Edible();
        farmerFood.add(edible);
        froiland.eat(farmerFood);
        assertEquals(farmerFood.get(0), null);
    }
}
