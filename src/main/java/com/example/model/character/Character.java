package com.example.model.character;
import lombok.*;
@Getter
@Setter

public abstract class Character {
    protected final String name;
    protected final int maxHp;
    protected int hp;
    protected int attackDamage;

    public Character(String name, int maxHp, int attackDamage){
        this.name=name;
        this.maxHp=maxHp;
        this.hp=maxHp;
        this.attackDamage=attackDamage;
    }

    public boolean attack(Character character){ character.takeDamage(attackDamage);
        return false;
    }

    public boolean isAlive(){
        return hp>0;
    }
    public boolean takeDamage(int damage){
        hp-=damage;
        if(hp<0){
            hp=0;
        }
        return false;
    }
}
