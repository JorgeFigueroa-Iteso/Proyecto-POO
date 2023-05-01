package me.jorge.MagicTheGathering;

import me.jorge.MagicTheGathering.Gui.MagicTheGathering;

import javax.swing.*;

/**
 * Program to save Magic The Gathering cards as a deck
 * In a graphic interface, you can use the deck to play the game
 *
 * You can save the deck in a file, and load it later
 * */

public class Main {
    public static void main(String[] args) {
        // Graphic Interface
        JFrame frame = new JFrame("Magic The Gathering");
        frame.setContentPane(new MagicTheGathering().getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
