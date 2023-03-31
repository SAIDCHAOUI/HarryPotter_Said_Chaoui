package com.example.model.levels;
import com.example.model.character.Boss;
import com.example.model.character.Wizard;
public class Level_2_ChamberOfSecrets extends Level {
    public Level_2_ChamberOfSecrets(Wizard wizard) {
        super("Chamber of Secrets", 2,
                new Boss("Basilic", "A boss", 100, 20), wizard);
    }
}
