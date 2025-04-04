package FieldTest;

import com.zipcodewilmington.froilansfarm.Field.TomatoPlant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TomatoPlantTest {
    private TomatoPlant tomatoPlant;

    @BeforeEach
    public void setUp(){
        tomatoPlant=new TomatoPlant();
    }

    @Test
    public void testFertilized(){
        tomatoPlant.fertilize();;

        assertTrue(tomatoPlant.isFertilized());
    }
    @Test
    public void testHasBeenFertilized(){
        assertFalse(tomatoPlant.hasBeenHarvested());//check if a tomato has been harvested before it actually is
        tomatoPlant.harvested();
        assertTrue(tomatoPlant.hasBeenHarvested());
    }
}
