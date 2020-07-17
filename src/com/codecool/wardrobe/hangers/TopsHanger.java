package com.codecool.wardrobe.hangers;


import com.codecool.wardrobe.clothes.Clothing;


public class TopsHanger extends Hanger {


    public TopsHanger() {
        super();
        this.type = HangerType.TOPSHANGER.toString();
        this.availableSlots.put("Top Clothing", true);
        this.id = counter++;
    }

    @Override
    public boolean hasSlotFor(Clothing clothing) {
        if ((clothing.getType().equals("top")) && availableSlots.get("Top Clothing") == true) {
            System.out.println("Yes, there is slot on this hanger for a " + clothing.getDescription());
        } else {
            System.out.println("Sorry, there is no space on the hanger for a " + clothing.getDescription());
            return true;
        }
        return false;
    }

    @Override
    public void takeOff() {
        availableSlots.put("Top Clothing", true);
        clothesOnHanger.clear();
    }

    @Override
    public void takeOff(int id) {
        for (Clothing clothing : clothesOnHanger) {
            if (clothing.getId() == id) {
                availableSlots.put("Top Clothing", true);
                clothesOnHanger.remove(clothing);
                break;
            } else {
                System.out.println("Clothing not found on this hanger");
            }
        }
    }

    @Override
    public void put(Clothing clothing) {
        if (clothing.getType().equals("top")) {
            if (availableSlots.get("Top Clothing") == true) {
                availableSlots.put("Top Clothing", false);
                clothesOnHanger.add(clothing);
                System.out.println(clothing.getBrandName() + " " + clothing.getDescription() + " with ID " + clothing.getId() + " added on the hanger with ID " + this.getId());
            } else
                System.out.println("There is no place available on the hanger with ID " + this.getId() + " for " + clothing.getDescription());
        } else System.out.println("This hanger doesn't accept trousers or skirts");

    }

}
