package me.jorge.MagicTheGathering.Gui;

import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;
import me.jorge.MagicTheGathering.util.CreateDeck;
import me.jorge.MagicTheGathering.util.CreateFile;
import me.jorge.MagicTheGathering.util.CreateFileOiginal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class CreateDeckGUI implements ActionListener {
    public static void createDeck() {
        JFrame frame = new JFrame("Create Deck");
        frame.setSize(750, 500);

        CreateDeckGUI createDeck = new CreateDeckGUI();

        frame.add(createDeck.getPanel(frame));

        frame.setVisible(true);
    }

    public JPanel getPanel(JFrame frame) {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        // Title
        JLabel title = new JLabel("Create Deck");
        title.setBounds(325, 10, 100, 20);
        title.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(title);

        // 7 Cards in a deck
        // Card 1
        JLabel card1 = new JLabel("Card 1:");
        card1.setBounds(10, 50, 80, 25);
        panel.add(card1);
        // Card Name
        JLabel card1Name = new JLabel("Name:");
        card1Name.setBounds(70, 50, 80, 25);
        panel.add(card1Name);
        JTextField card1NameText = new JTextField(20);
        card1NameText.setBounds(120, 50, 165, 25);
        panel.add(card1NameText);
        // Card Description
        JLabel card1Description = new JLabel("Desc:");
        card1Description.setBounds(305, 50, 80, 25);
        panel.add(card1Description);
        JTextField card1DescriptionText = new JTextField(20);
        card1DescriptionText.setBounds(355, 50, 165, 25);
        panel.add(card1DescriptionText);
        // Card Type
        JLabel card1Type = new JLabel("Type:");
        card1Type.setBounds(540, 50, 80, 25);
        panel.add(card1Type);
        JTextField card1TypeText = new JTextField(20);
        card1TypeText.setBounds(590, 50, 140, 25);
        panel.add(card1TypeText);
        // Card 2
        JLabel card2 = new JLabel("Card 2:");
        card2.setBounds(10, 100, 80, 25);
        panel.add(card2);
        // Card Name
        JLabel card2Name = new JLabel("Name:");
        card2Name.setBounds(70, 100, 80, 25);
        panel.add(card2Name);
        JTextField card2NameText = new JTextField(20);
        card2NameText.setBounds(120, 100, 165, 25);
        panel.add(card2NameText);
        // Card Description
        JLabel card2Description = new JLabel("Desc:");
        card2Description.setBounds(305, 100, 80, 25);
        panel.add(card2Description);
        JTextField card2DescriptionText = new JTextField(20);
        card2DescriptionText.setBounds(355, 100, 165, 25);
        panel.add(card2DescriptionText);
        // Card Type
        JLabel card2Type = new JLabel("Type:");
        card2Type.setBounds(540, 100, 80, 25);
        panel.add(card2Type);
        JTextField card2TypeText = new JTextField(20);
        card2TypeText.setBounds(590, 100, 140, 25);
        panel.add(card2TypeText);
        // Card 3
        JLabel card3 = new JLabel("Card 3:");
        card3.setBounds(10, 150, 80, 25);
        panel.add(card3);
        // Card Name
        JLabel card3Name = new JLabel("Name:");
        card3Name.setBounds(70, 150, 80, 25);
        panel.add(card3Name);
        JTextField card3NameText = new JTextField(20);
        card3NameText.setBounds(120, 150, 165, 25);
        panel.add(card3NameText);
        // Card Description
        JLabel card3Description = new JLabel("Desc:");
        card3Description.setBounds(305, 150, 80, 25);
        panel.add(card3Description);
        JTextField card3DescriptionText = new JTextField(20);
        card3DescriptionText.setBounds(355, 150, 165, 25);
        panel.add(card3DescriptionText);
        // Card Type
        JLabel card3Type = new JLabel("Type:");
        card3Type.setBounds(540, 150, 80, 25);
        panel.add(card3Type);
        JTextField card3TypeText = new JTextField(20);
        card3TypeText.setBounds(590, 150, 140, 25);
        panel.add(card3TypeText);
        // Card 4
        JLabel card4 = new JLabel("Card 4:");
        card4.setBounds(10, 200, 80, 25);
        panel.add(card4);
        // Card Name
        JLabel card4Name = new JLabel("Name:");
        card4Name.setBounds(70, 200, 80, 25);
        panel.add(card4Name);
        JTextField card4NameText = new JTextField(20);
        card4NameText.setBounds(120, 200, 165, 25);
        panel.add(card4NameText);
        // Card Description
        JLabel card4Description = new JLabel("Desc:");
        card4Description.setBounds(305, 200, 80, 25);
        panel.add(card4Description);
        JTextField card4DescriptionText = new JTextField(20);
        card4DescriptionText.setBounds(355, 200, 165, 25);
        panel.add(card4DescriptionText);
        // Card Type
        JLabel card4Type = new JLabel("Type:");
        card4Type.setBounds(540, 200, 80, 25);
        panel.add(card4Type);
        JTextField card4TypeText = new JTextField(20);
        card4TypeText.setBounds(590, 200, 140, 25);
        panel.add(card4TypeText);
        // Card 5
        JLabel card5 = new JLabel("Card 5:");
        card5.setBounds(10, 250, 80, 25);
        panel.add(card5);
        // Card Name
        JLabel card5Name = new JLabel("Name:");
        card5Name.setBounds(70, 250, 80, 25);
        panel.add(card5Name);
        JTextField card5NameText = new JTextField(20);
        card5NameText.setBounds(120, 250, 165, 25);
        panel.add(card5NameText);
        // Card Description
        JLabel card5Description = new JLabel("Desc:");
        card5Description.setBounds(305, 250, 80, 25);
        panel.add(card5Description);
        JTextField card5DescriptionText = new JTextField(20);
        card5DescriptionText.setBounds(355, 250, 165, 25);
        panel.add(card5DescriptionText);
        // Card Type
        JLabel card5Type = new JLabel("Type:");
        card5Type.setBounds(540, 250, 80, 25);
        panel.add(card5Type);
        JTextField card5TypeText = new JTextField(20);
        card5TypeText.setBounds(590, 250, 140, 25);
        panel.add(card5TypeText);
        // Card 6
        JLabel card6 = new JLabel("Card 6:");
        card6.setBounds(10, 300, 80, 25);
        panel.add(card6);
        // Card Name
        JLabel card6Name = new JLabel("Name:");
        card6Name.setBounds(70, 300, 80, 25);
        panel.add(card6Name);
        JTextField card6NameText = new JTextField(20);
        card6NameText.setBounds(120, 300, 165, 25);
        panel.add(card6NameText);
        // Card Description
        JLabel card6Description = new JLabel("Desc:");
        card6Description.setBounds(305, 300, 80, 25);
        panel.add(card6Description);
        JTextField card6DescriptionText = new JTextField(20);
        card6DescriptionText.setBounds(355, 300, 165, 25);
        panel.add(card6DescriptionText);
        // Card Type
        JLabel card6Type = new JLabel("Type:");
        card6Type.setBounds(540, 300, 80, 25);
        panel.add(card6Type);
        JTextField card6TypeText = new JTextField(20);
        card6TypeText.setBounds(590, 300, 140, 25);
        panel.add(card6TypeText);
        // Card 7
        JLabel card7 = new JLabel("Card 7:");
        card7.setBounds(10, 350, 80, 25);
        panel.add(card7);
        // Card Name
        JLabel card7Name = new JLabel("Name:");
        card7Name.setBounds(70, 350, 80, 25);
        panel.add(card7Name);
        JTextField card7NameText = new JTextField(20);
        card7NameText.setBounds(120, 350, 165, 25);
        panel.add(card7NameText);
        // Card Description
        JLabel card7Description = new JLabel("Desc:");
        card7Description.setBounds(305, 350, 80, 25);
        panel.add(card7Description);
        JTextField card7DescriptionText = new JTextField(20);
        card7DescriptionText.setBounds(355, 350, 165, 25);
        panel.add(card7DescriptionText);
        // Card Type
        JLabel card7Type = new JLabel("Type:");
        card7Type.setBounds(540, 350, 80, 25);
        panel.add(card7Type);
        JTextField card7TypeText = new JTextField(20);
        card7TypeText.setBounds(590, 350, 140, 25);
        panel.add(card7TypeText);

        JLabel MonsterType = new JLabel("Monster Type:");
        JComboBox<monster  >

        // DeckName
        JLabel name = new JLabel("Deck Name:");
        name.setBounds(10, 430, 80, 25);
        panel.add(name);
        JTextField nameText = new JTextField(20);
        nameText.setBounds(100, 430, 165, 25);
        panel.add(nameText);

        // Create/Save Button
        JButton create = new JButton("Create/Save");
        create.setBounds(608, 430, 120, 25);
        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String deckName = nameText.getText();
                String card1 = card1NameText.getText() + " " + card1DescriptionText.getText() + " " + card1TypeText.getText();
                String card2 = card2NameText.getText() + " " + card2DescriptionText.getText() + " " + card2TypeText.getText();
                String card3 = card3NameText.getText() + " " + card3DescriptionText.getText() + " " + card3TypeText.getText();
                String card4 = card4NameText.getText() + " " + card4DescriptionText.getText() + " " + card4TypeText.getText();
                String card5 = card5NameText.getText() + " " + card5DescriptionText.getText() + " " + card5TypeText.getText();
                String card6 = card6NameText.getText() + " " + card6DescriptionText.getText() + " " + card6TypeText.getText();
                String card7 = card7NameText.getText() + " " + card7DescriptionText.getText() + " " + card7TypeText.getText();

                CreateDeck createDeck = new CreateDeck();
                createDeck.createDeck(deckName, card1, card2, card3, card4, card5, card6, card7);

            }
        });
        panel.add(create);

        // Cancel Button
        JButton cancel = new JButton("Cancel");
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

        if (action.equals("Create/Save")) {

        }
    }
}
