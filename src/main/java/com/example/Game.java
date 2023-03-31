package com.example;
import com.example.model.character.Wizard;
import com.example.model.misc.*;
import com.example.utils.*;
import com.example.model.levels.*;

public class Game {
    private static final UserInput input = UserInput.getInstance();
    public static void main(String[] args){
        System.out.println("Hello, Welcome to Hogwarts dear Wizard !");
        System.out.println("To start the game, please tell us your name:");
        String name = input.readString();
        Wizard wizard = new Wizard(name, 100, 10);
        SortingHat.assignWand(wizard);


        System.out.println("Welcome again " + wizard.getName() + " !");
        // Afficher les informations du Wizard
        System.out.printf("The sorting Hat assigned you to %s.\n", wizard.getHouse().getName());
        System.out.printf("Yout magic wand is in %s with %d cm.\n", wizard.getWand().getCore().getName(), wizard.getWand().getSize());
        System.out.printf("To start, you have %d HP.\n", wizard.getHp());

        // Commencement du jeu

        Level_1_PhilosopherStone level1PhilosopherStone = new Level_1_PhilosopherStone(Wizard);


    }
}
