package MusicShop.Instruments;

import MusicShop.Interfaces.IPlay;
import MusicShop.ShopItem;

public abstract class Instrument extends ShopItem implements IPlay {

    private String colour;

    public Instrument(String name, double purchasePrice, double sellingPrice, boolean inStock, String colour) {
        super(name, purchasePrice, sellingPrice, inStock);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
