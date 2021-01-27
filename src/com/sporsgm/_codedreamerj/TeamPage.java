package com.sporsgm._codedreamerj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        this.setSize(470,600);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);

        JLabel title = new JLabel("Team Page");
        title.setFont(new  Font("Comic Sans MS", Font.PLAIN, 26));
        title.setBounds(130,25, 200, 50);
        panel.add(title);

        JButton addPlayer = new JButton("Add Player");
        addPlayer.setFont(new Font("Arial", Font.PLAIN, 15));
        addPlayer.setBounds(125, 100, 200, 25);
        addPlayer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddPlayer.main(new String[]{});
            }
        });
        panel.add(addPlayer);

        JButton viewPlayer = new JButton("View Player");
        viewPlayer.setFont(new Font("Arial", Font.PLAIN, 15));
        viewPlayer.setBounds(125, 140, 200, 25);
        viewPlayer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewPlayer.main(new String[]{});
            }
        });
        panel.add(viewPlayer);

    }
}
