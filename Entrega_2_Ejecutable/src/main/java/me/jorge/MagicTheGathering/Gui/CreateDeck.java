package me.jorge.MagicTheGathering.Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateDeck implements ActionListener {
    public static void createDeck() {
        JFrame frame = new JFrame("Create Deck");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CreateDeck createDeck = new CreateDeck();
        frame.add(createDeck.getPanel());

        frame.setVisible(true);
    }

    public JPanel getPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel title = new JLabel("Create Deck");
        title.setBounds(20, 10, 100, 20);
        panel.add(title);

        JLabel name = new JLabel("Name:");
        name.setBounds(10, 50, 80, 25);
        panel.add(name);

        JTextField nameText = new JTextField(20);
        nameText.setBounds(100, 50, 165, 25);
        panel.add(nameText);

        JLabel description = new JLabel("Description:");
        description.setBounds(10, 80, 80, 25);
        panel.add(description);

        JTextField descriptionText = new JTextField(20);
        descriptionText.setBounds(100, 80, 165, 25);
        panel.add(descriptionText);

        JLabel cards = new JLabel("Cards:");
        cards.setBounds(10, 110, 80, 25);
        panel.add(cards);

        JTextField cardsText = new JTextField(20);
        cardsText.setBounds(100, 110, 165, 25);
        panel.add(cardsText);

        JButton create = new JButton("Create");
        create.setBounds(10, 140, 80, 25);
        create.addActionListener(this);
        panel.add(create);

        JButton cancel = new JButton("Cancel");
        cancel.setBounds(100, 140, 80, 25);
        cancel.addActionListener(this);
        panel.add(cancel);

        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
