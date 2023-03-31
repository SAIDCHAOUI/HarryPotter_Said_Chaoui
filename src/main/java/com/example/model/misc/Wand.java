package com.example.model.misc;
import com.example.model.character.Character;
import com.example.model.spells.AbstractSpell;
import lombok.Getter;
import java.util.Random;
@Getter
public class Wand {
    private final Core core;
    private final int size;

    public Wand(Core core, int size) {
        this.core = core;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Wand of " + core + " with a size of " + size;
    }
}
