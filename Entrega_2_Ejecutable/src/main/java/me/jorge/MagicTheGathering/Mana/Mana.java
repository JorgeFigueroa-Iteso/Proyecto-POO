package me.jorge.MagicTheGathering.Mana;

public class Mana {
    private ManaSymbol manaType = null;
    private int quantity = 0;

    public Mana(ManaSymbol manaType, int quantity) {
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

    private void setManaType(ManaSymbol manaType) {
        if (manaType != null) {
            this.manaType = manaType;
        } else {
            this.manaType = ManaSymbol.C;
        }
    }

    public ManaType getManaType() {
        return this.manaType.getManaType();
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