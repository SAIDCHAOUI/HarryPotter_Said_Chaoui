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

    public void attack(Character character){ character.takeDamage(attackDamage); }

    public boolean isAlive(){
        return hp>0;
    }
    public void takeDamage(int damage){
        hp-=damage;
        if(hp<0){
            hp=0;
        }
    }
}
