package com.example.model.levels;
import com.example.model.character.Boss;
import com.example.model.character.Wizard;
public class Level_4_GobletOfFire extends Level{
    public Level_4_GobletOfFire(Wizard wizard) {
        super("Goblet of Fire", 4,
                new Boss("Peter pettigrew", "The traitor", 200, 25), wizard);
    }
}
