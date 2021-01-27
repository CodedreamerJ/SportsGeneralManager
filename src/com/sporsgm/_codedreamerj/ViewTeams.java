package com.sporsgm._codedreamerj;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ViewTeams extends JFrame {

    private JButton delete;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ViewTeams frame = new ViewTeams();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ViewTeams() {

        super("View Teams");
        this.setSize(1000,500);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel1 = new JPanel();
        panel1.setBorder(new EmptyBorder(5, 5, 5, 5));
        panel1.setLayout(new BorderLayout());
        ViewTeams.this.getContentPane().add(BorderLayout.CENTER,panel1);
    }
}
