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

    private String monsterCardInfo;
    private String instantCardInfo;
    private String mana1CardInfo;
    private String mana2CardInfo;
    private String mana3CardInfo;
    private String mana4CardInfo;
    private String mana5CardInfo;

    public void loadDeck(JFileChooser deck) throws RuntimeException {
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
        // Set MonsterCardInfo
        monsterCardInfo = monsterCard.toString();

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
        // Set InstantCardInfo
        instantCardInfo = instantCard.toString();

        // Parse mana1 and create
        Mana mana1 = parseMana(mana1Json);
        Mana mana2 = parseMana(mana2Json);
        Mana mana3 = parseMana(mana3Json);
        Mana mana4 = parseMana(mana4Json);
        Mana mana5 = parseMana(mana5Json);
        // Print mana
        mana1CardInfo = mana1.toString();
        mana2CardInfo = mana2.toString();
        mana3CardInfo = mana3.toString();
        mana4CardInfo = mana4.toString();
        mana5CardInfo = mana5.toString();
    }

    // ParseMana
    public Mana parseMana(String manaJson) {
        JSONArray mana = null;
        try {
            mana = (JSONArray) new JSONParser().parse(manaJson);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        // mana in position 0 = Symbol, position 1 = Quantity. Use it from String[]
        String[] manaArray = new String[2];
        // Add manaJson to manaArray
        for (int i = 0; i < mana.size(); i++) {
            manaArray[i] = String.valueOf(mana.get(i));
        }
        // Create mana
        return new Mana(ManaSymbol.valueOf(manaArray[0]), Integer.parseInt(manaArray[1]));
    }

    public String getMonsterCardInfo() {
        return monsterCardInfo;
    }

    public void setMonsterCardInfo(String monsterCardInfo) {
        this.monsterCardInfo = monsterCardInfo;
    }

    public String getInstantCardInfo() {
        return instantCardInfo;
    }

    public void setInstantCardInfo(String instantCardInfo) {
        this.instantCardInfo = instantCardInfo;
    }

    public String getMana1CardInfo() {
        return mana1CardInfo;
    }

    public void setMana1CardInfo(String mana1CardInfo) {
        this.mana1CardInfo = mana1CardInfo;
    }

    public String getMana2CardInfo() {
        return mana2CardInfo;
    }

    public void setMana2CardInfo(String mana2CardInfo) {
        this.mana2CardInfo = mana2CardInfo;
    }

    public String getMana3CardInfo() {
        return mana3CardInfo;
    }

    public void setMana3CardInfo(String mana3CardInfo) {
        this.mana3CardInfo = mana3CardInfo;
    }

    public String getMana4CardInfo() {
        return mana4CardInfo;
    }

    public void setMana4CardInfo(String mana4CardInfo) {
        this.mana4CardInfo = mana4CardInfo;
    }

    public String getMana5CardInfo() {
        return mana5CardInfo;
    }

    public void setMana5CardInfo(String mana5CardInfo) {
        this.mana5CardInfo = mana5CardInfo;
    }
}
