import MusicShop.Enums.GuiterType;
import MusicShop.Enums.SaxophoneType;
import MusicShop.Instruments.Guiter;
import MusicShop.Instruments.Saxophone;
import MusicShop.Instruments.Piano;
import MusicShop.Interfaces.ISell;
import MusicShop.Parts.DrumStick;
import MusicShop.Parts.GuiterString;
import MusicShop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ShopTest {

    ISell piano1;
    ISell piano2;
    ISell guiter1;
    ISell guiter2;
    ISell guiter3;
    ISell saxophone1;
    ISell guiterString1;
    ISell guiterString2;
    ISell drumStick1;
    DrumStick drumStick2;
    DrumStick drumStick3;
    Shop stock;

    @Before
    public void before() {
        piano1 = new Piano("Casio",1000, 1400, true, "Metallic", 650, "Weighted_Hammer");
        piano2 = new Piano("Sharp",800, 1100, true, "Metallic", 450, "Weighted_Hammer");
        guiter1 = new Guiter("Casio", 100, 120, true, "wood", 4, GuiterType.ACCUSTIC);
        guiter2 = new Guiter("Yamaha", 300, 500, true, "wood", 5, GuiterType.ELECTRIC);
        guiter3 = new Guiter("Sord", 150, 230, true, "wood", 4, GuiterType.ACCUSTIC);
        saxophone1 = new Saxophone("Xerus", 400, 500, true, "Gold", "Brass", "Ribbed", SaxophoneType.ALTO);
        guiterString1 = new GuiterString("Yamaha", 100, 140, true, "Plastic",25);
        guiterString2 = new GuiterString("Yamaha", 100, 140, true, "Plastic",25);
        drumStick1 = new DrumStick("Johnny", 40, 60, true, "Wood", 4);
        drumStick2 = new DrumStick("Johnny", 30, 40, true, "Wood", 4);
        drumStick3 = new DrumStick("Johnny", 30, 40, true, "Wood", 4);
        stock = new Shop();
    }

    @Test
    public void canAddAndCheckItemsToStock() {
        stock.addItemToStock(drumStick1);
        stock.addItemToStock(piano1);
        stock.addItemToStock(piano2);
        stock.addItemToStock(guiter1);
        stock.addItemToStock(saxophone1);
        assertEquals(5, stock.countStock());
    }

    @Test
    public void canRemoveItemFromStockByIndex() {
        stock.addItemToStock(drumStick1);
        stock.addItemToStock(piano1);
        stock.addItemToStock(piano2);
        stock.addItemToStock(guiter1);
        stock.addItemToStock(saxophone1);
        stock.removeFirstItem();
        assertNotNull(stock);
        assertEquals(4, stock.countStock());

    }

    @Test
    public void canRemoveItemFromStockByObject() {
        stock.addItemToStock(drumStick1);
        stock.addItemToStock(piano1);
        stock.addItemToStock(piano2);
        stock.addItemToStock(guiter1);
        stock.addItemToStock(saxophone1);
        stock.removeItemFromStock(saxophone1);
        assertEquals(4, stock.countStock());
    }

    @Test
    public void canCalculateMarkup() {
        stock.addItemToStock(drumStick1);
        stock.addItemToStock(drumStick2);
        stock.addItemToStock(drumStick3);
        stock.addItemToStock(piano1);
        stock.addItemToStock(piano2);
        stock.addItemToStock(guiter1);
        stock.addItemToStock(guiter2);
        stock.addItemToStock(guiter3);
        stock.addItemToStock(saxophone1);
        stock.addItemToStock(guiterString1);
        stock.addItemToStock(guiterString2);
        assertEquals(1220, stock.calculateMarkup(),0);
    }

}
