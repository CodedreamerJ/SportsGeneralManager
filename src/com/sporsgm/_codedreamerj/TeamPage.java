package com.sporsgm._codedreamerj;

import javax.swing.*;
import java.awt.*;

public class TeamPage extends JFrame {

    static TeamPage frame;
    JPanel panel;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new TeamPage();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public TeamPage() {

        super("Team Page");
    }
}
