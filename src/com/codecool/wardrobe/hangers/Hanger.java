package com.codecool.wardrobe.hangers;

import com.codecool.wardrobe.clothes.Clothing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Hanger {

    String type;
    int id;
    List<Clothing> clothesOnHanger = new ArrayList<>();
    Map<String, Boolean> availableSlots = new HashMap<>();
    static int counter = 1;

    protected Hanger() {
    }


    public abstract boolean hasSlotFor(Clothing clothing);

    public abstract void takeOff();

    public abstract void takeOff(int id);

    public abstract void put(Clothing clothing);

    public String getType() {
        return type;
    }

    public int getId() {
        return this.id;
    }

    enum HangerType {
        TOPSHANGER,
        TOPSBOTTOMSHANGER
    }

    public List<Clothing> getClothesOnHanger() {
        for (Clothing clothing : clothesOnHanger) {
            System.out.println(clothing.getBrandName() + " " + clothing.getDescription() + " " + clothing.getId());
        }
        ;
        return this.clothesOnHanger;
    }

    public boolean isClothingOnHanger(int id) {
        for (Clothing clothing : clothesOnHanger) {
            if (clothing.getId() == id) {
                return true;
            }
        }
        return false;
    }


}
