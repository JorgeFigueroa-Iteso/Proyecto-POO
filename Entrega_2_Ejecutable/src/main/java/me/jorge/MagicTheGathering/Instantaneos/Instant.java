package me.jorge.MagicTheGathering.Instantaneos;

public class Instant {
    private String name = null;
    private String description = null;
    private int manaCost;
    private String type = "Instantaneo";

    public Instant(String name, String description, int manaCost) {
        setName(name);
        setDescription(description);
        setManaCost(manaCost);
    }

    private void setManaCost(int manaCost) {
        if (manaCost >= 0 && manaCost <= 10) {
            this.manaCost = manaCost;
        } else {
            this.manaCost = 3;
        }
    }

    private void setName(String name) {
        if (name.length() >= 3 && name.length() <= 50) {
            this.name = name;
        } else {
            this.name = "Instantaneo";
        }
    }

    private void setDescription(String description) {
        if (description.length() >= 3 && description.length() <= 100) {
            this.description = description;
        } else {
            this.description = "Descripción";
        }
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public int getManaCost() {
        return this.manaCost;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        return "{\n" +
                "\t\"name\": \"" + this.name + "\",\n" +
                "\t\"description\": \"" + this.description + "\",\n" +
                "\t\"manaCost\": \"" + this.manaCost + "\",\n" +
                "\t\"type\": \"" + this.type + "\"\n" +
                "}";
    }

}
