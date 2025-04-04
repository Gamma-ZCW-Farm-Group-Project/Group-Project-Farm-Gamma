package FieldTest;

import com.zipcodewilmington.froilansfarm.Field.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InTheFieldTest {
    private Field field;
    private CropRow cropRow;

    @BeforeEach
    public void setUp(){
        field=new Field();
        cropRow=new CropRow();
        cropRow.addCrop(new CornStalk(), true);
        cropRow.addCrop(new TomatoPlant(), false);
    }
    @Test
    public void testAddCropRows(){
        field.addCropRow(cropRow);//adds row to field
        assertEquals(cropRow,field.getCropRows().get(0));
    }
    @Test
    public void testGetCropRows(){
        field.addCropRow(cropRow);
        assertEquals(cropRow, field.getCropRows().get(0));
    }
    @Test
    public void testFieldInitialization() {
        assertNotNull(field.getCropRows());
        assertEquals(0,field.getCropRows().size());
    }
    @Test
    public void testGetCrops(){
        cropRow.addCrop(new CornStalk(),true);
        cropRow.addCrop(new TomatoPlant(),false);

        assertTrue(cropRow.getFertilizedState().get(0));
        assertFalse(cropRow.getFertilizedState().get(1));
    }

}
