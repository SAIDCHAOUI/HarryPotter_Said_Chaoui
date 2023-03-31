package com.example.model.character;
import com.example.model.misc.*;
import com.example.model.spells.AbstractSpell;
import lombok.*;
import java.util.ArrayList;
import java.util.List;
import com.example.utils.UserInput;
@Getter
@Setter
public class Wizard extends Character {
    private Pet pet;
    private Wand wand;
    private House house;
    @Setter(AccessLevel.NONE) private List<AbstractSpell> knownSpells;
    @Setter(AccessLevel.NONE) private List<Potion> potions;

    // amount of damage that is blocked (e.g. 10 means that the wizard will only take damage - 10 see takeDamage)
    private double defense;

    // percentage of the potion's effect that is applied (e.g. 0.5 means that the potion will only heal 50% of its effect)
    private double potionEfficiency;

    @Setter(AccessLevel.NONE) private UserInput input = UserInput.getInstance();

    public Wizard(String name, int maxHp, int attackDamage) {
        super(name, maxHp, attackDamage);

        this.knownSpells = new ArrayList<>();
        this.potions = new ArrayList<>();
        this.defense = 10;
        this.potionEfficiency = 0.5;

        SortingHat.assignHouse(this);
        SortingHat.assignWand(this);
    }

    // I don't know the utility of this thing.
    public void defend() {
        System.out.println("defense:" + defense);
    }

    public void heal (int healAmount) {
        hp = Math.min(hp + healAmount, maxHp);
    }

    public void learnSpell(AbstractSpell spell) {
        knownSpells.add(spell);
    }

    @Override
    public boolean attack(Character character) {
        boolean isDead = character.takeDamage((int) (attackDamage * precision));
        if (isDead)
        {
            System.out.println("You killed " + character.getName() + "!");
            System.out.println("Do you want to");
            System.out.println("1. Heal yourself");
            System.out.println("2. Increase your attack damage?");
            int choice = input.readInt();
            if (choice == 1) {
                heal(10);
            }
            else if (choice == 2) {
                attackDamage += 5;
            }
        }
        return isDead;
    }

    @Override
    public boolean takeDamage(int damage) {
        damage = (int) Math.max(0, damage - defense);
        return super.takeDamage(damage);
    }

    public <T> int displayList(List<T> list) {
        if (list.size() == 0) {
            System.out.println("You don't have any");
            return -2;
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + ". " + list.get(i));
        }
        System.out.println("-2. Back");

        int choice = input.readInt();
        if (choice == -2) {
            return choice;
        }
        if (choice < 0 || choice > potions.size() + 1) {
            System.out.println("Invalid choice");
            return -1;
        }
        return choice;
    }

    public void castSpell(Character target) {
        int choice = -1;
        while (choice == -1) {
            System.out.println("Which spell do you want to cast?");
            choice = displayList(knownSpells);
            if (choice == -2)
                return;
        }

        AbstractSpell spell = knownSpells.get(choice - 1);
        spell.cast(this, target);
    }

    public void usePotion() {
        int choice = -1;
        while (choice == -1) {
            System.out.println("Which potion do you want to use?");
            choice = displayList(potions);
            if (choice == -2)
                return;
        }

        Potion potion = potions.get(choice - 1);
        potion.use(this);
        potions.remove(potion);
    }

    public void act(Character target) {
        while (this.isAlive() && target.isAlive()) {
            System.out.println("What do you want to do?");
            System.out.println("1. Attack");
            System.out.println("2. Cast a spell");
            System.out.println("3. Use a potion");
            System.out.println("4. Defend");
            System.out.println("5. See your stats");
            int choice = input.readInt();
            switch (choice) {
                case 1 -> {
                    attack(target);
                }
                case 2 -> {
                    castSpell(target);
                }
                case 3 -> {
                    usePotion();
                }
                case 4 -> {
                    defend();
                }
                case 5 -> {
                    System.out.println(this);
                }
                default -> System.out.println("Invalid choice");
            }
            target.attack(this);
        }
    }

    public String listList(List<?> list) {
        if (list.isEmpty()) {
            return "None ! Learn some before you come back here !";
        }
        StringBuilder sb = new StringBuilder();
        for (Object o : list) {
            sb.append("\t").append(o).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Name: '" + name + "'\n" +
                "Hp: " + hp + '/' + maxHp + "\n" +
                "Attack Damage: " + attackDamage + "\n" +
                "Pet: " + pet + "\n" +
                "Wand: " + wand + "\n" +
                "House: " + house + "\n" +
                "Spells: " + listList(knownSpells) + "\n" +
                "Potions: " + listList(potions) + "\n" +
                "Defense: " + defense + "\n" +
                "Precision: " + precision + "\n" +
                "Potion Efficiency: " + potionEfficiency + "\n";
    }
}

