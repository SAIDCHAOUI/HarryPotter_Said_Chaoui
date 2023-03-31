package com.example.model.misc;
import com.example.model.character.Character;
import com.example.model.spells.AbstractSpell;
import lombok.Getter;
import java.util.Random;
@Getter
public class Wand {
    private final Core core;
    private final int size;

    public Wand(Core core, int size) {
        this.core = core;
        this.size = size;
    }

    public void castSpell(AbstractSpell abstractSpell, Character enemy) {
        // calcul des chances de réussite
        int successChance = abstractSpell.getSuccessRate() * (size / 10);
        // Roll the dice to see if the spell hits
        Random random = new Random();
        int roll = random.nextInt(100) + 1;
        if (roll <= successChance) {
            // Spell hits, deal damage to the enemy
            int damage = abstractSpell.getDamage();
            enemy.takeDamage(damage);
            System.out.printf("You cast %s and deal %d damage to the enemy!\n", abstractSpell.getName(), damage);
        } else {
            // Spell misses
            System.out.printf("You cast %s but miss the enemy!\n", abstractSpell.getName());
        }
    }
}
