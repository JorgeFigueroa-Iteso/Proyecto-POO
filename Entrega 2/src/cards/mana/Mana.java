package cards.mana;

public class Mana {
    // Cantidad de maná: 1 - 100
    private int mana = 0;

    // Tipo de Maná
    private ManáType manaType = null;

    // Crea la carta de maná
    public Mana(int Maná, ManáType type) {
        setMana(Maná);
        setManaType(type);
    }

    // Setter's
    // Cantidad de maná
    public void setMana(int mana) {
        if (mana >= 0 && mana <= 100) {
            this.mana = mana;
        } else {
            this.mana = 25;
        }
    }
    // Maná Type
    public void setManaType(ManáType manaType) {
        if (ManáVerifier.isManáSymbol(manaType.getSymbol().toString())) {
            this.manaType = manaType;
        } else {
            this.manaType = ManáType.NOCOLOR;
        }
    }

    // Getter's
    // Cantidad de maná
    public int getMana() {
        return mana;
    }
    // Maná Type
    public ManáType getManaType() {
        return manaType;
    }

    // toString
    public String toString() {
        return "{\n"+
                "\t\"mana\": \"" + mana + "\",\n"+
                "\t\"manáType\": \"" + manaType + "\"\n"+
                "}";
    }
}
