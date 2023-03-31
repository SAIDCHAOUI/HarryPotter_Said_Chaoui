package com.example.model.misc;

import com.example.model.character.Wizard;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class Potion {
    private final String name;
    private int healingPower;

    public void use(Wizard wizard) {
        int healAmount = (int) (healingPower * wizard.getPotionEfficiency());
        wizard.heal(healAmount);
    }

    @Override
    public String toString() {
        return name;
    }

    public void drink(Wizard wizard) {
        wizard.heal(10);
    }
}
