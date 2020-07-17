package com.codecool.wardrobe.clothes;

public class TopClothing extends Clothing {


    public TopClothing(String brandName, Clothes clothingPiece) {
        super(brandName, clothingPiece);
        if (clothingPiece.getClothingType().equals("top")) {
            this.type = clothingPiece.getClothingType();
            this.description = clothingPiece.getDescription();
            this.brandName = brandName;
            this.id = counter;
            counter++;
        } else throw new IllegalArgumentException("Clothing type argument not suitable");
    }

}



