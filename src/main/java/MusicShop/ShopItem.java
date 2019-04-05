package MusicShop;

import MusicShop.Interfaces.ISell;

public abstract class ShopItem implements ISell {

    String manufacturer;
    double purchasePrice;
    double sellingPrice;
    boolean inStock;

    public ShopItem(String namufacturer, double purchasePrice, double sellingPrice, boolean inStock) {
        this.manufacturer = manufacturer;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
        this.inStock = inStock;
    }
    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer= manufacturer;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

}
