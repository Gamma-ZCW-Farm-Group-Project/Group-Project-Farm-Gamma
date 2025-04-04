package FieldTest;

import com.zipcodewilmington.froilansfarm.Field.CornStalk;
import com.zipcodewilmington.froilansfarm.Field.CropRow;
import com.zipcodewilmington.froilansfarm.Field.TomatoPlant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CropRowTest {
    private CropRow cropRow;

    @BeforeEach
    public void setUp(){
        cropRow=new CropRow();
    }
    @Test
    public void testAddCrop(){
        CornStalk cornStalk = new CornStalk();
        cropRow.addCrop(cornStalk,true);

        assertEquals(1,cropRow.getCrops().size());
        assertTrue(cropRow.getFertilizedState().get(0));
    }
    @Test
    public void testGetCrop(){
        CornStalk cornStalk=new CornStalk();
        TomatoPlant tomatoPlant= new TomatoPlant();

        cropRow.addCrop(cornStalk,true);
        cropRow.addCrop(tomatoPlant,false);

        assertEquals(2,cropRow.getCrops().size());//allows two crops in the row
        assertEquals(cornStalk,cropRow.getCrops().get(0));//first is corn
        assertEquals(tomatoPlant,cropRow.getCrops().get(1));//second is tomato
    }
    @Test
    public void testGetFertilizedState(){
        CornStalk cornStalk=new CornStalk();
        TomatoPlant tomatoPlant= new TomatoPlant();

        cropRow.addCrop(cornStalk,true);
        cropRow.addCrop(tomatoPlant,false);

        assertTrue(cropRow.getFertilizedState().get(0));//corn in row should be fertilized
        assertFalse(cropRow.getFertilizedState().get(1));//tomato should not be
    }
    @Test
    public void testEmptyRow(){
        //checking for empty rows
        assertTrue(cropRow.getCrops().isEmpty());
        assertTrue(cropRow.getFertilizedState().isEmpty());
    }
}
