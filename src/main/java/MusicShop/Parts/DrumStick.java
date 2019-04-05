package MusicShop.Parts;

public class DrumStick extends Part {

    private double length;

    public DrumStick(String manufacturer, double purchasePrice, double sellingPrice, boolean inStock, String material, double length) {
        super(manufacturer, purchasePrice, sellingPrice, inStock, material);
        this.length = length;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
