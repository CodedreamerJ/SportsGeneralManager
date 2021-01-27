package com.sporsgm._codedreamerj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPlayer extends JFrame {

    static AddPlayer frame;
    JPanel panel;
    JTextField pidTf, fnameTf, lnameTf, teamTf, jerseyNumTf, positionTf, heightTf, weightTf, schoolTf, countryTf;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new AddPlayer();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public AddPlayer() {

        super("Add Player(s)");
        this.setSize(500,650);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);

        JLabel title = new JLabel("Add Player(s)");
        title.setFont(new  Font("Comic Sans MS", Font.PLAIN, 26));
        title.setBounds(150,25, 200, 50);
        panel.add(title);

        JLabel playerIDLabel = new JLabel("Player ID Number");
        playerIDLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        playerIDLabel.setBounds(50, 100, 200, 20);
        panel.add(playerIDLabel);

        JLabel firstNameLabel = new JLabel("First Name");
        firstNameLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        firstNameLabel.setBounds(50, 140, 200, 20);
        panel.add(firstNameLabel);

        JLabel lastNameLabel = new JLabel("Last Name");
        lastNameLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        lastNameLabel.setBounds(50, 180, 200, 20);
        panel.add(lastNameLabel);

        JLabel teamLabel = new JLabel("Team");
        teamLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        teamLabel.setBounds(50, 220, 200, 20);
        panel.add(teamLabel);

        JLabel jerseyNumberLabel = new JLabel("Jersey Number");
        jerseyNumberLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        jerseyNumberLabel.setBounds(50, 260, 200, 20);
        panel.add(jerseyNumberLabel);

        JLabel positionLabel = new JLabel("Position");
        positionLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        positionLabel.setBounds(50, 300, 200, 20);
        panel.add(positionLabel);

        JLabel heightLabel = new JLabel("Height(ft)");
        heightLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        heightLabel.setBounds(50, 340, 200, 20);
        panel.add(heightLabel);

        JLabel weightLabel = new JLabel("Weight(lbs)");
        weightLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        weightLabel.setBounds(50, 380, 200, 20);
        panel.add(weightLabel);

        JLabel schoolLabel = new JLabel("School");
        schoolLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        schoolLabel.setBounds(50, 420, 200, 20);
        panel.add(schoolLabel);

        JLabel countryLabel = new JLabel("Country");
        countryLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        countryLabel.setBounds(50, 460, 200, 20);
        panel.add(countryLabel);


        pidTf = new JTextField();
        pidTf.setFont(new Font("Arial", Font.PLAIN, 15));
        pidTf.setBounds(200, 100, 200, 25);
        panel.add(pidTf);

        fnameTf = new JTextField();
        fnameTf.setFont(new Font("Arial", Font.PLAIN, 15));
        fnameTf.setBounds(200, 140, 200, 25);
        panel.add(fnameTf);

        lnameTf = new JTextField();
        lnameTf.setFont(new Font("Arial", Font.PLAIN, 15));
        lnameTf.setBounds(200, 180, 200, 25);
        panel.add(lnameTf);

        teamTf = new JTextField();
        teamTf.setFont(new Font("Arial", Font.PLAIN, 15));
        teamTf.setBounds(200, 220, 200, 25);
        panel.add(teamTf);

        jerseyNumTf = new JTextField();
        jerseyNumTf.setFont(new Font("Arial", Font.PLAIN, 15));
        jerseyNumTf.setBounds(200, 260, 200, 25);
        panel.add(jerseyNumTf);

        positionTf = new JTextField();
        positionTf.setFont(new Font("Arial", Font.PLAIN, 15));
        positionTf.setBounds(200, 300, 200, 25);
        panel.add(positionTf);

        heightTf = new JTextField();
        heightTf.setFont(new Font("Arial", Font.PLAIN, 15));
        heightTf.setBounds(200, 340, 200, 25);
        panel.add(heightTf);

        weightTf = new JTextField();
        weightTf.setFont(new Font("Arial", Font.PLAIN, 15));
        weightTf.setBounds(200, 380, 200, 25);
        panel.add(weightTf);

        schoolTf = new JTextField();
        schoolTf.setFont(new Font("Arial", Font.PLAIN, 15));
        schoolTf.setBounds(200, 420, 200, 25);
        panel.add(schoolTf);

        countryTf = new JTextField();
        countryTf.setFont(new Font("Arial", Font.PLAIN, 15));
        countryTf.setBounds(200, 460, 200, 25);
        panel.add(countryTf);

        JButton add = new JButton("Add");
        add.setFont(new Font("Arial", Font.PLAIN, 15));
        add.setBounds(190, 520, 100, 40);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int pid = Integer.parseInt(pidTf.getText().trim());
                String fname = fnameTf.getText().trim();
                String lname = lnameTf.getText().trim();
                String team = teamTf.getText().trim();
                int jerseyNum = Integer.parseInt(jerseyNumTf.getText().trim());
                String position = positionTf.getText().trim();
                String height = heightTf.getText().trim();
                int weight = Integer.parseInt(weightTf.getText().trim() + "" + "lbs");
                String school = schoolTf.getText().trim();
                String country = countryTf.getText().trim();
                //Databbase
            }
        });
        panel.add(add);

        this.add(panel);

        JButton refresh = new JButton("Refresh");
        refresh.setFont(new Font("Arial", Font.PLAIN, 15));
        refresh.setBounds(290, 520, 100, 40);
        refresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pidTf.setText("");
                fnameTf.setText("");
                lnameTf.setText("");
                teamTf.setText("");
                jerseyNumTf.setText("");
                positionTf.setText("");
                heightTf.setText("");
                weightTf.setText("");
                schoolTf.setText("");
                countryTf.setText("");
            }
        });
        panel.add(refresh);

        this.add(panel);

    }
}
