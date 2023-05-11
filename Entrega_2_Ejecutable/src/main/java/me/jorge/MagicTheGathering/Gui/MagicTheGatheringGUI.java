package me.jorge.MagicTheGathering.Gui;

import me.jorge.MagicTheGathering.util.CreateFolder;

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

        // Author's: Alvarez Camarena Juan Pablo, Figueroa Maya Jorge Ramon
        JLabel authors = new JLabel("<html>- Alvarez Camarena Juan Pablo<br>- Figueroa Maya Jorge Ramon</html>");
        authors.setFont(new Font("Arial", Font.BOLD, 10));
        authors.setHorizontalAlignment(JLabel.LEFT);
        panel.add(authors, BorderLayout.SOUTH);

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
        loadDeck.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateFolder.createFolder("Decks");
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new java.io.File(".\\Decks"));
                fileChooser.setDialogTitle("Select Deck");
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                fileChooser.setAcceptAllFileFilterUsed(false);
                // Accept only .json files
                fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
                    public boolean accept(java.io.File f) {
                        return f.getName().toLowerCase().endsWith(".json") || f.isDirectory();
                    }

                    public String getDescription() {
                        return "JSON Files (*.json)";
                    }
                });
                if (fileChooser.showDialog(panel, "Use Deck") == JFileChooser.APPROVE_OPTION) {
                    System.out.println("getCurrentDirectory(): " + fileChooser.getCurrentDirectory());
                    System.out.println("getSelectedFile() : " + fileChooser.getSelectedFile());
                } else {
                    System.out.println("No Selection ");
                }
                LoadDeckGUI.loadDeck(fileChooser.getSelectedFile().getName(), fileChooser);
            }
        });
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
            DeleteDeckGUI.deleteDeck();
        } else if (e.getActionCommand().equals("Exit")) {
            System.exit(0);
        }
    }

    public void start() {
        // Graphic Interface
        JFrame frame = new JFrame("Magic The Gathering");
        frame.setContentPane(new MagicTheGatheringGUI().getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 250);
        frame.setVisible(true);
        frame.setLocationRelativeTo(frame.getFocusOwner());
    }

    //q: how to make the buttons do something?
    //a: add an action listener to the button
}
