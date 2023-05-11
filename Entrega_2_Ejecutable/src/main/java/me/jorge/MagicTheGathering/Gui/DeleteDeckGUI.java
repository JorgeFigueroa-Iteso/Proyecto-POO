package me.jorge.MagicTheGathering.Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteDeckGUI implements ActionListener {

    public static void deleteDeck() {
        JFrame frame = new JFrame("Delete Deck");
        frame.setSize(500, 250);
        frame.setLocationRelativeTo(frame.getFocusOwner());


        DeleteDeckGUI deleteDeckGUI = new DeleteDeckGUI();
        frame.add(deleteDeckGUI.getPanel(frame));

        frame.setVisible(true);
    }

    public JPanel getPanel(JFrame frame) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Title
        JLabel title = new JLabel("Delete Deck");
        title.setFont(new Font("Arial", Font.BOLD, 30));
        title.setHorizontalAlignment(JLabel.CENTER);
        panel.add(title, BorderLayout.NORTH);

        // Buttons
        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(2, 2));

        JButton deleteDeck = new JButton("Delete Deck");
        deleteDeck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new java.io.File(".\\Decks"));
                fileChooser.setDialogTitle("Delete Deck");
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                // Accept only .json files
                fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
                    public boolean accept(java.io.File f) {
                        return f.getName().toLowerCase().endsWith(".json") || f.isDirectory();
                    }

                    public String getDescription() {
                        return "JSON Files (*.json)";
                    }
                });


                if (fileChooser.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION) {
                    System.out.println("getCurrentDirectory(): " + fileChooser.getCurrentDirectory());
                    System.out.println("getSelectedFile() : " + fileChooser.getSelectedFile());
                } else {
                    System.out.println("No Selection ");
                }

                String deckName = fileChooser.getSelectedFile().getName();

                // Confirm delete
                int dialogResult = JOptionPane.showConfirmDialog(frame, "Are you sure you want to delete deck " + deckName + "?", "Delete Deck", JOptionPane.YES_NO_OPTION);
                if (dialogResult == JOptionPane.YES_OPTION) {
                    // Delete file
                    fileChooser.getSelectedFile().delete();
                    // Notify user
                    JOptionPane.showMessageDialog(frame, "Deck " + deckName + " deleted");
                } else {
                    JOptionPane.showMessageDialog(frame, "Deck " + deckName + " not deleted");
                }

            }
        });
        deleteDeck.setBounds(70, 100, 350, 30);
        panel.add(deleteDeck);

        JButton exit = new JButton("Back");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        exit.setBounds(5, 182, 80, 25);
        panel.add(exit);

        panel.add(buttons, BorderLayout.CENTER);

        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Exit
    }
}
