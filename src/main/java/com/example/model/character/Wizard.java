package com.example.model.character;
import com.example.model.misc.*;
import com.example.model.spells.AbstractSpell;
import lombok.*;
import java.util.ArrayList;
import java.util.List;
import com.example.utils.UserInput;
@Getter
@Setter
@ToString
public class Wizard extends Character {
    private Pet pet;
    private Wand wand;
    private House house;
    @Setter(AccessLevel.NONE) private List<AbstractSpell> knownSpells;
    @Setter(AccessLevel.NONE) private List<Potion> potions;

    private double defense;
    private double precision;
    private double potionEfficiency;

    public Wizard(String name, int maxHp, int attackDamage) {
        super(name, maxHp, attackDamage);
        this.knownSpells = new ArrayList<>();
        this.potions = new ArrayList<>();
        SortingHat.assignHouse(this);
        return;
    }
}
