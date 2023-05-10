package me.jorge.MagicTheGathering.Gui;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import me.jorge.MagicTheGathering.util.LoadDeck;

import javax.swing.*;
import java.awt.*;

public class LoadDeckGUI {
    public static void loadDeck(String name, JFileChooser deck) {
        //JFrame
        JFrame frame = new JFrame("Magic The Gathering");
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        frame.setContentPane(panel);
        // set size to 80% of screen in weight and 25% in height
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize((int) (screenSize.getWidth() * 0.9), (int) (screenSize.getHeight() * 0.25));
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        // Center
        frame.setLocationRelativeTo(frame.getFocusOwner());

        frame.add(new LoadDeckGUI().getPanel(frame, name, deck));

    }

    private JPanel getPanel(JFrame frame, String name, JFileChooser deck){

        LoadDeck loadDeck = new LoadDeck();
        loadDeck.loadDeck(name, deck);

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

        //JFXPanel Card 1
        JFXPanel card1 = new JFXPanel();
        Platform.runLater(() -> {
            Group root = new Group();
            Scene scene = new Scene(root, 200, 300);
            card1.setScene(scene);
            Text text = new Text();
            text.setX(40);
            text.setY(100);
            text.setText("Card 1");
            root.getChildren().add(text);
            card1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        });
        panel.add(card1);

        //JFXPanel Card 2
        JFXPanel card2 = new JFXPanel();
        Platform.runLater(() -> {
            Group root = new Group();
            Scene scene = new Scene(root, 200, 300);
            card2.setScene(scene);
            Text text = new Text();
            text.setX(40);
            text.setY(100);
            text.setText("Card 2");
            root.getChildren().add(text);
            card2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        });
        panel.add(card2);

        //JFXPanel Card 3
        JFXPanel card3 = new JFXPanel();
        Platform.runLater(() -> {
            Group root = new Group();
            Scene scene = new Scene(root, 200, 300);
            card3.setScene(scene);
            Text text = new Text();
            text.setX(40);
            text.setY(100);
            text.setText("Card 3");
            root.getChildren().add(text);
            card3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        });
        panel.add(card3);

        //JFXPanel Card 4
        JFXPanel card4 = new JFXPanel();
        Platform.runLater(() -> {
            Group root = new Group();
            Scene scene = new Scene(root, 200, 300);
            card4.setScene(scene);
            Text text = new Text();
            text.setX(40);
            text.setY(100);
            text.setText("Card 4");
            root.getChildren().add(text);
            card4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        });
        panel.add(card4);

        //JFXPanel Card 5
        JFXPanel card5 = new JFXPanel();
        Platform.runLater(() -> {
            Group root = new Group();
            Scene scene = new Scene(root, 200, 300);
            card5.setScene(scene);
            Text text = new Text();
            text.setX(40);
            text.setY(100);
            text.setText("Card 5");
            root.getChildren().add(text);
            card5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        });
        panel.add(card5);

        //JFXPanel Card 6
        JFXPanel card6 = new JFXPanel();
        Platform.runLater(() -> {
            Group root = new Group();
            Scene scene = new Scene(root, 200, 300);
            card6.setScene(scene);
            Text text = new Text();
            text.setX(40);
            text.setY(100);
            text.setText("Card 6");
            root.getChildren().add(text);
            card6.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        });
        panel.add(card6);

        //JFXPanel Card 7
        JFXPanel card7 = new JFXPanel();
        Platform.runLater(() -> {
            Group root = new Group();
            Scene scene = new Scene(root, 200, 300);
            card7.setScene(scene);
            Text text = new Text();
            text.setX(40);
            text.setY(100);
            text.setText("Card 7");
            root.getChildren().add(text);
            card7.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        });
        panel.add(card7);

        return panel;
    }
}
