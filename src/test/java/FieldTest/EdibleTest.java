package FieldTest;

import com.zipcodewilmington.froilansfarm.Edibles.Egg;
import com.zipcodewilmington.froilansfarm.Field.CornStalk;
import com.zipcodewilmington.froilansfarm.Field.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Field.Crop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EdibleTest {
    private TomatoPlant tomato;
    private CornStalk corn;
    private Egg egg;


    @BeforeEach
    void setUp() {
        tomato = new TomatoPlant();
        corn = new CornStalk();
    }

    @Test
    void testTomatoInitialState() {
        assertFalse(tomato.hasBeenFertilized());
        assertFalse(tomato.hasBeenHarvested());
    }

    @Test
    void testCornInitialState() {
        assertFalse(corn.hasBeenFertilized());
        assertFalse(corn.hasBeenHarvested());
    }

    @Test
    void testTomatoFertilize() {
        tomato.fertilize();
        assertTrue(tomato.hasBeenFertilized());
    }

    @Test
    void testCornFertilize() {
        corn.fertilize();
        assertTrue(corn.hasBeenFertilized());
    }

    @Test
    void testTomatoHarvestBeforeFertilize() {
        assertFalse(tomato.yield());
    }



    @Test
    void testTomatoYieldAfterFertilization() {
        tomato.fertilize();
        assertTrue(tomato.yield());
        assertTrue(tomato.hasBeenHarvested());
    }

    @Test
    void testCornYieldAfterFertilization() {
        corn.fertilize();
        assertTrue(corn.yield());
        assertTrue(corn.hasBeenHarvested());
    }
    @Test
    void testEggEdibility() {
        assertTrue(egg.isEdible());
        egg.fertilized();
        assertFalse(egg.isEdible());
    }
}
