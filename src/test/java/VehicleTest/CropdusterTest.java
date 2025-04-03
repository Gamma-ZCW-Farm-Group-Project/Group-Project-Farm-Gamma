//package VehicleTest;
//
//import com.zipcodewilmington.froilansfarm.Field.*;
//import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Nested;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class CropdusterTest {
//    @Nested
//    class CropDusterTest {
//
//        private CropDuster cropDuster;
//        private Field field;
//
//
//        @BeforeEach
//        void setUp() {
//            cropDuster = new CropDuster();
//            field = new Field();
//
//            CropRow cornRow = new CropRow();
//            CropRow tomatoRow = new CropRow();
//
//
//            field.addCropRow(cornRow);
//            field.addCropRow(tomatoRow);
//        }
//
//        @Test
//        void testFertilize() {
//            try {
//                cropDuster.fertilize(field);
//                for (CropRow row : field.getCropRows()) {
//                    for (Crop crop : row.getCrops(new CornStalk())) {
//                        assertTrue(crop.hasBeenFertilized(), "Crop should be fertilized.");
//                    }
//                }
//            } catch (Exception e) {
//                fail("Fertilize method threw an exception: " + e.getMessage());
//            }
//        }
//
//    }
//}
