package edu.badpals.GildedRose;

public class Sulfuras extends Item implements Updateable {

    public Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality=80);
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
        throw new UnsupportedOperationException("La calidad de este item no se modifica siempre es 80'");
    }
    
}
