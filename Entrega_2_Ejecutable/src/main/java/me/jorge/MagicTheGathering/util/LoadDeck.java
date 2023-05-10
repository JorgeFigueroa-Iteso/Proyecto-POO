package me.jorge.MagicTheGathering.util;

import me.jorge.MagicTheGathering.Criatura.Monster;
import me.jorge.MagicTheGathering.Gui.MonsterType;

import me.jorge.MagicTheGathering.Instantaneos.Instant;
import me.jorge.MagicTheGathering.Mana.Mana;
import me.jorge.MagicTheGathering.Mana.ManaSymbol;
import me.jorge.MagicTheGathering.Mana.ManaType;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.swing.*;

import java.io.FileReader;
import java.io.IOException;

public class LoadDeck {

    public void loadDeck(String name, JFileChooser deck) throws RuntimeException {
        // Parse file
        Object obj;
        try {
            obj = new JSONParser().parse(new FileReader(deck.getSelectedFile().getPath()));
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
        JSONObject JSONDeck = (JSONObject) obj;

        String monsterJson = String.valueOf(JSONDeck.get("Monster"));
        String mana1Json = String.valueOf(JSONDeck.get("Mana1"));
        String mana2Json = String.valueOf(JSONDeck.get("Mana2"));
        String mana3Json = String.valueOf(JSONDeck.get("Mana3"));
        String mana4Json = String.valueOf(JSONDeck.get("Mana4"));
        String mana5Json = String.valueOf(JSONDeck.get("Mana5"));
        String instantJson = String.valueOf(JSONDeck.get("Instant"));

        // Parse monster
        JSONArray monster = null;
        try {
            monster = (JSONArray) new JSONParser().parse(monsterJson);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        // monster in position 0 = name, position 1 = type, position 2 = manaCost, position 3 = damage, position 4 = life. Use it from String[]
        String[] monsterArray = new String[5];
        // Add monsterJson to monsterArray
        for (int i = 0; i < monster.size(); i++) {
            monsterArray[i] = String.valueOf(monster.get(i));
        }
        // Create monster
        Monster monsterCard = new Monster(monsterArray[0], MonsterType.valueOf(monsterArray[1]), Integer.parseInt(monsterArray[2]), Integer.parseInt(monsterArray[3]), Integer.parseInt(monsterArray[4]));
        System.out.println(monsterCard);

        // Parse Instant
        JSONArray instant = null;
        try {
            instant = (JSONArray) new JSONParser().parse(instantJson);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        // instant in position 0 = name, position 1 = description, position 2 = manaCost. Use it from String[]
        String[] instantArray = new String[3];
        // Add instantJson to instantArray
        for (int i = 0; i < instant.size(); i++) {
            instantArray[i] = String.valueOf(instant.get(i));
        }
        // Create instant
        Instant instantCard = new Instant(instantArray[0], instantArray[1], Integer.parseInt(instantArray[2]));
        System.out.println(instantCard);



    }
}
