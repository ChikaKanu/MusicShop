import MusicShop.Parts.DrumStick;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumStick drumStick;

    @Before
    public void before() {
        drumStick = new DrumStick("Johnny", 30, 40, true, "Wood", 4);
    }


    @Test
    public void canSetGetManufacturer() {
        drumStick.setManufacturer("Yama");
        assertEquals("Yama", drumStick.getManufacturer());
    }

    @Test
    public void canAddGetPurchasePrice() {
        drumStick.setPurchasePrice(50);
        assertEquals(50, drumStick.getPurchasePrice(), 0);
    }

    @Test
    public void canAddGetSellingPrice() {
        drumStick.setSellingPrice(1200);
        assertEquals(1200, drumStick.getSellingPrice(), 0);
    }

    @Test
    public void canSetCheckInStock() {
        drumStick.setInStock(false);
        assertEquals(false, drumStick.isInStock());
    }

    @Test
    public void canAddGetMaterial() {
        drumStick.setMaterial("Thermoplastic");
        assertEquals("Thermoplastic", drumStick.getMaterial());
    }

    @Test
    public void canAddGetLength() {
        drumStick.setLength(5);
        assertEquals(5, drumStick.getLength(), 0);
    }


}
