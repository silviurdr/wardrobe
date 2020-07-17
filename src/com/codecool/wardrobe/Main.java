package com.codecool.wardrobe;

import com.codecool.wardrobe.clothes.Clothes;
import com.codecool.wardrobe.clothes.Clothing;
import com.codecool.wardrobe.clothes.LowerClothing;
import com.codecool.wardrobe.clothes.TopClothing;
import com.codecool.wardrobe.hangers.Hanger;
import com.codecool.wardrobe.hangers.TopsBottomsHanger;
import com.codecool.wardrobe.hangers.TopsHanger;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here


        List<Hanger> allHangers = new ArrayList<>();

        Clothing blouse1 = new TopClothing("United Colors of Benetton", Clothes.BLOUSE);
        Clothing blouse2 = new TopClothing("Springfield", Clothes.BLOUSE);
        Clothing blouse3 = new TopClothing("Timberland", Clothes.BLOUSE);

        Clothing shirt1 = new TopClothing("US Polo", Clothes.SHIRT);
        Clothing shirt2 = new TopClothing("Bigotti", Clothes.SHIRT);
        Clothing shirt3 = new TopClothing("Massimo Dutti", Clothes.SHIRT);

        Clothing trousers1 = new LowerClothing("Serioussi", Clothes.TROUSERS);
        Clothing trousers2 = new LowerClothing("Bigotti", Clothes.TROUSERS);
        Clothing trousers3 = new LowerClothing("Tommy Hilfiger", Clothes.TROUSERS);

        Clothing skirt1 = new LowerClothing("United Colors of Benetton", Clothes.SKIRT);
        Clothing skirt2 = new LowerClothing("Mango", Clothes.SKIRT);
        Clothing skirt3 = new LowerClothing("Desigual", Clothes.SKIRT);


        Hanger hanger1 = new TopsHanger();

        Hanger hanger2 = new TopsHanger();
        Hanger hanger3 = new TopsHanger();
        Hanger hanger4 = new TopsHanger();
        Hanger hanger5 = new TopsBottomsHanger();
        Hanger hanger6 = new TopsBottomsHanger();
        Hanger hanger7 = new TopsBottomsHanger();
        Hanger hanger8 = new TopsBottomsHanger();
        Hanger hanger9 = new TopsBottomsHanger();

        hanger3.put(shirt1);
        hanger3.put(shirt2);

        hanger7.put(shirt2);
        hanger7.put(shirt3);
        hanger7.put(trousers1);
        hanger7.put(trousers2);


        Wardrobe myWardrobe = new Wardrobe(8);

        hanger7.getClothesOnHanger();

        myWardrobe.getMaxHangersAllowed();

        myWardrobe.put(hanger1);
        myWardrobe.put(hanger2);
        myWardrobe.put(hanger3);
        myWardrobe.put(hanger4);
        myWardrobe.put(hanger5);
        myWardrobe.put(hanger6);
        myWardrobe.put(hanger7);
        myWardrobe.put(hanger8);
        myWardrobe.put(hanger9);


        myWardrobe.getAllHangers();

        myWardrobe.getHanger(blouse1);

        myWardrobe.getHanger(trousers2);

        myWardrobe.getClothes(9);

        hanger7.getClothesOnHanger();

    }


}