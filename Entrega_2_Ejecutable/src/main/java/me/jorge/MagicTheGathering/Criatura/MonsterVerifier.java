package me.jorge.MagicTheGathering.Criatura;

import me.jorge.MagicTheGathering.Gui.MonsterType;

public class MonsterVerifier {
    public static boolean verifyMonsterType(MonsterType monsterType){
        for (MonsterType type : MonsterType.values()) {
            if (type == monsterType) {
                return true;
            }
        }
        return false;
    }
}
