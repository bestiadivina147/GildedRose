package edu.badpals.GildedRose;

public class NormalItem extends Item implements Updateable{

    public NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        //TODO Auto-generated constructor stub
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update_item'");
    }

    @Override
    public void update_quality() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update_quality'");
    }


 
    
}
