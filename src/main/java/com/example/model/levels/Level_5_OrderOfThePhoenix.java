package com.example.model.levels;
import com.example.model.character.Boss;
import com.example.model.character.Wizard;
public class Level_5_OrderOfThePhoenix extends Level {
    public Level_5_OrderOfThePhoenix(Wizard wizard) {
        super("Order of the Phoenix", 5,
                new Boss("Dolores Umbridge", "The Ministry of Magic", 250, 40), wizard);
    }
}
