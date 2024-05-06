package edu.badpals.GildedRose;

public class BackstagePass extends Item implements Updateable {

    public BackstagePass(String name, int sellIn, int quality) {
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
        if(this.sellIn > 10){
            this.quality = this.quality + 1;
        }else if(5 < this.sellIn && this.sellIn <= 10){
            this.quality = this.quality + 2;
        }else if(0 <= this.sellIn && this.sellIn <= 5){
            this.quality = this.quality + 3;
        }else if(0 > this.sellIn){
            this.quality = 0;
        }
    }

    
}
