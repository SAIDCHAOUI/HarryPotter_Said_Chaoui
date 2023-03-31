package com.example.model.spells;
import com.example.model.character.Character;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
public abstract class AbstractSpell {
    private String name;
    private int requiredLevel;
    private int successRate;

    public boolean cast(Character enemy) {
        boolean canCastSpell = canCastSpell();
        if (canCastSpell) {
            System.out.println("You cast " + name + " on " + enemy.getName());
        } else {
            System.out.println("You failed to cast " + name + " on " + enemy.getName() + "!");
        }
        return canCastSpell;
    }

    public boolean canCastSpell() {
        return successRate <= (int) (Math.random() * 100);
    }

    public int getDamage() {

        return 0;
    }

}


