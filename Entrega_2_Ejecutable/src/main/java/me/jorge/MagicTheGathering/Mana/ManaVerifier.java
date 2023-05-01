package me.jorge.MagicTheGathering.Mana;

public class ManaVerifier {
    public static boolean isManaSymbol(String symbol) {
        for (ManaSymbol manaSymbol : ManaSymbol.values()) {
            if (manaSymbol.toString().equals(symbol)) {
                return true;
            }
        }
        return false;
    }
}
