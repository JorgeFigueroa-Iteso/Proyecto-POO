package me.jorge.MagicTheGathering.Mana;

public enum ManaSymbol {
    W, U, B, R, G, C;

    public ManaType getManaType() {
        switch (this) {
            case W:
                return ManaType.White;
            case U:
                return ManaType.Blue;
            case B:
                return ManaType.Black;
            case R:
                return ManaType.Red;
            case G:
                return ManaType.Green;
            case C:
                return ManaType.Colorless;
            default:
                return ManaType.Colorless;
        }
    }
}
