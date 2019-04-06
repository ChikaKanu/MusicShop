import MusicShop.Enums.SaxophoneType;
import MusicShop.Instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before() {
        saxophone = new Saxophone("Xerus", 400, 500, true, "Gold", "Brass", "Ribbed", SaxophoneType.ALTO);
    }

    @Test
    public void canSetGetManufacturer() {
       saxophone.setManufacturer("Yamaha");
        assertEquals("Yamaha", saxophone.getManufacturer());
    }

    @Test
    public void canAddGetPurchasePrice() {
        saxophone.setPurchasePrice(600);
        assertEquals(600, saxophone.getPurchasePrice(), 0);
    }

    @Test
    public void canAddGetSellingPrice() {
       saxophone.setSellingPrice(800);
        assertEquals(800, saxophone.getSellingPrice(), 0);
    }

    @Test
    public void canSetCheckInStock() {
        saxophone.setInStock(false);
        assertEquals(false, saxophone.isInStock());
    }

    @Test
    public void canSetGetColour() {
        saxophone.setColour("black");
        assertEquals("black", saxophone.getColour());
    }

    @Test
    public void canAddGetMaterial() {
        saxophone.setMaterial("Silver");
        assertEquals("Silver", saxophone.getMaterial());
    }

    @Test
    public void canAddGetConstruction() {
        saxophone.setConstruction("Non-Ribbed");
        assertEquals("Non-Ribbed", saxophone.getConstruction());
    }

    @Test
    public void canAddGetSaxophoneType() {
        saxophone.setSaxophoneType(SaxophoneType.SOPRANO);
        assertEquals(SaxophoneType.SOPRANO, saxophone.getSaxophoneType());
    }


    @Test
    public void canPlaySound() {
        assertEquals("Saxophone playing: brrrrllllllddddd", saxophone.playSound("brrrrllllllddddd"));
    }

}
