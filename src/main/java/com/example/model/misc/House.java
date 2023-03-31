package com.example.model.misc;
import com.example.model.character.Wizard;
import lombok.Getter;


public enum House {
    Gryffindor ("Gryffindor"),
    Hufflepuff ("Hufflepuff"),
    Ravenclaw ("Ravenclaw"),
    Slytherin ("Slytherin");

    @Getter private final String name;

    House( String name){
        this.name = name;
    }

    public void applyBonus(Wizard wizard){
        switch(this){
            case Gryffindor -> wizard.setDefense(wizard.getDefense() * 1.1);
            case Hufflepuff -> wizard.setPotionEfficiency(wizard.getPotionEfficiency() * 1.1);
            case Ravenclaw -> wizard.setPrecision(wizard.getPrecision() * 1.1);
            case Slytherin -> wizard.setAttackDamage((int) (wizard.getAttackDamage() * 1.1));
        }
    }

}
