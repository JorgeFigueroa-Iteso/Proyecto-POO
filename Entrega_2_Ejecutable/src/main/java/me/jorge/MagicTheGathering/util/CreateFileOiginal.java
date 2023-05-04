package me.jorge.MagicTheGathering.util;

import org.json.simple.JSONObject;

import javax.swing.*;
import java.io.FileWriter;

public class CreateFileOiginal {
    public CreateFileOiginal() {
    }

    public void createFile(String fileName, String deckName, String card1, String card2, String card3, String card4, String card5, String card6, String card7) {
        System.out.println("Creating file...");
        JSONObject deck = new JSONObject();
        System.out.println("Adding cards to deck...");
        deck.put("Deck Name", deckName);
        System.out.println("Added deck name to deck");
        deck.put("Card 1", 1);
        System.out.println("Added card 1 to deck");
        deck.put("Card 2", 2);
        System.out.println("Added card 2 to deck");
        deck.put("Card 3", 3);
        System.out.println("Added card 3 to deck");
        deck.put("Card 4", 4);
        System.out.println("Added card 4 to deck");
        deck.put("Card 5", 5);
        System.out.println("Added card 5 to deck");
        deck.put("Card 6", 6);
        System.out.println("Added card 6 to deck");
        deck.put("Card 7", 7);
        System.out.println("Added card 7 to deck");

        System.out.println("Writing deck to file...");
        try {
            FileWriter file = new FileWriter(fileName);
            file.write(deck.toJSONString());
            file.close();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane optionPane = new JOptionPane();
            optionPane.showMessageDialog(null, "Error Creating Deck!", "Error", JOptionPane.ERROR_MESSAGE);
        }

        JOptionPane optionPane = new JOptionPane();
        optionPane.showMessageDialog(null, "Deck Created!", "Deck Created", JOptionPane.INFORMATION_MESSAGE);

    }
}
