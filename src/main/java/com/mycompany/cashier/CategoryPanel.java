/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cashier;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Kheymp
 */
public class CategoryPanel extends JPanel implements ActionListener {
    Images images = new Images();
    static JButton burgersAndFries, chickenAndPlatters, drinksAndDesserts, mcCafe;
    
    CategoryPanel() {
        burgersAndFries = new JButton("Burgers & Fries");
        burgersAndFries.setBounds(0, 170, 200, 30);
        burgersAndFries.setBackground(new Color(255,199, 44));
        burgersAndFries.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 20));
        burgersAndFries.setForeground(Color.BLACK);
        burgersAndFries.setFocusable(false);
        burgersAndFries.setHorizontalAlignment(JButton.CENTER);
        burgersAndFries.addActionListener(this);
        
        chickenAndPlatters = new JButton("Chicken & Platters");
        chickenAndPlatters.setBounds(0, 370, 200, 30);
        chickenAndPlatters.setBackground(new Color(255,199, 44));
        chickenAndPlatters.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 20));
        chickenAndPlatters.setForeground(Color.BLACK);
        chickenAndPlatters.setFocusable(false);
        chickenAndPlatters.setHorizontalAlignment(JButton.CENTER);
        chickenAndPlatters.addActionListener(this);
        
        drinksAndDesserts = new JButton("Drinks & Desserts");
        drinksAndDesserts.setBounds(0, 570, 200, 30);
        drinksAndDesserts.setBackground(new Color(255,199, 44));
        drinksAndDesserts.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 20));
        drinksAndDesserts.setForeground(Color.BLACK);
        drinksAndDesserts.setFocusable(false);
        drinksAndDesserts.setHorizontalAlignment(JButton.CENTER);
        drinksAndDesserts.addActionListener(this);
        
        mcCafe = new JButton("McCafe");
        mcCafe.setBounds(0, 740, 200, 30);
        mcCafe.setBackground(new Color(255,199, 44));
        mcCafe.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 20));
        mcCafe.setForeground(Color.BLACK);
        mcCafe.setFocusable(false);
        mcCafe.setHorizontalAlignment(JButton.CENTER);
        mcCafe.addActionListener(this);
        
        images.bigMacImg.setBounds(0, 0, 200, 200);
        images.chickenSpaghettiImg.setBounds(0, 200, 200, 200);
        images.caramelSundaeImg.setBounds(0, 400, 200, 200);
        images.doubleChocoFrappeImg.setBounds(0, 600, 200, 200);
        
        this.setLayout(null);
        this.setBounds(0, 0, 200, 768);
        this.setBackground(new Color(218, 21, 48));
        
        this.add(burgersAndFries);
        this.add(chickenAndPlatters);
        this.add(drinksAndDesserts);
        this.add(mcCafe);
        
        this.add(images.bigMacImg);
        this.add(images.chickenSpaghettiImg);
        this.add(images.caramelSundaeImg);
        this.add(images.doubleChocoFrappeImg);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (WelcomePanel.signedIn == false) {
            if (e.getSource() == burgersAndFries || e.getSource() == chickenAndPlatters || e.getSource() == drinksAndDesserts || e.getSource() == mcCafe) {
                CheckoutPanel.receipt.setForeground(Color.red);
                CheckoutPanel.receipt.append("PLEASE LOG IN FIRST.\n");
            }
        }
        
        if (e.getSource() == burgersAndFries) {
            if (WelcomePanel.signedIn == true) {
                Cashier.burgersPanel.setVisible(true);
                Cashier.plattersPanel.setVisible(false);
                Cashier.dessertsPanel.setVisible(false);
                Cashier.cafePanel.setVisible(false);
                Cashier.basePanel.setVisible(false);
                
                burgersAndFries.setBackground(new Color(218, 21, 48));
                burgersAndFries.setForeground(new Color(255,199, 44));
                
                chickenAndPlatters.setBackground(new Color(255,199, 44));
                chickenAndPlatters.setForeground(Color.BLACK);
                
                drinksAndDesserts.setBackground(new Color(255,199, 44));
                drinksAndDesserts.setForeground(Color.BLACK);
                
                mcCafe.setBackground(new Color(255,199, 44));
                mcCafe.setForeground(Color.BLACK);
            }
        }
        
        if (e.getSource() == chickenAndPlatters) {
            if (WelcomePanel.signedIn == true) {
                Cashier.plattersPanel.setVisible(true);
                Cashier.burgersPanel.setVisible(false);
                Cashier.dessertsPanel.setVisible(false);
                Cashier.cafePanel.setVisible(false);
                Cashier.basePanel.setVisible(false);
                
                burgersAndFries.setBackground(new Color(255,199, 44));
                burgersAndFries.setForeground(Color.BLACK);
                
                chickenAndPlatters.setBackground(new Color(218, 21, 48));
                chickenAndPlatters.setForeground(new Color(255,199, 44));
                
                drinksAndDesserts.setBackground(new Color(255,199, 44));
                drinksAndDesserts.setForeground(Color.BLACK);
                
                mcCafe.setBackground(new Color(255,199, 44));
                mcCafe.setForeground(Color.BLACK);
            }
        }
        
        if (e.getSource() == drinksAndDesserts) {
            if (WelcomePanel.signedIn == true) {
                Cashier.dessertsPanel.setVisible(true);
                Cashier.burgersPanel.setVisible(false);
                Cashier.plattersPanel.setVisible(false);
                Cashier.cafePanel.setVisible(false);
                Cashier.basePanel.setVisible(false);
                
                burgersAndFries.setBackground(new Color(255,199, 44));
                burgersAndFries.setForeground(Color.BLACK);
                
                chickenAndPlatters.setBackground(new Color(255,199, 44));
                chickenAndPlatters.setForeground(Color.BLACK);
                
                drinksAndDesserts.setBackground(new Color(218, 21, 48));
                drinksAndDesserts.setForeground(new Color(255,199, 44));
                
                mcCafe.setBackground(new Color(255,199, 44));
                mcCafe.setForeground(Color.BLACK);
            }
            
        }
        
        if (e.getSource() == mcCafe) {
            if (WelcomePanel.signedIn == true) {
                Cashier.cafePanel.setVisible(true);
                Cashier.burgersPanel.setVisible(false);
                Cashier.plattersPanel.setVisible(false);
                Cashier.dessertsPanel.setVisible(false);
                Cashier.basePanel.setVisible(false);
                
                burgersAndFries.setBackground(new Color(255,199, 44));
                burgersAndFries.setForeground(Color.BLACK);
                
                chickenAndPlatters.setBackground(new Color(255,199, 44));
                chickenAndPlatters.setForeground(Color.BLACK);
                
                drinksAndDesserts.setBackground(new Color(255,199, 44));
                drinksAndDesserts.setForeground(Color.BLACK);
                
                mcCafe.setBackground(new Color(218, 21, 48));
                mcCafe.setForeground(new Color(255,199, 44));
            }
        }
    }
}
