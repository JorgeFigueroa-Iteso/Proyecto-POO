package cards.instantaneos;

public class Instantaneos {
    // Costo de Maná: 1 - 10
    private int CostoManá = 0;
    // Descripción del instantaneo
    private String Descripción = null;

    public Instantaneos(int CostoManá, String Descripción){
        setCostoManá(CostoManá);
        setDescripción(Descripción);
    }

    // Setter's
    // Costo de Maná
    public void setCostoManá(int CostoManá){
        if (CostoManá >= 0 && CostoManá <= 10) {
            this.CostoManá = CostoManá;
        } else {
            this.CostoManá = 3;
        }
    }
    // Descripción
    public void setDescripción(String Descripción){
        this.Descripción = Descripción;
    }

    // Getter's
    // Costo de Maná
    public int getCostoManá(){
        return CostoManá;
    }
    // Descripción
    public String getDescripción(){
        return Descripción;
    }

    // toString
    public String toString() {
        return "{\n"+
                "\t\"CostoManá\": \"" + CostoManá + "\",\n"+
                "\t\"Descripción\": \"" + Descripción + "\"\n"+
                "}";
    }
}
