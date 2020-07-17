package com.codecool.wardrobe.clothes;

public abstract class Clothing {


    protected int id;
    protected String brandName;
    protected static int counter = 0;
    protected String type;
    protected String description;

    Clothing(String brandName, Clothes clothingPiece) {
        this.id = counter++;
    }


    public int getId() {
        return id;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}
