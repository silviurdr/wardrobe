package com.codecool.wardrobe.clothes;

public enum Clothes {

    SHIRT("top", "shirt"),
    BLOUSE("top", "blouse"),
    TROUSERS("lower", "trousers"),
    SKIRT("lower", "skirt");

    private String clothingType;
    private String description;

    Clothes(String clothingType, String description) {
        this.clothingType = clothingType;
        this.description = description;
    }


    public String getClothingType() {
        return clothingType;
    }

    public String getDescription() {
        return description;
    }
}
