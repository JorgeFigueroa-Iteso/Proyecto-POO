package me.jorge.MagicTheGathering.Gui;

import javax.swing.*;
import java.awt.*;

public class LoadDeckGUI {
    public static void loadDeck() {
        JFrame frame = new JFrame("Load Deck");
        frame.setSize(500, 500);

        LoadDeckGUI loadDeckGUI = new LoadDeckGUI();

        frame.add(loadDeckGUI.getPanel(frame));

        frame.setVisible(true);
    }

    private JPanel getPanel(JFrame frame){
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel title = new JLabel("Load Deck");
        title.setBounds(20, 10, 100, 20);
        panel.add(title);

        // Open explorer to select file
        JButton selectFile = new JButton("Select File");
        selectFile.setBounds(10, 50, 100, 25);
        selectFile.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new java.io.File("."));
            fileChooser.setDialogTitle("Select Deck");
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fileChooser.setAcceptAllFileFilterUsed(false);

            if (fileChooser.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION) {
                System.out.println("getCurrentDirectory(): " + fileChooser.getCurrentDirectory());
                System.out.println("getSelectedFile() : " + fileChooser.getSelectedFile());

                // Print file content
                String fileContent = "";
                try {
                    fileContent = new String(java.nio.file.Files.readAllBytes(fileChooser.getSelectedFile().toPath()));
                } catch (java.io.IOException ioException) {
                    ioException.printStackTrace();
                }
                System.out.println(fileContent);

            } else {
                System.out.println("No Selection ");
            }
        });
        panel.add(selectFile);

        // Card 1


        return panel;
    }
}
