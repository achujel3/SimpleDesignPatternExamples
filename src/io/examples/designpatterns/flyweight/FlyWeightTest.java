package io.examples.designpatterns.flyweight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class FlyWeightTest extends JFrame {

    private static final long serialVersionID = 1L;

    JButton startDrawing;

    int windowWidth = 1000;
    int windowHeight = 500;

    // A new rectangle is created only if a new color is needed

    Color[] shapeColor = {
            Color.ORANGE,
            Color.RED,
            Color.YELLOW,
            Color.BLUE,
            Color.PINK,
            Color.CYAN,
            Color.MAGENTA,
            Color.BLACK,
            Color.GRAY
    };

    public static void main(String[] args) {

        new FlyWeightTest();

    }

    public FlyWeightTest() {

        // Create the frame, position it and handle closing it

        this.setSize(windowWidth, windowHeight);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flyweight Test");

        JPanel contentPane = new JPanel();

        contentPane.setLayout(new BorderLayout());

        final JPanel drawingPanel = new JPanel();

        startDrawing = new JButton("Button 1");

        contentPane.add(drawingPanel, BorderLayout.CENTER);

        contentPane.add(startDrawing, BorderLayout.SOUTH);

        startDrawing.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Graphics g = drawingPanel.getGraphics();

                long startTime = System.currentTimeMillis();

                for (int i = 0; i < 100000; i++) {

                    /**
                     * Uses rectangles stored in the HashMap to speed up the program
                     */
                    MyRect rect = RectFactory.getRect(getRandColor());
                    rect.draw(g, getRandX(), getRandY(), getRandX(), getRandY());

                }

                long endTime = System.currentTimeMillis();

                System.out.println("That took " + (endTime - startTime) + " milliseconds");
            }
        });

        this.add(contentPane);
        this.setVisible(true);

    }

    /**
     * Picks random x & y coordinates
     *
     * @return
     */
    private int getRandX() {
        return (int) (Math.random() * windowWidth);
    }

    private int getRandY() {
        return (int) (Math.random() * windowHeight);
    }

    /**
     * Picks a random Color from the 9 available
     *
     * @return
     */
    private Color getRandColor() {

        Random randomGenerator = new Random();

        int randInt = randomGenerator.nextInt(9);

        return shapeColor[randInt];

    }

}
