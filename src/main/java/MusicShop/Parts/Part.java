package MusicShop.Parts;

import MusicShop.ShopItem;

public class Part extends ShopItem {

    private String material;

    public Part(String name, double purchasePrice, double sellingPrice, boolean inStock, String material) {
        super(name, purchasePrice, sellingPrice, inStock);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
