package MusicShop.Parts;

import MusicShop.ShopItem;

public class Part extends ShopItem {

    private String material;

    public Part(String manufacturer, double purchasePrice, double sellingPrice, boolean inStock, String material) {
        super(manufacturer, purchasePrice, sellingPrice, inStock);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
