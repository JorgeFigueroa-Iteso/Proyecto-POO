package cards.mana;

public class ManáVerifier {
    public static boolean isManáSymbol(String symbol) {
        return symbol.equals("W") || symbol.equals("U") || symbol.equals("B") || symbol.equals("R") || symbol.equals("G") || symbol.equals("C");
    }
}
