package edu.badpals.GildedRose;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConguredItemTest {
    @Test
    public void testSellInUpdate(){
        ConguredItem conjured = new ConguredItem("Conjured Mana Cake", 10, 20);
        conjured.update_item();
        assertEquals(9, conjured.getSellIn());
    }
    @Test
    public void testSellInMasZero(){
        ConguredItem conjured = new ConguredItem("Conjured Mana Cake", 10, 20);
        conjured.update_quality();
        assertEquals(18, conjured.getQuality());
    }
    @Test
    public void testSellInZero(){
        ConguredItem conjured = new ConguredItem("Conjured Mana Cake", 0, 20);
        conjured.update_quality();
        assertEquals(18, conjured.getQuality());
    }
    @Test
    public void testSellInMenosZero(){
        ConguredItem conjured = new ConguredItem("Conjured Mana Cake", -1, 20);
        conjured.update_quality();
        assertEquals(16, conjured.getQuality());
    }
}
