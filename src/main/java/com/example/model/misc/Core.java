package com.example.model.misc;

import com.example.model.character.Wizard;
import lombok.Getter;

@Getter
public enum Core {
    PHOENIX_FEATHER("Phoenix Feather"),
    DRAGON_HEARTSTRING("Dragon Heartstring"),
    KNEAZLE_WHISKER("Kneazle Whisker");

    private final String name;

    Core(String name) {
        this.name = name;
    }

    public void applyBonus(Wizard wizard) {
        switch (this) {
            case PHOENIX_FEATHER -> wizard.setDefense(wizard.getDefense() * 1.05);
            case DRAGON_HEARTSTRING -> wizard.setAttackDamage((int) (wizard.getAttackDamage() * 1.05));
            case KNEAZLE_WHISKER -> wizard.setPotionEfficiency(wizard.getPotionEfficiency() * 1.05);
        }
    }
}
