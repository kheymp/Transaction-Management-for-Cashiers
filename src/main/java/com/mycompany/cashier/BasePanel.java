/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cashier;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Kheymp
 */
public class BasePanel extends JPanel {
    JTextField text1, text2;
    BasePanel() {
        this.setBounds(210, 0, 850, 768);
        this.setBackground(new Color(218, 21, 48));
        this.setLayout(null);
        this.setVisible(false);
        
        text1 = new JTextField("Welcome!");
        text1.setBounds(20, 184, 810, 200);
        text1.setHorizontalAlignment(JTextField.CENTER);
        text1.setEditable(false);
        text1.setFont(new Font("Freestyle Script", Font.BOLD, 100));
        text1.setForeground(new Color(255,199, 44));
        text1.setBackground(new Color(218, 21, 48));
        text1.setBorder(BorderFactory.createEmptyBorder());
        
        text2 = new JTextField("Select a category.");
        text2.setBounds(20, 384, 810, 200);
        text2.setHorizontalAlignment(JTextField.CENTER);
        text2.setEditable(false);
        text2.setFont(new Font("Freestyle Script", Font.BOLD, 100));
        text2.setForeground(new Color(255,199, 44));
        text2.setBackground(new Color(218, 21, 48));
        text2.setBorder(BorderFactory.createEmptyBorder());
        
        this.add(text1);
        this.add(text2);
    }
}
