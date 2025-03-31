package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Person;
import com.zipcodewilmington.froilansfarm.People.Pilot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PilotTest {

    @Test
    public void testInhertiance(){
        Person froilanda = (Person)(Object)new Farmer();

        assertTrue(froilanda instanceof Person);
    }

    @Test
    public void testNoiseMakerImplementation(){
        NoiseMaker froilanda = (NoiseMaker)(Object) new Pilot();

        assertTrue(froilanda instanceof NoiseMaker);
    }

    @Test
    public void testEaterImplementation(){
        Eater froilanda = (Eater)(Object)new Pilot();

        assertTrue(froilanda instanceof Eater);
    }

    @Test
    public void testRiderImplementation(){
        Rider froilanda = (Rider)(Object)new Pilot();

        assertTrue(froilanda instanceof Rider);
    }

    @Test
    public void testMakeNoise(){
        Pilot froilanda = new Pilot();

        assertEquals("I'm a pilot", froilanda.makeNoise());
    }

    @Test
    public void testMount(){
        Farmer froilanda = new Farmer();
        boolean mounted = false;
        mounted = froilanda.mount();
        assertTrue(mounted);
    }

    @Test
    public void testDismount(){
        Farmer froilanda = new Farmer();
        boolean mounted = true;
        mounted = froilanda.dismount();
        assertFalse(mounted);
    }

}
