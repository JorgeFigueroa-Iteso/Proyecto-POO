package me.jorge.MagicTheGathering.util;

import com.google.gson.Gson;
import org.json.simple.JSONObject;

import javax.swing.*;
import java.io.FileWriter;

public class CreateFile {
    public CreateFile() {
    }

    public void createFile(String fileName, String deckName, String card1, String card2, String card3, String card4, String card5, String card6, String card7) {
        // Create GSon object
        JSONObject deck = new JSONObject();
        // String all
        String[] Cards = {card1, card2, card3, card4, card5, card6, card7};
        // Add deck name to deck
        // Add cards to deck
        for (int i = 0; i < 7; i++) {
            deck.put("Card " + (i + 1), Cards[i]);
        }
        deck.put("Deck Name", deckName);
        // Create GSon object
        Gson gson = new Gson();
        // Convert deck to JSON
        String json = gson.toJson(deck);
        // Write deck to file
        try {
            FileWriter file = new FileWriter(fileName);
            file.write(json);
            file.close();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane optionPane = new JOptionPane();
            optionPane.showMessageDialog(null, "Error Creating Deck!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
