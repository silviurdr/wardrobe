package com.codecool.wardrobe.clothes;

public class LowerClothing extends Clothing {


    public LowerClothing(String brandName, Clothes clothingPiece) {
        super(brandName, clothingPiece);
        if (clothingPiece.getClothingType().equals("lower")) {
            this.type = clothingPiece.getClothingType();
            this.description = clothingPiece.getDescription();
            this.brandName = brandName;
            this.id = counter;
            counter++;
        } else throw new IllegalArgumentException("Clothing type argument not suitable");
    }

}
