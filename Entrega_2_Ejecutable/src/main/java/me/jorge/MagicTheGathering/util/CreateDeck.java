package me.jorge.MagicTheGathering.util;

import org.json.simple.JSONObject;

import javax.swing.*;

import java.io.FileWriter;
import java.io.IOException;

public class CreateDeck{


    public static void createDeck(String deckName,JSONObject Deck) {
        // Notify the user that the deck has been created, and show the deck name and cards in the deck
        JPanel panel = new JPanel();
        // Show Deck content
        JOptionPane.showMessageDialog(panel, "Deck " + deckName + " created\n" + Deck, "Deck Created", JOptionPane.INFORMATION_MESSAGE);
        new CreateFolder().createFolder("Decks");
        // Write JSON file
        try {
            FileWriter file = new FileWriter("Decks/" + deckName + ".json");
            file.write(Deck.toJSONString());
            file.close();
            file = null;
            JOptionPane.showMessageDialog(panel, "Deck " + deckName + " created", "Deck Created", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(panel, "Error creating file", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
}
