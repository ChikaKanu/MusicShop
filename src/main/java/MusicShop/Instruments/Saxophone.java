package MusicShop.Instruments;

import MusicShop.Enums.SaxophoneType;

public class Saxophone extends Instrument {

    private String material;
    private String construction;
    private SaxophoneType saxophoneType;

    public Saxophone(String name, double purchasePrice, double sellingPrice, boolean inStock, String colour, String material, String construction, SaxophoneType saxophoneType) {
        super(name, purchasePrice, sellingPrice, inStock, colour);
        this.material = material;
        this.construction = construction;
        this.saxophoneType = saxophoneType;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getConstruction() {
        return this.construction;
    }

    public void setConstruction(String construction) {
        this.construction = construction;
    }

    public SaxophoneType getSaxophoneType() {
        return saxophoneType;
    }

    public void setSaxophoneType(SaxophoneType saxophoneType) {
        this.saxophoneType = saxophoneType;
    }

    public String playSound(String sound) {
        return "Saxophone playing: " + sound;
    }

}
