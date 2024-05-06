package edu.badpals.GildedRose;

public class BackstagePass extends Item implements Updateable {

    public BackstagePass(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update_item() {
        throw new UnsupportedOperationException("Unimplemented method 'update_item'");
    }

    @Override
    public void update_quality() {
        throw new UnsupportedOperationException("Unimplemented method 'update_quality'");
    }

    @Override
    public int getQuality() {
        throw new UnsupportedOperationException("Unimplemented method 'getQuality'");
    }

    @Override
    public int getSellIn() {
        throw new UnsupportedOperationException("Unimplemented method 'getSellIn'");
    }
    
}
