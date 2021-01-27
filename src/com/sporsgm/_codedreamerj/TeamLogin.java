package com.sporsgm._codedreamerj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeamLogin extends JFrame {

    static TeamLogin frame;
    JPanel panel;
    JButton login, back;

    public static void main(String[] args) {
        //https://stackoverflow.com/questions/22534356/java-awt-eventqueue-invokelater-explained
        //Explation to why we use EventQueue.invokeLater(new Runnable()
        //This object creates a new trend in order to handle calculations while the GUI is being updated
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new TeamLogin();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    //Constructor for this class
    public TeamLogin() {

        super("Team Login Page");
        this.setSize(470,350);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        //https://docs.oracle.com/javase/tutorial/uiswing/layout/none.html#:~:text=A%20layout%20manager%20makes%20it,as%20well%20as%20other%20programs.
        //When you set layout to null you are creating a container without a layout manager
        panel.setLayout(null);

        JLabel title = new JLabel("Team Login");
        title.setFont(new Font("Comic Sans MS", Font.PLAIN, 26));
        title.setBounds(170,25, 500, 50);
        panel.add(title);

        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        usernameLabel.setBounds(50, 100, 200, 40);
        panel.add(usernameLabel);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        passwordLabel.setBounds(50, 150, 200, 40);
        panel.add(passwordLabel);

        JTextField userName = new JTextField();
        userName.setFont(new Font("Arial", Font.PLAIN, 15));
        userName.setBounds(150, 100, 200, 40);
        panel.add(userName);

        JPasswordField passWord = new JPasswordField();
        passWord.setFont(new Font("Arial", Font.PLAIN, 15));
        passWord.setBounds(150, 150, 200, 40);
        panel.add(passWord);

        back = new JButton("Back");
        back.setFont(new Font("Arial", Font.PLAIN,15));
        back.setBounds(100, 230, 100, 40);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Start.main(new String[]{});
                //.dispose method destroys current state within the TeamLogin Label
                //I direct however to the Start.main window, this save us space by removing it from our OS
                TeamLogin.this.dispose();
            }
        });
        panel.add(back);

        login = new JButton("Login");
        login.setFont(new Font("Arial", Font.PLAIN, 15));
        login.setBounds(220, 230, 100, 40);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usernameCheck = userName.getText();
                String passwordCheck = String.valueOf(passWord.getPassword());
                boolean status = TeamWdb.checkCredentials(usernameCheck, passwordCheck);
                if (status) {
                    TeamPage.main(new String[]{});
                    TeamLogin.this.dispose();
                } else {
                    JOptionPane.showMessageDialog(TeamLogin.this,
                            "Invalid/Incorrect credentials", "Login Error",JOptionPane.ERROR_MESSAGE);
                }

            }
        });
        panel.add(login);

        this.add(panel);
    }

}
