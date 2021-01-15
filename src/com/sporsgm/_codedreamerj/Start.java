package com.sporsgm._codedreamerj;

import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Start extends JFrame {

    static Start frame;
    JPanel panel;
    JButton adminButton, teamButton;
    private ImageIcon img;
    JLabel imgLabel;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new Start();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Start() {
        super("Sports General Manager");

        this.setSize(470,350);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        panel.setLayout(new BorderLayout());
        Start.this.getContentPane().add(BorderLayout.CENTER,panel);

        JLabel title = new JLabel("Sports General Manager");
        title.setFont(new Font("Comit Sans MS", Font.BOLD, 26));
        title.setBounds(50, 25, 500, 50);
        panel.add(title);

        JButton adminButton = new JButton("Admin Login");
        adminButton.setFont(new Font("Arial", Font.PLAIN, 15));
        adminButton.setBounds(100, 100, 250, 50);
        adminButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AdminLogin adminLogin = new AdminLogin();
                adminLogin.setVisible(true);
                frame.setVisible(false);
            }
        });
        panel.add(adminButton);

        JButton teamButton = new JButton("Team Login");
        teamButton.setFont(new Font("Arial", Font.PLAIN, 15));
        teamButton.setBounds(100,175, 250, 50);
        teamButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TeamLogin teamLogin = new TeamLogin();
                teamLogin.setVisible(true);
                frame.setVisible(false);
            }
        });
        panel.add(teamButton);

        img = new ImageIcon("image1.png");
        imgLabel = new JLabel(img);
        imgLabel.setBounds(0, 0, 470, 350);
        panel.add(imgLabel);

        this.add(panel);
    }
}
