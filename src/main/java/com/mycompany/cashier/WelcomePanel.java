/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cashier;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Kheymp
 */
public class WelcomePanel extends JPanel implements ActionListener {
    static JTextField welcomeText, enterNameText, enterNameField;
    JButton signInButton;
    Images images = new Images();
    static boolean signedIn = false;
    static String userName = "";
    WelcomePanel() {
        enterNameText = new JTextField("Enter your name: ");
        enterNameText.setBounds(20, 240, 200, 50);
        enterNameText.setForeground(new Color(255,199, 44));
        enterNameText.setBackground(new Color(218, 21, 48));
        enterNameText.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 30));
        enterNameText.setEditable(false);
        enterNameText.setBorder(BorderFactory.createEmptyBorder());
        
        enterNameField = new JTextField();
        enterNameField.setBounds(20, 300, 200, 50);
        enterNameField.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 30));
        enterNameField.setForeground(Color.BLACK);
        
        signInButton = new JButton("Log In");
        signInButton.setBounds(20, 350, 200, 30);
        signInButton.setBackground(new Color(255,199, 44));
        signInButton.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 20));
        signInButton.setForeground(Color.BLACK);
        signInButton.setFocusable(false);
        signInButton.addActionListener(this);
        signInButton.setHorizontalAlignment(JButton.CENTER);
        
        welcomeText = new JTextField("Welcome to McDonald's!");
        welcomeText.setBounds(20, 20, 810, 200);
        welcomeText.setHorizontalAlignment(JTextField.CENTER);
        welcomeText.setEditable(false);
        welcomeText.setFont(new Font("Freestyle Script", Font.BOLD, 100));
        welcomeText.setForeground(new Color(255,199, 44));
        welcomeText.setBackground(new Color(218, 21, 48));
        welcomeText.setBorder(BorderFactory.createEmptyBorder());
              
        this.setBounds(210, 0, 850, 768);
        this.setBackground(new Color(218, 21, 48));
        //this.setOpaque(false);
        this.setLayout(null);
        this.setVisible(true);
        
        this.add(welcomeText);
        this.add(enterNameText);
        this.add(enterNameField);
        this.add(signInButton);
        
        //images.ronaldMcDonaldImg.setBounds(300, 170, 522, 669);
        //this.add(images.ronaldMcDonaldImg);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (signedIn == false) {
            if (e.getSource() == signInButton) {
                CheckoutPanel.receipt.setForeground(Color.red);
                CheckoutPanel.receipt.append("INCORRECT USERNAME.\n");
            }
        }
        if (e.getSource() == signInButton) {
            userName = enterNameField.getText();
            if (userName.equalsIgnoreCase("Kheymp") || userName.equalsIgnoreCase("Maynard") || userName.equalsIgnoreCase("Hannah") || userName.equalsIgnoreCase("Ryan")) {
                signedIn = true;
                Cashier.welcomePanel.setVisible(false);
                Cashier.animationPanel.setVisible(false);
                Cashier.basePanel.setVisible(true);
                CheckoutPanel.logoutButton.setVisible(true);
                CheckoutPanel.receipt.setText("");
            }
        }
    }
}
