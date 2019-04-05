package MusicShop.Instruments;

public class Piano extends Instrument {

    private int noOfKeys;
    private String type;

    public Piano(String manufacturer, double purchasePrice, double sellingPrice, boolean inStock, String colour, int noOfKeys, String type) {
        super(manufacturer, purchasePrice, sellingPrice, inStock, colour);
        this.noOfKeys = noOfKeys;
        this.type = type;
    }

    public int getNoOfKeys() {
        return this.noOfKeys;
    }

    public void setNoOfKeys(int noOfKeys) {
        this.noOfKeys = noOfKeys;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
