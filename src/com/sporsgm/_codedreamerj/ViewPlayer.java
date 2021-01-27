package com.sporsgm._codedreamerj;

import javax.swing.*;
import java.awt.*;

public class ViewPlayer extends JFrame {

    private JButton delete;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ViewPlayer frame = new ViewPlayer();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ViewPlayer() {

        super("View Players");
        this.setSize(1000,500);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
}
