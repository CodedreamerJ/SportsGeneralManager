package com.sporsgm._codedreamerj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminPage extends JFrame  {

    static AdminPage frame;
    JPanel panel; //Declaration of JPanel

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new AdminPage();
                    frame.setVisible(true);
                } catch (Exception e) {
                    //PrintStackTrace(): Java’s throwable class which prints the throwable along with other details like the line number and class name where the exception occurred.
                    e.printStackTrace();
                }
            }
        });
    }

    public AdminPage() {
        //// Invoke the JFrame constructor
        super("Admin Page");
        this.setSize(470, 500);
        //If the parameter is false then the user cannot re-size the frame.
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel(); //Assignment of a new JPanel class
        panel.setLayout(null);

        JLabel title = new JLabel("Admin Page");
        title.setFont(new  Font("Comic Sans MS", Font.PLAIN, 26));
        title.setBounds(150,25, 200, 50);
        panel.add(title);

        JButton addTeam = new JButton("Add Team");
        addTeam.setFont(new Font("Arial", Font.PLAIN, 15));
        addTeam.setBounds(125, 100, 200, 40);
        addTeam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddTeam.main(new String[]{});
            }
        });
        panel.add(addTeam);

        JButton viewTeams = new JButton("View Teams");
        viewTeams.setFont(new Font("Arial", Font.PLAIN, 15));
        viewTeams.setBounds(125, 160, 200, 40);
        viewTeams.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewTeams.main(new String[]{});
            }
        });
        panel.add(viewTeams);

        JButton logout = new JButton("Logout");
        logout.setFont(new Font("Arial", Font.PLAIN, 15));
        logout.setBounds(125, 220, 200, 40);
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Start.main(new String[]{});
                frame.dispose();
            }
        });
        panel.add(logout);

        //Add Mail/Chat System

        //Team Schedule

        //GM Personal Schedule


        this.add(panel);

    }
}
