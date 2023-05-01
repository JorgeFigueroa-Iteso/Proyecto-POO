package me.jorge.MagicTheGathering.Criatura;

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
}
