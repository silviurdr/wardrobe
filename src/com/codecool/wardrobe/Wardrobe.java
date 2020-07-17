package com.codecool.wardrobe;

import com.codecool.wardrobe.clothes.Clothing;
import com.codecool.wardrobe.hangers.Hanger;

import java.util.ArrayList;
import java.util.List;

;

public class Wardrobe {

    private int maxHangersAllowed;
    private List<Hanger> allHangers = new ArrayList<>();
    private List<Hanger> topHangers = new ArrayList<>();
    private List<Hanger> topsBottomsHangers = new ArrayList<>();
    private static int countHangersInWardrobe = 0;

    Wardrobe(int maxHangersAllowed) {
        if (maxHangersAllowed <= 20) {
            this.maxHangersAllowed = maxHangersAllowed;
        } else throw new IllegalArgumentException("This wardrobe can accommodate maximum 20 hangers.");

    }

    public void put(Hanger hanger) {
        countHangersInWardrobe++;
        if (countHangersInWardrobe > 8) {
            System.out.println("Sorry, you can't add more hangers now, the wardrobe is currently full");
            ;
        } else {
            allHangers.add(hanger);
            if (hanger.getType().equals("TOPSHANGER")) {
                topHangers.add(hanger);
            } else topsBottomsHangers.add(hanger);
            System.out.println(hanger.getType() + " with ID " + hanger.getId() + " added in wardrobe");
        }

    }

    public void getHanger(Clothing clothing) {
        if (clothing.getType() == "top") {
            for (Hanger hanger : topHangers) {
                if (hanger.hasSlotFor(clothing)) {
                    hanger.put(clothing);
                    System.out.println(clothing.getBrandName() + " " + clothing.getType() + " with ID " + clothing.getId() + " added on a " + hanger.getType());
                    break;
                } else {
                    System.out.println("No empty hangers for your clothes");
                }
            }
        } else if (clothing.getType() == "lower") {
            for (Hanger hanger : topsBottomsHangers) {
                if (hanger.hasSlotFor(clothing)) {
                    hanger.put(clothing);
                    System.out.println(clothing.getBrandName() + " " + clothing.getType() + " with ID " + clothing.getId() + " added on a " + hanger.getType());
                    break;
                } else {
                    System.out.println("No empty hangers for your clothes" + clothing.getBrandName());
                }
            }
        }
    }

    public void getClothes(int id) {
        for (Hanger hanger : allHangers) {
            if (hanger.isClothingOnHanger(id)) {
                hanger.takeOff(id);
                System.out.println("Clothing piece with ID " + id + " found on hanger " + hanger.getId() + " and was removed from the wardrobe.");
                break;
            }
        }
    }


    public void getMaxHangersAllowed() {
        System.out.println("Maximum numbers of hangers allowed in this wardrobe: " + maxHangersAllowed);
    }

    public List<Hanger> getAllHangers() {
        return allHangers;
    }
    
}
