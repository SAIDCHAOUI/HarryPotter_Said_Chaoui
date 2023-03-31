package com.example.model.character;
import lombok.*;
@Getter
@Setter

public abstract class Character {
    protected final String name;
    protected final int maxHp;
    protected int hp;
    protected int attackDamage;
    protected double precision = 0.5;

    public Character(String name, int maxHp, int attackDamage){
        this.name=name;
        this.maxHp=maxHp;
        this.hp=maxHp;
        this.attackDamage=attackDamage;
    }

    public boolean attack(Character character) {

        return character.takeDamage((int) ( attackDamage * precision));
    }

    public boolean isAlive(){
        return hp>0;
    }
    public boolean takeDamage(int damage){
        hp -= damage;
        System.out.println(this.name + " takes " + damage + " damage. Remaining hp: " + hp + ".");
        if (hp <= 0) {
            hp = 0;
            System.out.println(this.name + " is dead");
            return true;
        }
        return false;
    }
}
