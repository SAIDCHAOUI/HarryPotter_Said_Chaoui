package com.example.model.levels;
import  com.example.model.character.Boss;
import  com.example.model.character.Wizard;
public class Level_7_DeathlyHallows extends Level{
    public Level_7_DeathlyHallows(Wizard wizard) {
        super("Deathly Hallows", 7,
                new Boss("Voldemort", "The dark lord", 500, 50), wizard);
    }
}
