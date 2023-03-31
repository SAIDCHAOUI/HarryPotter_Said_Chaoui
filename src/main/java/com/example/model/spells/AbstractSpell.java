package com.example.model.spells;
import com.example.model.character.Character;
import com.example.model.character.Wizard;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

@Getter
@Setter
@AllArgsConstructor
public abstract class AbstractSpell {
    private final String name;
    private final int maxDamage;
    // percentage that the spell will be cast successfully (e.g. 50 means that the spell will be cast successfully 50% of the time)
    private final int successRate;

    public void cast(Wizard caster, Character target) {
        if (canCast()) {
            System.out.println("Casting spell " + this.getName() + " on " + target.getName());
            target.takeDamage((int) (getDamage() * caster.getPrecision()));
        }
        else
            System.out.println("Spell " + this.getName() + " failed");
    }

    public int getDamage() {
        Random random = new Random();
        return random.nextInt(this.maxDamage+ 1);
    }

    public boolean canCast() {
        int random = new Random().nextInt(100);
        return random <= this.successRate;
    }
    @Override
    public String toString() {
        return name;
    }

}


