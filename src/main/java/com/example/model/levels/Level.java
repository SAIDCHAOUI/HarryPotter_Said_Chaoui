package com.example.model.levels;
import com.example.model.character.Boss;
import com.example.model.character.Enemy;
import com.example.model.character.Wizard;
import com.example.model.spells.AbstractSpell;
import com.example.model.spells.Spell;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@Getter
public abstract class Level {
    protected final List<Enemy> enemies= new ArrayList<>();
    protected final List<AbstractSpell> spellsLearned= new ArrayList<>();
    protected final Boss boss;
    protected final String name;
    protected final int year;

    Level(String name, int year, Boss boss, Wizard wizard, AbstractSpell... spellsLearned) {
        this.name= name;
        this.year= year;
        this.boss= boss;
        this.spellsLearned.addAll(List.of(spellsLearned));

        System.out.println("Welcome in your year " + year + " at Hogwarts!");
        System.out.println("This year's trial is the " + name);

        learnSpells(wizard);
    }

    public void addSpell(Spell spell) {
        spellsLearned.add(spell);
    }

    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
    }

    public void learnSpells(Wizard wizard){
        if (spellsLearned.isEmpty()) {
            return;
        }
        System.out.println("You have learned the following spells:");
        for (AbstractSpell spell : spellsLearned) {
            wizard.learnSpell(spell);
            System.out.println(spell);
        }
    }

    public void fight(Wizard wizard){
        if (!enemies.isEmpty()) {
            System.out.println("You are fighting against the following enemies:");
            for (Enemy enemy : enemies) {
                System.out.println(enemy);
                wizard.act(enemy);
            }
        }
        System.out.println("You are fighting against the boss:");
        System.out.println(boss);
        wizard.act(boss);
    }

}
