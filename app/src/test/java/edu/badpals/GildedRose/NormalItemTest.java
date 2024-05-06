package edu.badpals.GildedRose;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NormalItemTest {
    @Test
    public void testSellInUpdate(){
        NormalItem normal = new NormalItem("+5 Dexterity Vest", 10, 20);
        normal.update_item();
        assertEquals(9, normal.getSellIn());
    }
    @Test
    public void testSellInZero(){
        NormalItem normal = new NormalItem("+5 Dexterity Vest", 0, 20);
        normal.update_quality();
        assertEquals(19, normal.getQuality());
    }
    @Test
    public void testSellInPositive(){
        NormalItem normal = new NormalItem("+5 Dexterity Vest", 1, 20);
        normal.update_quality();
        assertEquals(19, normal.getQuality());
    }
    @Test
    public void testSellInNegative(){
        NormalItem normal = new NormalItem("+5 Dexterity Vest", -1, 20);
        normal.update_quality();
        assertEquals(18, normal.getQuality());
    }
    
}
