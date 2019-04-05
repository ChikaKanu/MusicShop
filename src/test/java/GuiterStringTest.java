import MusicShop.Parts.GuiterString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuiterStringTest {

    GuiterString guiterString;

    @Before
    public void before() {
        guiterString = new GuiterString("Yamaha", 100, 140, true, "Plastic",25);
    }
    @Test
    public void canSetGetManufacturer() {
        guiterString.setManufacturer("Casio");
        assertEquals("Casio", guiterString.getManufacturer());
    }

    @Test
    public void canAddGetPurchasePrice() {
        guiterString.setPurchasePrice(50);
        assertEquals(50, guiterString.getPurchasePrice(), 0);
    }

}
