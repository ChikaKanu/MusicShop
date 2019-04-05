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



}
