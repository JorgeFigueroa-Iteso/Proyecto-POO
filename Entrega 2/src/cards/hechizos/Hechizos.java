package cards.hechizos;

public class Hechizos {
    // Coste de maná: 1 - 10
    private int CostoManá = 0;
    // Descripción del hechizo
    private String Descripción = null;
    // Daño del hechiz: 1 - 20
    private double Daño = 0;

    public Hechizos(int CostoManá, String Descripción, double Daño){
        setCostoManá(CostoManá);
        setDescripción(Descripción);
        setDaño(Daño);
    }

    // Setter's
    // Costo de maná
    public void setCostoManá(int CostoManá){
        if (CostoManá >= 0 && CostoManá <= 10) {
            this.CostoManá = CostoManá;
        } else {
            this.CostoManá = 10;
        }
    }
    // Descripción
    public void setDescripción(String Descripción){
        this.Descripción = Descripción;
    }
    // Daño
    public void setDaño(double Daño){
        if (Daño >= 0 && Daño <= 20) {
            this.Daño = Daño;
        } else {
            this.Daño = 20;
        }
    }

    // Getter's
    // Costo de maná
    public int getCostoManá(){
        return CostoManá;
    }
    // Descripción
    public String getDescripción(){
        return Descripción;
    }
    // Daño
    public double getDaño(){
        return Daño;
    }

    // toString
    public String toString() {
        return "{\n"+
                "\t\"CostoManá\": \"" + CostoManá + "\",\n"+
                "\t\"Descripción\": \"" + Descripción + "\",\n"+
                "\t\"Daño\": \"" + Daño + "\"\n"+
                "}";
    }
}
