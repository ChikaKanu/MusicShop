package MusicShop.Instruments;

import MusicShop.Enums.GuiterType;

public class Guiter extends Instrument{

    int noOfStrings;
    GuiterType guiterType;

    public Guiter(String manufacturer, double purchasePrice, double sellingPrice, boolean inStock, String colour, int noOfStrings, GuiterType guiterType) {
        super(manufacturer, purchasePrice, sellingPrice, inStock, colour);
        this.noOfStrings = noOfStrings;
        this.guiterType = guiterType;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public void setNoOfStrings(int noOfStrings) {
        this.noOfStrings = noOfStrings;
    }

    public GuiterType getGuiterType() {
        return guiterType;
    }

    public void setGuiterType(GuiterType guiterType) {
        this.guiterType = guiterType;
    }

}
