package com.example.model.levels;
import com.example.model.character.Boss;
import com.example.model.character.Wizard;
public class Level_3_PrisonnerOfAskaban extends Level {
    public Level_3_PrisonnerOfAskaban(Wizard wizard) {
        super("Prisonner of Askaban", 3,
                new Boss("Dementor", "The dark creature", 150, 20), wizard);
    }
}
