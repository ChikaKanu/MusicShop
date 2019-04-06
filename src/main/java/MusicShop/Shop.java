package MusicShop;

import MusicShop.Interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public void addItemToStock(ISell item) {
        this.stock.add(item);
    }

    public void removeFirstItem() {
        this.stock.remove(0);
    }

    public void removeItemFromStock(ISell item) {
        for (ISell arrayItem : this.stock) {
            if (arrayItem == item) {
                this.stock.remove(arrayItem);
            }
        }
    }

    public String playSound(String sound) {
        return "Playing: " + sound;

    }

    public int countStock() {
        return this.stock.size();
    }

    public double calculateMarkup() {
        double totalMarkUp = 0;
        for (ISell item : this.stock) {
            double markUp = item.getSellingPrice() - item.getPurchasePrice();
            totalMarkUp += markUp;
        }
        return totalMarkUp;
    }

}