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
public class BurgersPanel extends JPanel implements ActionListener {
    Images images = new Images();
    JButton[] allBurgersButtons;
    
    JButton bigMacButton, burgerMcDoButton, cheeseBurgerDeluxeButton, cheeseBurgerButton, mcCrispyChickenSandwichButton, 
            mcChickenSandwichButton, quarterPounderButton, cheesyBurgerMcDoButton, friesButton, hashBrownsButton;
    
    static int bigMacQuantity = 0, burgerMcDoQuantity = 0, cheeseBurgerDeluxeQuantity = 0, cheeseBurgerQuantity = 0, mcCrispyChickenSandwichQuantity = 0, 
            mcChickenSandwichQuantity = 0, quarterPounderQuantity = 0, cheesyBurgerMcDoQuantity = 0, friesQuantity = 0, hashBrownsQuantity = 0;
    
    static int bigMacPrice = 120, burgerMcDoPrice = 100, cheeseBurgerDeluxePrice = 150, cheeseBurgerPrice = 135, mcCrispyChickenSandwichPrice = 200, 
            mcChickenSandwichPrice = 170, quarterPounderPrice = 225, cheesyBurgerMcDoPrice = 150, friesPrice = 70, hashBrownsPrice = 80;
    
    BurgersPanel() {
        this.setBounds(210, 0, 850, 768);
        this.setBackground(new Color(218, 21, 48));
        this.setLayout(null);
        this.setVisible(false);
        
        bigMacButton = new JButton("Big Mac 120");
        bigMacButton.setBounds(10, 170, 200, 30);
        
        burgerMcDoButton = new JButton("Burger McDo 100");
        burgerMcDoButton.setBounds(10, 370, 200, 30);
        
        cheeseBurgerDeluxeButton = new JButton("Cheese Deluxe 150");
        cheeseBurgerDeluxeButton.setBounds(10, 570, 200, 30);
        
        cheeseBurgerButton = new JButton("Cheeseburger 135");
        cheeseBurgerButton.setBounds(10, 740, 200, 30);
        
        mcCrispyChickenSandwichButton = new JButton("Crispy Chicken 200");
        mcCrispyChickenSandwichButton.setBounds(220, 170, 200, 30);
        
        mcChickenSandwichButton = new JButton("McSandwich 170");
        mcChickenSandwichButton.setBounds(220, 370, 200, 30);
        
        quarterPounderButton = new JButton("Quarter Pounder 225");
        quarterPounderButton.setBounds(220, 570, 200, 30);
        
        cheesyBurgerMcDoButton = new JButton("Cheesy Burger 150");
        cheesyBurgerMcDoButton.setBounds(220, 740, 200, 30);
        
        friesButton = new JButton("Fries 70");
        friesButton.setBounds(430, 170, 200, 30);
        
        hashBrownsButton = new JButton("Hash Browns 80");
        hashBrownsButton.setBounds(430, 370, 200, 30);
        
        images.bigMacImg.setBounds(10, 0, 200, 200);
        images.burgerMcDoImg.setBounds(10, 200, 200, 200);
        images.cheeseBurgerDeluxeImg.setBounds(10, 400, 200, 200);
        images.cheeseBurgerImg.setBounds(10, 600, 200, 200);
        images.mcCrispyChickenSandwichImg.setBounds(220, 0, 200, 200);
        images.mcChickenSandwichImg.setBounds(220, 200, 200, 200);
        images.quarterPounderImg.setBounds(220, 400, 200, 200);
        images.cheesyBurgerMcDoImg.setBounds(220, 600, 200, 200);
        images.friesImg.setBounds(430, 0, 200, 200);
        images.hashBrownsImg.setBounds(430, 200, 200, 200);
        
        allBurgersButtons = new JButton[10];
        allBurgersButtons[0] = bigMacButton;
        allBurgersButtons[1] = burgerMcDoButton;
        allBurgersButtons[2] = cheeseBurgerDeluxeButton;
        allBurgersButtons[3] = cheeseBurgerButton;
        allBurgersButtons[4] = mcCrispyChickenSandwichButton;
        allBurgersButtons[5] = mcChickenSandwichButton;
        allBurgersButtons[6] = quarterPounderButton;
        allBurgersButtons[7] = cheesyBurgerMcDoButton;
        allBurgersButtons[8] = friesButton;
        allBurgersButtons[9] = hashBrownsButton;

        for (int i = 0; i < allBurgersButtons.length; i++) {
            allBurgersButtons[i].setBackground(new Color(255,199, 44));
            allBurgersButtons[i].setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 20));
            allBurgersButtons[i].setFocusable(false);
            allBurgersButtons[i].setHorizontalAlignment(JButton.CENTER);
            allBurgersButtons[i].addActionListener(this);
            allBurgersButtons[i].setForeground(Color.BLACK);
        }
        
        this.add(bigMacButton);
        this.add(burgerMcDoButton);
        this.add(cheeseBurgerDeluxeButton);
        this.add(cheeseBurgerButton);
        this.add(mcCrispyChickenSandwichButton);
        this.add(mcChickenSandwichButton);
        this.add(quarterPounderButton);
        this.add(cheesyBurgerMcDoButton);
        this.add(friesButton);
        this.add(hashBrownsButton);
        
        this.add(images.bigMacImg);
        this.add(images.burgerMcDoImg);
        this.add(images.cheeseBurgerDeluxeImg);
        this.add(images.cheeseBurgerImg);
        this.add(images.mcCrispyChickenSandwichImg);
        this.add(images.mcChickenSandwichImg);
        this.add(images.quarterPounderImg);
        this.add(images.cheesyBurgerMcDoImg);
        this.add(images.friesImg);
        this.add(images.hashBrownsImg);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (CheckoutPanel.beginOrder == true) {
            if (e.getSource() == bigMacButton) {
                CheckoutPanel.receipt.append("+ Big Mac 120\n");
                bigMacQuantity += 1;
                CheckoutPanel.total += 120;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == burgerMcDoButton) {
                CheckoutPanel.receipt.append("+ Burger McDo 100 \n");
                burgerMcDoQuantity += 1;
                CheckoutPanel.total += 100;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == cheeseBurgerDeluxeButton) {
                CheckoutPanel.receipt.append("+ Cheese Deluxe 150\n");
                cheeseBurgerDeluxeQuantity += 1;
                CheckoutPanel.total += 150;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == cheeseBurgerButton) {
                CheckoutPanel.receipt.append("+ Cheeseburger 135\n");
                cheeseBurgerQuantity += 1;
                CheckoutPanel.total += 135;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == mcCrispyChickenSandwichButton) {
                CheckoutPanel.receipt.append("+ Crispy Chicken 200\n");
                mcCrispyChickenSandwichQuantity += 1;
                CheckoutPanel.total += 200;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == mcChickenSandwichButton) {
                CheckoutPanel.receipt.append("+ McSandwich 170\n");
                mcChickenSandwichQuantity += 1;
                CheckoutPanel.total += 170;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == quarterPounderButton) {
                CheckoutPanel.receipt.append("+ Quarter Pounder 225\n");
                quarterPounderQuantity += 1;
                CheckoutPanel.total += 225;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == cheesyBurgerMcDoButton) {
                CheckoutPanel.receipt.append("+ Cheesy Burger 150\n");
                cheesyBurgerMcDoQuantity += 1;
                CheckoutPanel.total += 150;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == friesButton) {
                CheckoutPanel.receipt.append("+ Fries 70\n");
                friesQuantity += 1;
                CheckoutPanel.total += 70;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == hashBrownsButton) {
                CheckoutPanel.receipt.append("+ Hash Browns 80\n");
                hashBrownsQuantity += 1;
                CheckoutPanel.total += 80;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
        }
    }
}
