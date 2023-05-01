package me.jorge.MagicTheGathering.Criatura;

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
