package me.jorge.MagicTheGathering.Mana;

public class Mana {
    private ManaType manaType = null;
    private int quantity = 0;

    public Mana(ManaType manaType, int quantity) {
        setManaType(manaType);
        setQuantity(quantity);
    }

    private void setQuantity(int quantity) {
        if (quantity >= 0 && quantity <= 100) {
            this.quantity = quantity;
        } else {
            this.quantity = 25;
        }
    }

    private void setManaType(ManaType manaType) {
        if (ManaVerifier.isManaSymbol(manaType.getSymbol().toString())) {
            this.manaType = manaType;
        } else {
            this.manaType = ManaType.Colorless;
        }
    }

    public ManaType getManaType() {
        return this.manaType;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String toString() {
        return "{\n" +
                "\t\"manaType\": " + this.manaType + ",\n" +
                "\t\"quantity\": " + this.quantity + "\n" +
                "}";
    }
}