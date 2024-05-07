package edu.badpals.GildedRose;

public class ConguredItem extends Item implements Updateable {

    public ConguredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void update_item() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update_item'");
    }

    @Override
    public void update_quality() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update_quality'");
    }

    @Override
    public int getQuality() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getQuality'");
    }

    @Override
    public int getSellIn() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSellIn'");
    }
    
}
