package edu.badpals.GildedRose;

public class ConguredItem extends Item implements Updateable {

    public ConguredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public int getQuality() {
        return this.quality;
    }

    @Override
    public int getSellIn() {
        return this.sellIn;
    }

    @Override
    public void update_item() {
        this.sellIn = this.sellIn - 1;
    }
    
    @Override
    public void update_quality() {
        if(this.sellIn>=0){
            this.quality = this.quality -2;
        }else if(this.sellIn<0){
            this.quality = this.quality -4;
        }
    }
    
}
