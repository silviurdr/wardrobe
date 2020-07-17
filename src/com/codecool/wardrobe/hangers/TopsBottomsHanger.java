package com.codecool.wardrobe.hangers;


import com.codecool.wardrobe.clothes.Clothing;


public class TopsBottomsHanger extends Hanger {


    public TopsBottomsHanger() {
        super();
        this.type = HangerType.TOPSBOTTOMSHANGER.toString();
        this.availableSlots.put("Top Clothing", true);
        this.availableSlots.put("Lower Clothing", true);
        this.id = counter++;
    }

    @Override
    public boolean hasSlotFor(Clothing clothing) {
        if (clothing.getType().equals("top") && availableSlots.get("Top Clothing") == true) {
            System.out.println("Yes, there is slot on this hanger for that " + clothing.getDescription());
            return true;
        } else if (clothing.getType().equals("lower") && availableSlots.get("Lower Clothing") == true) {
            System.out.println("Yes, there is slot on this hanger for that " + clothing.getDescription());
            return true;
        }
        return false;
    }

    @Override
    public void takeOff() {

        availableSlots.put("Top Clothing", true);
        availableSlots.put("Top Clothing", true);
        clothesOnHanger.clear();

    }

    @Override
    public void takeOff(int id) {

        for (Clothing clothing : clothesOnHanger) {
            if (clothing.getId() == id) {
                clothesOnHanger.remove(clothing);
                break;
            } else System.out.println("Clothing not found on this hanger");
        }
    }

    @Override
    public void put(Clothing clothing) {
        if (clothing.getType().equals("top")) {
            if (availableSlots.get("Top Clothing") == true) {
                availableSlots.put("Top Clothing", false);
                clothesOnHanger.add(clothing);
                System.out.println(clothing.getBrandName() + " " + clothing.getDescription() + " added on the hanger with ID " + this.getId());
            } else
                System.out.println("There is no place available on the hanger with ID " + this.getId() + " for " + clothing.getDescription());
        }


        if (clothing.getType().equals("lower")) {
            if (availableSlots.get("Lower Clothing") == true) {
                availableSlots.put("Lower Clothing", false);
                clothesOnHanger.add(clothing);
                System.out.println(clothing.getBrandName() + " " + clothing.getDescription() + " added on the hanger with ID " + this.getId());
            } else
                System.out.println("There is no place available on the hanger with ID " + this.getId() + " for " + clothing.getDescription());
        }

    }


}
