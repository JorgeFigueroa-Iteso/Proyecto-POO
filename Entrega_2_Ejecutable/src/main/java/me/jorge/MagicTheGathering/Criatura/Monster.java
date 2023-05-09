package me.jorge.MagicTheGathering.Criatura;

import me.jorge.MagicTheGathering.Gui.MonsterType;

public class Monster {
    private String name;
    private MonsterType type;
    private int manaCost;
    private int damage;
    private int life;

    public Monster(String name, MonsterType type, int manaCost, int damage, int life) {
        this.name = name;
        setType(type);
        this.manaCost = manaCost;
        this.damage = damage;
        this.life = life;
    }

    private void setType(MonsterType type) {
        if (MonsterVerifier.verifyMonsterType(type)) {
            this.type = type;
        } else {
            this.type = MonsterType.Hechicero;
        }
    }

    // Getters
    public String getName() {
        return this.name;
    }
    public MonsterType getType() {
        return this.type;
    }
    public int getManaCost() {
        return this.manaCost;
    }
    public int getDamage() {
        return this.damage;
    }
    public int getLife() {
        return this.life;
    }
}
