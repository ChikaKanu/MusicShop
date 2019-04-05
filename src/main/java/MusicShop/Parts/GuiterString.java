package MusicShop.Parts;

public class GuiterString extends Part{

    private double tensileStrength;

    public GuiterString(String manufacturer, double purchasePrice, double sellingPrice, boolean inStock, String material, double tensileStrength) {
        super(manufacturer, purchasePrice, sellingPrice, inStock, material);
        this.tensileStrength = tensileStrength;
    }

    public double getTensileStrength() {
        return tensileStrength;
    }

    public void setTensileStrength(double tensileStrength) {
        this.tensileStrength = tensileStrength;
    }
}
