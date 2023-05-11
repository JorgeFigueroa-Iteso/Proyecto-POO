package me.jorge.MagicTheGathering.Gui;

import me.jorge.MagicTheGathering.Mana.ManaSymbol;
import me.jorge.MagicTheGathering.util.CreateDeck;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class CreateDeckGUI implements ActionListener {
    public static void createDeck() {
        JFrame frame = new JFrame("Create Deck");
        frame.setSize(1100, 500);
        frame.setLocationRelativeTo(frame.getFocusOwner());

        CreateDeckGUI createDeck = new CreateDeckGUI();

        frame.add(createDeck.getPanel(frame));

        frame.setVisible(true);
    }

    public JPanel getPanel(JFrame frame) {
        // Create a panel with 7 columns and 4 rows
        JPanel panel = new JPanel();
        panel.setLayout(null);
        // Title
        JLabel title = new JLabel("Create Deck");
        title.setFont(new Font("Arial", Font.BOLD, 30));
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setBounds(0, 0, 750, 50);
        panel.add(title);

        // Card 1 Monster
        JLabel card1 = new JLabel("Monster:");
        card1.setBounds(10, 50, 80, 25);
        panel.add(card1);
        // Card Name
        JLabel card1Name = new JLabel("Name:");
        card1Name.setBounds(70, 50, 80, 25);
        panel.add(card1Name);
        JTextField card1NameText = new JTextField(20);
        card1NameText.setBounds(120, 50, 165, 25);
        panel.add(card1NameText);
        // Card Monster Type
        JLabel MonsterTypeCard1 = new JLabel("Monster:");
        MonsterTypeCard1.setBounds(305, 50, 80, 25);
        panel.add(MonsterTypeCard1);
        JComboBox<MonsterType> TipoMonstruo = new JComboBox<MonsterType>(me.jorge.MagicTheGathering.Gui.MonsterType.values());
        TipoMonstruo.setBounds(379, 50, 140, 25);
        panel.add(TipoMonstruo);
        // Card manaCost
        JLabel card1ManaCost = new JLabel("Mana Cost:");
        card1ManaCost.setBounds(540, 50, 80, 25);
        panel.add(card1ManaCost);
        JTextField card1ManaCostText = new JTextField(20);
        card1ManaCostText.setBounds(625, 50, 105, 25);
        panel.add(card1ManaCostText);
        // Card Life
        JLabel card1Life = new JLabel("Life:");
        card1Life.setBounds(740, 50, 80, 25);
        panel.add(card1Life);
        JTextField card1LifeText = new JTextField(20);
        card1LifeText.setBounds(780, 50, 105, 25);
        panel.add(card1LifeText);
        // Card Damage
        JLabel card1Damage = new JLabel("Damage:");
        card1Damage.setBounds(890, 50, 80, 25);
        panel.add(card1Damage);
        JTextField card1DamageText = new JTextField(20);
        card1DamageText.setBounds(950, 50, 105, 25);
        panel.add(card1DamageText);

        // Card 2 Mana
        JLabel card2 = new JLabel("Mana 1:");
        card2.setBounds(10, 100, 80, 25);
        panel.add(card2);
        // Mana Type
        JLabel card2ManaType = new JLabel("Mana:");
        card2ManaType.setBounds(70, 100, 80, 25);
        panel.add(card2ManaType);
        JComboBox<ManaSymbol> TipoMana = new JComboBox<ManaSymbol>(me.jorge.MagicTheGathering.Mana.ManaSymbol.values());
        TipoMana.setBounds(120, 100, 165, 25);
        panel.add(TipoMana);
        // Mana Quantity
        JLabel card2ManaQuantity = new JLabel("Total:");
        card2ManaQuantity.setBounds(305, 100, 80, 25);
        panel.add(card2ManaQuantity);
        JTextField card2ManaQuantityText = new JTextField(20);
        card2ManaQuantityText.setBounds(355, 100, 165, 25);
        panel.add(card2ManaQuantityText);

        // Card 3 Mana
        JLabel card3 = new JLabel("Mana 2:");
        card3.setBounds(10, 150, 80, 25);
        panel.add(card3);
        // Mana Type
        JLabel card3ManaType = new JLabel("Mana:");
        card3ManaType.setBounds(70, 150, 80, 25);
        panel.add(card3ManaType);
        JComboBox<ManaSymbol> TipoMana2 = new JComboBox<ManaSymbol>(me.jorge.MagicTheGathering.Mana.ManaSymbol.values());
        TipoMana2.setBounds(120, 150, 165, 25);
        panel.add(TipoMana2);
        // Mana Quantity
        JLabel card3ManaQuantity = new JLabel("Total:");
        card3ManaQuantity.setBounds(305, 150, 80, 25);
        panel.add(card3ManaQuantity);
        JTextField card3ManaQuantityText = new JTextField(20);
        card3ManaQuantityText.setBounds(355, 150, 165, 25);
        panel.add(card3ManaQuantityText);

        // Card 4 Mana
        JLabel card4 = new JLabel("Mana 3:");
        card4.setBounds(10, 200, 80, 25);
        panel.add(card4);
        // Mana Type
        JLabel card4ManaType = new JLabel("Mana:");
        card4ManaType.setBounds(70, 200, 80, 25);
        panel.add(card4ManaType);
        JComboBox<ManaSymbol> TipoMana3 = new JComboBox<ManaSymbol>(me.jorge.MagicTheGathering.Mana.ManaSymbol.values());
        TipoMana3.setBounds(120, 200, 165, 25);
        panel.add(TipoMana3);
        // Mana Quantity
        JLabel card4ManaQuantity = new JLabel("Total:");
        card4ManaQuantity.setBounds(305, 200, 80, 25);
        panel.add(card4ManaQuantity);
        JTextField card4ManaQuantityText = new JTextField(20);
        card4ManaQuantityText.setBounds(355, 200, 165, 25);
        panel.add(card4ManaQuantityText);

        // Card 5 Mana
        JLabel card5 = new JLabel("Mana 4:");
        card5.setBounds(10, 250, 80, 25);
        panel.add(card5);
        // Mana Type
        JLabel card5ManaType = new JLabel("Mana:");
        card5ManaType.setBounds(70, 250, 80, 25);
        panel.add(card5ManaType);
        JComboBox<ManaSymbol> TipoMana4 = new JComboBox<ManaSymbol>(me.jorge.MagicTheGathering.Mana.ManaSymbol.values());
        TipoMana4.setBounds(120, 250, 165, 25);
        panel.add(TipoMana4);
        // Mana Quantity
        JLabel card5ManaQuantity = new JLabel("Total:");
        card5ManaQuantity.setBounds(305, 250, 80, 25);
        panel.add(card5ManaQuantity);
        JTextField card5ManaQuantityText = new JTextField(20);
        card5ManaQuantityText.setBounds(355, 250, 165, 25);
        panel.add(card5ManaQuantityText);

        // Card 6 Mana
        JLabel card6 = new JLabel("Mana 5:");
        card6.setBounds(10, 300, 80, 25);
        panel.add(card6);
        // Mana Type
        JLabel card6ManaType = new JLabel("Mana:");
        card6ManaType.setBounds(70, 300, 80, 25);
        panel.add(card6ManaType);
        JComboBox<ManaSymbol> TipoMana5 = new JComboBox<ManaSymbol>(me.jorge.MagicTheGathering.Mana.ManaSymbol.values());
        TipoMana5.setBounds(120, 300, 165, 25);
        panel.add(TipoMana5);
        // Mana Quantity
        JLabel card6ManaQuantity = new JLabel("Total:");
        card6ManaQuantity.setBounds(305, 300, 80, 25);
        panel.add(card6ManaQuantity);
        JTextField card6ManaQuantityText = new JTextField(20);
        card6ManaQuantityText.setBounds(355, 300, 165, 25);
        panel.add(card6ManaQuantityText);

        // Card 7 Instant
        JLabel card7 = new JLabel("Instant:");
        card7.setBounds(10, 350, 80, 25);
        panel.add(card7);
        // Instant Name
        JLabel card7Name = new JLabel("Name:");
        card7Name.setBounds(70, 350, 80, 25);
        panel.add(card7Name);
        JTextField card7NameText = new JTextField(20);
        card7NameText.setBounds(120, 350, 165, 25);
        panel.add(card7NameText);
        // Instant Description
        JLabel card7Description = new JLabel("Desc:");
        card7Description.setBounds(305, 350, 80, 25);
        panel.add(card7Description);
        JTextField card7DescriptionText = new JTextField(20);
        card7DescriptionText.setBounds(355, 350, 165, 25);
        panel.add(card7DescriptionText);
        // Instant Mana Cost
        JLabel card7ManaCost = new JLabel("Mana Cost:");
        card7ManaCost.setBounds(530, 350, 80, 25);
        panel.add(card7ManaCost);
        JTextField card7ManaCostText = new JTextField(20);
        card7ManaCostText.setBounds(600, 350, 165, 25);
        panel.add(card7ManaCostText);

        TipoMonstruo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MonsterType tipo = (MonsterType) TipoMonstruo.getSelectedItem();
            }
        });

        // DeckName
        JLabel name = new JLabel("Deck Name:");
        name.setBounds(10, 400, 80, 25);
        panel.add(name);
        JTextField nameText = new JTextField(20);
        nameText.setBounds(100, 400, 165, 25);
        panel.add(nameText);

        // Create/Save Button
        JButton create = new JButton("Create/Save");
        create.setBounds(958, 430, 120, 25);
        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String deckName = nameText.getText();

                JSONArray monsterContent = new JSONArray();
                monsterContent.add(card1NameText.getText());
                monsterContent.add(TipoMonstruo.getSelectedItem().toString());
                monsterContent.add(card1ManaCostText.getText());
                monsterContent.add(card1LifeText.getText());
                monsterContent.add(card1DamageText.getText());

                JSONArray manaContent1 = new JSONArray();
                manaContent1.add(TipoMana.getSelectedItem().toString());
                manaContent1.add(card2ManaQuantityText.getText());

                JSONArray manaContent2 = new JSONArray();
                manaContent2.add(TipoMana2.getSelectedItem().toString());
                manaContent2.add(card3ManaQuantityText.getText());

                JSONArray manaContent3 = new JSONArray();
                manaContent3.add(TipoMana3.getSelectedItem().toString());
                manaContent3.add(card4ManaQuantityText.getText());

                JSONArray manaContent4 = new JSONArray();
                manaContent4.add(TipoMana4.getSelectedItem().toString());
                manaContent4.add(card5ManaQuantityText.getText());

                JSONArray manaContent5 = new JSONArray();
                manaContent5.add(TipoMana5.getSelectedItem().toString());
                manaContent5.add(card6ManaQuantityText.getText());

                JSONArray instantContent = new JSONArray();
                instantContent.add(card7NameText.getText());
                instantContent.add(card7DescriptionText.getText());
                instantContent.add(card7ManaCostText.getText());

                JSONObject DeckContent = new JSONObject();
                DeckContent.put("Monster", monsterContent);
                DeckContent.put("Mana1", manaContent1);
                DeckContent.put("Mana2", manaContent2);
                DeckContent.put("Mana3", manaContent3);
                DeckContent.put("Mana4", manaContent4);
                DeckContent.put("Mana5", manaContent5);
                DeckContent.put("Instant", instantContent);

                CreateDeck createDeck = new CreateDeck();
                createDeck.createDeck(deckName, DeckContent);

            }
        });
        panel.add(create);

        // Cancel Button
        JButton cancel = new JButton("Back");
        cancel.setBounds(7, 430, 80, 25);
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        panel.add(cancel);

        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
    }
}
