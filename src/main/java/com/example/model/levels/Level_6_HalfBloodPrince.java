package com.example.model.levels;
import com.example.model.character.Boss;
import com.example.model.character.Wizard;
public class Level_6_HalfBloodPrince extends Level{
    public Level_6_HalfBloodPrince(Wizard wizard) {
        super("Half Blood Prince", 6,
                new Boss("Death Eater", "The dark Wizard", 250, 30), wizard);
    }
}
