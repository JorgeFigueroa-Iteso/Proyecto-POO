package cards.monsters;

import cards.mana.*;

public class Monstruo {
    // Nombre: "Dragon de Fuego", "Demonio de Hielo", etc.
    private String nombre;

    // Vida: 20
    private double vida = 0;

    // Tipo de monstruo: Dragon, Demonio, etc.
    private MonsterType tipoMonstruo = null;

    // Descripción del monstruo: "Tiene alas, color, etc."
    private String descripcion = null;

    // Costo Maná: 0 - 10
    private int costoMana = 0;

    // Tipo de Maná: W, U, B, R, G, C
    private ManáType tipoMana = null;

    // Fuerza y Resistencia: 0 - 10 | 0 - 10
    private int fuerza = 0;
    private int resistencia = 0;

    // Tipo de ataque: Golpe, Stun, etc. | Tiene 3 tipos de ataque en total 1 de ellos es especial (El usuario puede elegir el tipo de ataque)
    private String[] tipoAtaque = new String[3];

    public Monstruo(String nombre, double vida, MonsterType tipoMonstruo, String descripcion, int costoMana, ManáType tipoMana, int fuerza, int resistencia, String tipoAtaque) {
        setNombre(nombre);
        setVida(vida);
        setTipoMonstruo(tipoMonstruo);
        setDescripcion(descripcion);
        setCostoMana(costoMana);
        setTipoMana(tipoMana);
        setFuerza(fuerza);
        setResistencia(resistencia);
        setTipoAtaque(tipoAtaque);

    }

    // Setter's
    // Nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Vida
    public void setVida(double vida) {
        if (vida >= 0 && vida <= 20) {
            this.vida = vida;
        } else {
            this.vida = 20;
        }
    }
    // Tipo de monstruo
    public void setTipoMonstruo(MonsterType tipoMonstruo) {
        this.tipoMonstruo = tipoMonstruo;
    }
    // Descripción
    public void setDescripcion(String descripcion) {
        if (descripcion.length() > 0) {
            this.descripcion = descripcion;
        } else {
            this.descripcion = "No se conoce nada de este monstruo...";
        }
    }
    // Costo Maná
    public void setCostoMana(int costoMana) {
        if (costoMana >= 0 && costoMana <= 10) {
            this.costoMana = costoMana;
        } else {
            this.costoMana = 0;
        }
    }
    // Tipo de Maná
    public void setTipoMana(ManáType tipoMana) {
        // If ManáVerifier.isManáSymbol(tipoMana) == true
        if (ManáVerifier.isManáSymbol(tipoMana.getSymbol().toString())) {
            this.tipoMana = tipoMana;
        } else {
            this.tipoMana = ManáType.NOCOLOR;
        }
    }
    // Fuerza
    public void setFuerza(int fuerza) {
        if (fuerza >= 0 && fuerza <= 10) {
            this.fuerza = fuerza;
        } else {
            this.fuerza = 7;
        }
    }
    // Resistencia
    public void setResistencia(int resistencia) {
        if (resistencia >= 0 && resistencia <= 10) {
            this.resistencia = resistencia;
        } else {
            this.resistencia = 7;
        }
    }
    // Tipo de ataque
    public void setTipoAtaque(String tipoAtaque) {
        if (tipoAtaque.length() > 0) {
            this.tipoAtaque[0] = tipoAtaque;
        } else {
            this.tipoAtaque[0] = "Golpe";
        }
        this.tipoAtaque[1] = "Stun";
        this.tipoAtaque[2] = "Robo de vida";
    }

    // Getter's
    // Nombre
    public String getNombre() {
        return nombre;
    }
    // Vida
    public double getVida() {
        return vida;
    }
    // Tipo de monstruo
    public MonsterType getTipoMonstruo() {
        return tipoMonstruo;
    }
    // Descripción
    public String getDescripcion() {
        return descripcion;
    }
    // Costo Maná
    public int getCostoMana() {
        return costoMana;
    }
    // Tipo de Maná
    public ManáType getTipoMana() {
        return tipoMana;
    }
    // Fuerza
    public int getFuerza() {
        return fuerza;
    }
    // Resistencia
    public int getResistencia() {
        return resistencia;
    }
    // Tipo de ataque
    public String[] getTipoAtaque() {
        return tipoAtaque;
    }

    // toString
    public String toString() {
        return "{\n"+
                "\t\"nombre\": \"" + nombre + "\",\n"+
                "\t\"vida\": \"" + vida + "\",\n"+
                "\t\"tipoMonstruo\": \"" + tipoMonstruo + "\",\n"+
                "\t\"descripcion\": \"" + descripcion + "\",\n"+
                "\t\"costoMana\": \"" + costoMana + "\",\n"+
                "\t\"tipoMana\": \"" + tipoMana + "\",\n"+
                "\t\"fuerza\": \"" + fuerza + "\",\n"+
                "\t\"resistencia\": \"" + resistencia + "\",\n"+
                "\t\"tipoAtaque\": \"" + tipoAtaque + "\"\n"+
                "}";
    }

}
