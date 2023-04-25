package cards.mana;

public enum ManáType {
    BLANCO(ManáSymbol.W),
    AZUL(ManáSymbol.U),
    NEGRO(ManáSymbol.B),
    ROJO(ManáSymbol.R),
    VERDE(ManáSymbol.G),
    NOCOLOR(ManáSymbol.C);

    private ManáSymbol Symbol = null;
    private ManáType(ManáSymbol Symbol){
        this.Symbol = Symbol;
    }

    public ManáSymbol getSymbol(){
        return Symbol;
    }

    public String toString(){
        return "{\n"+
                "\t\"maná\": \"" + name() + "\",\n"+
                "\t\"simbolo\": \"" + Symbol + "\n" +
                "}";
    }

}
