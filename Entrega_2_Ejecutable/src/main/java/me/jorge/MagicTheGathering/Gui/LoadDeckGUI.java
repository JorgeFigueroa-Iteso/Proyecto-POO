package me.jorge.MagicTheGathering.Gui;

import me.jorge.MagicTheGathering.util.LoadDeck;

import javax.swing.*;
import java.awt.*;

public class LoadDeckGUI {
    public static void loadDeck(String name, JFileChooser deck) {
        JFrame frame = new JFrame("Load Deck");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize((int) (screenSize.getWidth() * 0.9), (int) (screenSize.getHeight() * 0.25));
        frame.setLocationRelativeTo(frame.getFocusOwner());


        frame.add(new LoadDeckGUI().getPanel2(frame, name, deck));

        frame.setVisible(true);
    }

    private JPanel getPanel2(JFrame frame, String name, JFileChooser deck) {
        LoadDeck loadDeck = new LoadDeck();
        loadDeck.loadDeck(deck);

        // Create a panel with 7 columns and 4 rows
        //JPanel for 7 cards
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 8));
        panel.setBackground(Color.BLACK);
        //Title
        // Separate Title by spaces
        String[] titleName = name.split(" ");
        // remoce ".json" from the last word
        titleName[titleName.length - 1] = titleName[titleName.length - 1].substring(0, titleName[titleName.length - 1].length() - 5);
        String titleText = "";
        for (String s : titleName) {
            titleText += s + "<br>";
        }
        JLabel title = new JLabel("<html>" + titleText + "</html>");
        title.setFont(new Font("Arial", Font.BOLD, 30));
        title.setHorizontalAlignment(JLabel.CENTER);
        panel.add(title);

        // Monster Card Info from loadDeck object
        String monsterCardInfo = loadDeck.getMonsterCardInfo();
        // Instant Card Info from loadDeck object
        String instantCardInfo = loadDeck.getInstantCardInfo();
        // Mana1 Card Info from loadDeck object
        String mana1CardInfo = loadDeck.getMana1CardInfo();
        String mana2CardInfo = loadDeck.getMana2CardInfo();
        String mana3CardInfo = loadDeck.getMana3CardInfo();
        String mana4CardInfo = loadDeck.getMana4CardInfo();
        String mana5CardInfo = loadDeck.getMana5CardInfo();

        JPanel card1 = new JPanel();
        JPanel card2 = new JPanel();
        JPanel card3 = new JPanel();
        JPanel card4 = new JPanel();
        JPanel card5 = new JPanel();
        JPanel card6 = new JPanel();
        JPanel card7 = new JPanel();

        card1 = setMonsPos(card1, monsterCardInfo, panel);
        card2 = setInstPos(card2, instantCardInfo, panel);
        card3 = setManaPos(card3, mana1CardInfo, panel);
        card4 = setManaPos(card4, mana2CardInfo, panel);
        card5 = setManaPos(card5, mana3CardInfo, panel);
        card6 = setManaPos(card6, mana4CardInfo, panel);
        card7 = setManaPos(card7, mana5CardInfo, panel);

        return panel;
    }

    private JPanel setMonsPos(JPanel card, String cardInfo, JPanel panel) {
        card.setLayout(new BorderLayout());
        card.setBackground(Color.WHITE);
        // <br> in "Type", "Mana", "Damage" and "HP"
        cardInfo = cardInfo.replace("Type", "<br><br>Type");
        cardInfo = cardInfo.replace("Mana", "<br><br>Mana");
        cardInfo = cardInfo.replace("Damage", "<br><br>Damage");
        cardInfo = cardInfo.replace("HP", "<br><br>HP");
        JLabel monsterCard = new JLabel("<html>" + cardInfo + "</html>");
        monsterCard.setFont(new Font("Arial", Font.BOLD, 14));
        monsterCard.setHorizontalAlignment(JLabel.LEFT);
        card.add(monsterCard, BorderLayout.CENTER);
        panel.add(card);
        return panel;
    }
    private JPanel setInstPos(JPanel card, String cardInfo, JPanel panel) {
        card.setLayout(new BorderLayout());
        card.setBackground(Color.WHITE);
        // <br> in "Description" and "Mana"
        cardInfo = cardInfo.replace("Description", "<br><br>Description");
        cardInfo = cardInfo.replace("Mana", "<br><br>Mana");
        JLabel monsterCard = new JLabel("<html>" + cardInfo + "</html>");
        monsterCard.setFont(new Font("Arial", Font.BOLD, 14));
        monsterCard.setHorizontalAlignment(JLabel.LEFT);
        card.add(monsterCard, BorderLayout.CENTER);
        panel.add(card);
        return panel;
    }
    private JPanel setManaPos(JPanel card, String cardInfo, JPanel panel) {
        card.setLayout(new BorderLayout());
        card.setBackground(Color.WHITE);
        // <br> in "Mana" and "Quantity"
        cardInfo = cardInfo.replace("Mana", "<br><br>Mana");
        cardInfo = cardInfo.replace("Quantity", "<br><br>Quantity");
        JLabel monsterCard = new JLabel("<html>" + cardInfo + "</html>");
        monsterCard.setFont(new Font("Arial", Font.BOLD, 14));
        monsterCard.setHorizontalAlignment(JLabel.LEFT);
        card.add(monsterCard, BorderLayout.CENTER);
        panel.add(card);
        return panel;
    }
}