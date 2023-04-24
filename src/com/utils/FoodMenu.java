package com.utils;

public class FoodMenu {
    Boolean isVeg = false;
    String itemName = "";
    Integer itemPrice = 0;

    public FoodMenu(Boolean isVeg, String itemName, Integer itemPrice) {
        this.isVeg = isVeg;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public void setVeg(Boolean veg) {
        isVeg = veg;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Integer itemPrice) {
        this.itemPrice = itemPrice;
    }
}
