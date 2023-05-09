package me.jorge.MagicTheGathering.util;

import org.json.*;
import org.json.simple.JSONObject;

import javax.swing.*;

import java.io.FileWriter;
import java.io.IOException;

public class CreateDeck{


    public static void createDeck(String deckName, String card1, String card2, String card3, String card4, String card5, String card6, String card7) {
        // Notify the user that the deck has been created, and show the deck name and cards in the deck
        JPanel panel = new JPanel();
        JOptionPane.showMessageDialog(panel, "Deck Created!\n" +
                "Deck Name: " + deckName + "\n" +
                "Card 1: " + card1 + "\n" +
                "Card 2: " + card2 + "\n" +
                "Card 3: " + card3 + "\n" +
                "Card 4: " + card4 + "\n" +
                "Card 5: " + card5 + "\n" +
                "Card 6: " + card6 + "\n" +
                "Card 7: " + card7 + "\n", "Deck Created", JOptionPane.INFORMATION_MESSAGE);
        // Create a folder if it doesn't exist
        new CreateFolder().createFolder("Decks");

        // Create a file with the deck name in JSON format
//        CreateFile createFile = new CreateFile();
//        createFile.createFile("Decks/" + deckName + ".json", deckName, card1, card2, card3, card4, card5, card6, card7);

        // Create JsonSimple object
        JSONObject deck = new JSONObject();
        deck.put("deckName", deckName);
        deck.put("card1", card1);
        deck.put("card2", card2);
        deck.put("card3", card3);
        deck.put("card4", card4);
        deck.put("card5", card5);
        deck.put("card6", card6);
        deck.put("card7", card7);

        // Write JSON file
        try {
            FileWriter file = new FileWriter("Decks/" + deckName + ".json");
            file.write(deck.toJSONString());
            file.close();
            JOptionPane.showMessageDialog(panel, "Deck " + deckName + " created", "Deck Created", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(panel, "Error creating file", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
}
