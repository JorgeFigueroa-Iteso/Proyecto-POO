package me.jorge.MagicTheGathering.Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MagicTheGathering implements ActionListener {
    public static void main(String[] args) {
        // Graphic Interface
        JFrame frame = new JFrame("Magic The Gathering");
        frame.setContentPane(new MagicTheGathering().getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    public JPanel getPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Title
        JLabel title = new JLabel("Magic The Gathering");
        title.setFont(new Font("Arial", Font.BOLD, 30));
        title.setHorizontalAlignment(JLabel.CENTER);
        panel.add(title, BorderLayout.NORTH);

        // Buttons
        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(2, 2));

        JButton createDeck = new JButton("Create Deck");
        createDeck.addActionListener(this);
        buttons.add(createDeck);

        JButton useDeck = new JButton("Use Deck");
        useDeck.addActionListener(this);
        buttons.add(useDeck);

        JButton saveDeck = new JButton("Save Deck");
        saveDeck.addActionListener(this);
        buttons.add(saveDeck);

        JButton loadDeck = new JButton("Load Deck");
        loadDeck.addActionListener(this);
        buttons.add(loadDeck);



        panel.add(buttons, BorderLayout.CENTER);

        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Create Deck")) {
            CreateDeck.createDeck();
        } else if (e.getActionCommand().equals("Use Deck")) {
            // UseDeck.useDeck();
        } else if (e.getActionCommand().equals("Save Deck")) {
            // SaveDeck.saveDeck();
        } else if (e.getActionCommand().equals("Load Deck")) {
            // LoadDeck.loadDeck();
        }
    }

    //q: how to make the buttons do something?
    //a: add an action listener to the button
}
