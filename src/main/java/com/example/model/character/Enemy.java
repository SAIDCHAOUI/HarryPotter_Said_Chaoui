package com.example.model.character;
import lombok.ToString;
@ToString
public class Enemy extends AbstractEnemy {
    public Enemy(String name, String description, int maxHp, int attackDamage) {
        super(name, description, maxHp, attackDamage);
    }
}
