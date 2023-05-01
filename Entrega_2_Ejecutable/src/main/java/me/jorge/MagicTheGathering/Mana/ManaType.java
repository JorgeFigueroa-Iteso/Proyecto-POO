package me.jorge.MagicTheGathering.Mana;

public enum ManaType {
    White(ManaSymbol.W),
    Blue(ManaSymbol.U),
    Black(ManaSymbol.B),
    Red(ManaSymbol.R),
    Green(ManaSymbol.G),
    Colorless(ManaSymbol.C);

    private ManaSymbol symbol = null;

    ManaType(ManaSymbol symbol) {
        this.symbol = symbol;
    }

    public ManaSymbol getSymbol() {
        return this.symbol;
    }

    public String toString() {
        return "{\n" +
                "\t\"mana\": \"" + this.name() + "\",\n" +
                "\t\"symbol\": \"" + this.symbol + "\"\n" +
                "}";
    }
}
