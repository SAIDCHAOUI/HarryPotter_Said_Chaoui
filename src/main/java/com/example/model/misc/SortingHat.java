package com.example.model.misc;
import com.example.model.character.Wizard;
import java.util.Random;
public class SortingHat {
    public static House assignHouse(Wizard wizard) {
        Random random = new Random();
        int houseNumber = random.nextInt(4);
        House house = House.values()[houseNumber];
        wizard.setHouse(house);
        house.applyBonus(wizard);
        return house;
    }

    public static Wand assignWand(Wizard wizard) {
        Random random = new Random();
        int coreNumber = random.nextInt(Core.values().length);
        Core core = Core.values()[coreNumber];
        int size = random.nextInt(13) + 22;
        Wand wand = new Wand(core, size);
        wizard.setWand(wand);
        return wand;
    }
}

