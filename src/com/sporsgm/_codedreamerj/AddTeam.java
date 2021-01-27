package com.sporsgm._codedreamerj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

public class AddTeam extends JFrame{

    static AddTeam frame;
    JPanel panel;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new AddTeam();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public AddTeam() {

        super("Add Team");
        this.setSize(500,500);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);

        JLabel title = new JLabel("Add Team");
        title.setFont(new  Font("Comic Sans MS", Font.PLAIN, 26));
        title.setBounds(150,25, 200, 50);
        panel.add(title);

        JLabel teamLabel = new JLabel("Team Name");
        teamLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        teamLabel.setBounds(50, 100, 200, 20);
        panel.add(teamLabel);

        JLabel gmLabel = new JLabel("GM's Full Name");
        gmLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        gmLabel.setBounds(50, 140, 200, 20);
        panel.add(gmLabel);

        JLabel usernameLabel = new JLabel("GM's Username");
        usernameLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        usernameLabel.setBounds(50, 180, 200, 20);
        panel.add(usernameLabel);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN,  15));
        passwordLabel.setBounds(50, 220, 200, 20);
        panel.add(passwordLabel);

        JLabel emailLabel = new JLabel("Email");
        emailLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        emailLabel.setBounds(50, 260, 200, 20);
        panel.add(emailLabel);

        JLabel addressLabel = new JLabel("Address");
        addressLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        addressLabel.setBounds(50, 300, 200, 20);
        panel.add(addressLabel);

        JLabel phoneLabel = new JLabel("Phone");
        phoneLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        phoneLabel.setBounds(50, 340, 200, 20);
        panel.add(phoneLabel);

        JTextField teamnameTf = new JTextField();
        teamnameTf.setFont(new Font("Arial", Font.PLAIN, 15));
        teamnameTf.setBounds(200, 100, 200, 25);
        panel.add(teamnameTf);

        JTextField nameTf = new JTextField();
        nameTf.setFont(new Font("Arial", Font.PLAIN, 15));
        nameTf.setBounds(200, 140, 200, 25);
        panel.add(nameTf);

        JTextField usernameTf = new JTextField();
        usernameTf.setFont(new Font("Arial", Font.PLAIN, 15));
        usernameTf.setBounds(200, 180, 200, 25);
        panel.add(usernameTf);

        JTextField passwordTf = new JTextField();
        passwordTf.setFont(new Font("Arial", Font.PLAIN, 15));
        passwordTf.setBounds(200, 220, 200, 25);
        panel.add(passwordTf);

        JTextField emailTf = new JTextField();
        emailTf.setFont(new Font("Arial", Font.PLAIN, 15));
        emailTf.setBounds(200, 260, 200, 25);
        panel.add(emailTf);

        JTextField addressTf = new JTextField();
        addressTf.setFont(new Font("Arial", Font.PLAIN, 15));
        addressTf.setBounds(200, 300, 200, 25);
        panel.add(addressTf);

        JTextField phoneTf = new JTextField();
        phoneTf.setFont(new Font("Arial", Font.PLAIN, 15));
        phoneTf.setBounds(200, 340, 200, 25);
        panel.add(phoneTf);

        JLabel noteLabel = new JLabel("Note: All fields must be filled in");
        noteLabel.setFont(new Font("Arial", Font.BOLD, 15));
        noteLabel.setBounds(110, 380, 300, 20);
        panel.add(noteLabel);

        JButton add = new JButton("Add");
        add.setFont(new Font("Arial", Font.PLAIN, 15));
        add.setBounds(190, 420, 100, 40);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameTf.getText().trim();
                String username = usernameTf.getText().trim();
                String password = passwordTf.getText().trim();
                String email = emailTf.getText().trim();
                String address = addressTf.getText().trim();
                String phone = phoneTf.getText().trim();
                if (name.isEmpty() || username.isEmpty() || password.isEmpty() || email.isEmpty() || address.isEmpty() || phone.isEmpty()) {
                    JOptionPane.showMessageDialog(AddTeam.this, "Please fill out all fields");
                } else if ((password.length() < 6) || (!password.matches(".*[a-zA-Z].*")) || (!password.matches(".*[0-9].*"))) {
                    JOptionPane.showMessageDialog(AddTeam.this, "Invalid password format, " +
                            "Make sure the password is at least six characters and has both letters and numbers");
                } else if (!emailCheck(email)) {
                    JOptionPane.showMessageDialog(AddTeam.this, "Invalid email address");
                } else if (!phone.matches("[0-9]+") || (phone.length() != 10)) {
                    JOptionPane.showMessageDialog(AddTeam.this, "Invalid phone number. Make sure it has 10 digits (numbers).");
                } else {
                   // System.out.println("Hello");
                }
            }
            });
            panel.add(add);

            this.add(panel);

        }

        public static boolean emailCheck(String email) {

            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                    "[a-zA-Z0-9_+&*-]+)*@" +
                    "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                    "A-Z]{2,7}$";

            Pattern pattern = Pattern.compile(emailRegex);
            if (email == null)
                return false;
            return pattern.matcher(email).matches();
        }

}

