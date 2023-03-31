package com.example.model.levels;
import com.example.model.character.Boss;
import com.example.model.character.Wizard;
import com.example.model.spells.Spell;
public class Level_1_PhilosopherStone extends Level{
    public Level_1_PhilosopherStone(Wizard wizard) {
        super("Philosopher's Stone", 1,
                new Boss("Troll", "The toilet's troll", 100, 15),
                wizard,
                new Spell("Wingardium Leviosa", 10, 100));
    }

}
