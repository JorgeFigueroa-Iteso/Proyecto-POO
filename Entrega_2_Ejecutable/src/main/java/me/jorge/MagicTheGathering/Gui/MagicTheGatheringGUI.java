package me.jorge.MagicTheGathering.Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MagicTheGatheringGUI implements ActionListener {
    public static void main(String[] args) {
        // Graphic Interface
        JFrame frame = new JFrame("Magic The Gathering");
        frame.setSize(500, 250);
        frame.pack();
        frame.setContentPane(new MagicTheGatheringGUI().getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        createDeck.setBounds(70, 100, 350, 30);
        panel.add(createDeck);

        JButton useDeck = new JButton("Delete Deck");
        useDeck.addActionListener(this);
        useDeck.setBounds(70, 145, 160, 30);
        panel.add(useDeck);

        JButton loadDeck = new JButton("Use Deck");
        loadDeck.addActionListener(this);
        loadDeck.setBounds(260, 145, 160, 30);
        panel.add(loadDeck);

        JButton exit = new JButton("Exit");
        exit.addActionListener(this);
        exit.setBounds(400, 182, 80, 25);
        panel.add(exit);


        panel.add(buttons, BorderLayout.CENTER);

        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Create Deck")) {
            CreateDeckGUI.createDeck();
        } else if (e.getActionCommand().equals("Delete Deck")) {
            // DeleteDeckGUI.deleteDeck();
        } else if (e.getActionCommand().equals("Use Deck")) {
             LoadDeckGUI.loadDeck();
        } else if (e.getActionCommand().equals("Exit")) {
            System.exit(0);
        }
    }

    //q: how to make the buttons do something?
    //a: add an action listener to the button
}
