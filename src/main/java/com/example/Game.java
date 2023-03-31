package com.example;

import com.example.model.character.*;
import com.example.model.misc.*;
import com.example.utils.*;

public class Game {
    public static void main(String[] args) {
        // Demander le nom du sorcier
        String name = UserInput.askForname();

        // Initialiser les caractéristiques du Wizard
        int maxHp = 100;
        int attackDamage = 10;
        Wizard wizard = new Wizard(name, maxHp, attackDamage);
        SortingHat.assignWand(wizard);


        // Afficher les informations du Wizard
        System.out.printf("Bienvenue, %s !\n", wizard.getName());
        System.out.printf("Vous êtes dans la maison %s.\n", wizard.getHouse().getName());
        System.out.printf("Votre baguette magique est en %s de %d cm.\n", wizard.getWand().getCore().getName(), wizard.getWand().getSize());
        System.out.printf("Vous avez %d points de vie.\n", wizard.getHp());
    }
}
