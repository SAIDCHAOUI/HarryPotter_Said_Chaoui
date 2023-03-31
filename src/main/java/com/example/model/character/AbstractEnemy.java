package com.example.model.character;

import lombok.Getter;
@Getter
public abstract class AbstractEnemy extends Character {
    private final String description;
    public AbstractEnemy(String name, String description, int maxHp, int attackDamage) {
        super(name, maxHp, attackDamage);
        this.description = description;
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getDescription() + ")";
    }
}
