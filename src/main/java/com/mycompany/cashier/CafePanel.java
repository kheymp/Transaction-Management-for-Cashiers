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
public class CafePanel extends JPanel implements ActionListener {
    Images images = new Images();
    JButton[] allCafeButtons;
    JButton mcCafeAmericanoButton, mcCafeCappuccinoButton, mcCafeEspressoButton, mcCafeLatteButton, mcCafeMacchiatoButton,
            mcCafeHotChocolateButton, mcCafeIcedMochaButton, mcCafeIcedAmericanoButton, doubleChocoFrappeButton, mcCafeCaramelFrappeButton,
            mcCafeMochaFrappeButton, mcCafeLatteFrappeButton, mcCafeStrawberryFrappeButton;
    
    static int mcCafeAmericanoQuantity = 0, mcCafeCappuccinoQuantity = 0, mcCafeEspressoQuantity = 0, mcCafeLatteQuantity = 0, mcCafeMacchiatoQuantity = 0,
            mcCafeHotChocolateQuantity = 0, mcCafeIcedMochaQuantity = 0, mcCafeIcedAmericanoQuantity = 0, doubleChocoFrappeQuantity = 0, mcCafeCaramelFrappeQuantity = 0,
            mcCafeMochaFrappeQuantity = 0, mcCafeLatteFrappeQuantity = 0, mcCafeStrawberryFrappeQuantity = 0;
    
    static int mcCafeAmericanoPrice = 85, mcCafeCappuccinoPrice = 90, mcCafeEspressoPrice = 115, mcCafeLattePrice = 125, mcCafeMacchiatoPrice = 125,
            mcCafeHotChocolatePrice = 155, mcCafeIcedMochaPrice = 80, mcCafeIcedAmericanoPrice = 95, doubleChocoFrappePrice = 120, mcCafeCaramelFrappePrice = 120,
            mcCafeMochaFrappePrice = 120, mcCafeLatteFrappePrice = 125, mcCafeStrawberryFrappePrice = 120;
    
    CafePanel() {
        this.setBounds(210, 0, 850, 768);
        this.setBackground(new Color(218, 21, 48));
        this.setLayout(null);
        this.setVisible(false);
        
        mcCafeAmericanoButton = new JButton("Americano 85");
        mcCafeAmericanoButton.setBounds(10, 170, 200, 30);
        
        mcCafeCappuccinoButton = new JButton("Cappuccino 90");
        mcCafeCappuccinoButton.setBounds(10, 370, 200, 30);
        
        mcCafeEspressoButton = new JButton("Espresso 115");
        mcCafeEspressoButton.setBounds(10, 570, 200, 30);
        
        mcCafeLatteButton = new JButton("Latte 125");
        mcCafeLatteButton.setBounds(10, 740, 200, 30);
        
        mcCafeMacchiatoButton = new JButton("Macchiato 125");
        mcCafeMacchiatoButton.setBounds(220, 170, 200, 30);
        
        mcCafeHotChocolateButton = new JButton("Hot Chocolate 155");
        mcCafeHotChocolateButton.setBounds(220, 370, 200, 30);
        
        mcCafeIcedMochaButton = new JButton("Iced Mocha 80");
        mcCafeIcedMochaButton.setBounds(220, 570, 200, 30);
        
        mcCafeIcedAmericanoButton = new JButton("Iced Americano 95");
        mcCafeIcedAmericanoButton.setBounds(220, 740, 200, 30);
        
        doubleChocoFrappeButton = new JButton("Choco Frappe 120");
        doubleChocoFrappeButton.setBounds(430, 170, 200, 30);
        
        mcCafeCaramelFrappeButton = new JButton("Caramel Frappe 120");
        mcCafeCaramelFrappeButton.setBounds(430, 370, 200, 30);
        
        mcCafeMochaFrappeButton = new JButton("Mocha Frappe 120");
        mcCafeMochaFrappeButton.setBounds(430, 570, 200, 30);
        
        mcCafeLatteFrappeButton = new JButton("Latte Frappe 125");
        mcCafeLatteFrappeButton.setBounds(430, 740, 200, 30);
        
        mcCafeStrawberryFrappeButton = new JButton("Berry Frappe 120");
        mcCafeStrawberryFrappeButton.setBounds(640, 170, 200, 30);
        
        images.mcCafeAmericanoImg.setBounds(10, 0, 200, 200);
        images.mcCafeCapuccinoImg.setBounds(10, 200, 200, 200);
        images.mcCafeEspressoImg.setBounds(10, 400, 200, 200);
        images.mcCafeLatteImg.setBounds(10, 600, 200, 200);
        images.mcCafeMacchiatoImg.setBounds(220, 0, 200, 200);
        images.mcCafeHotChocolateImg.setBounds(220, 200, 200, 200);
        images.mcCafeIcedMochaImg.setBounds(220, 400, 200, 200);
        images.mcCafeIcedAmericanoImg.setBounds(220, 600, 200, 200);
        images.doubleChocoFrappeImg.setBounds(430, 0, 200, 200);
        images.mcCafeCaramelFrappeImg.setBounds(430, 200, 200, 200);
        images.mcCafeMochaFrappeImg.setBounds(430, 400, 200, 200);
        images.mcCafeLatteFrappeImg.setBounds(430, 600, 200, 200);
        images.mcCafeStrawberryFrappeImg.setBounds(640, 0, 200, 200);
        
        allCafeButtons = new JButton[13];
        allCafeButtons[0] = mcCafeAmericanoButton;
        allCafeButtons[1] = mcCafeCappuccinoButton;
        allCafeButtons[2] = mcCafeEspressoButton;
        allCafeButtons[3] = mcCafeLatteButton;
        allCafeButtons[4] = mcCafeMacchiatoButton;
        allCafeButtons[5] = mcCafeHotChocolateButton;
        allCafeButtons[6] = mcCafeIcedMochaButton;
        allCafeButtons[7] = mcCafeIcedAmericanoButton;
        allCafeButtons[8] = doubleChocoFrappeButton;
        allCafeButtons[9] = mcCafeCaramelFrappeButton;
        allCafeButtons[10] = mcCafeMochaFrappeButton;
        allCafeButtons[11] = mcCafeLatteFrappeButton;
        allCafeButtons[12] = mcCafeStrawberryFrappeButton;
        
        for (int i = 0; i < allCafeButtons.length; i++) {
            allCafeButtons[i].setBackground(new Color(255,199, 44));
            allCafeButtons[i].setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 20));
            allCafeButtons[i].setForeground(Color.BLACK);
            allCafeButtons[i].setFocusable(false);
            allCafeButtons[i].setHorizontalAlignment(JButton.CENTER);
            allCafeButtons[i].addActionListener(this);
        }
        
        this.add(mcCafeAmericanoButton);
        this.add(mcCafeCappuccinoButton);
        this.add(mcCafeEspressoButton);
        this.add(mcCafeLatteButton);
        this.add(mcCafeMacchiatoButton);
        this.add(mcCafeHotChocolateButton);
        this.add(mcCafeIcedMochaButton);
        this.add(mcCafeIcedAmericanoButton);
        this.add(doubleChocoFrappeButton);
        this.add(mcCafeCaramelFrappeButton);
        this.add(mcCafeMochaFrappeButton);
        this.add(mcCafeLatteFrappeButton);
        this.add(mcCafeStrawberryFrappeButton);
        
        this.add(images.mcCafeAmericanoImg);
        this.add(images.mcCafeCapuccinoImg);
        this.add(images.mcCafeEspressoImg);
        this.add(images.mcCafeLatteImg);
        this.add(images.mcCafeMacchiatoImg);
        this.add(images.mcCafeHotChocolateImg);
        this.add(images.mcCafeIcedMochaImg);
        this.add(images.mcCafeIcedAmericanoImg);
        this.add(images.doubleChocoFrappeImg);
        this.add(images.mcCafeCaramelFrappeImg);
        this.add(images.mcCafeMochaFrappeImg);
        this.add(images.mcCafeLatteFrappeImg);
        this.add(images.mcCafeStrawberryFrappeImg);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (CheckoutPanel.beginOrder == true) {
            if (e.getSource() == mcCafeAmericanoButton) {
                CheckoutPanel.receipt.append("+ McCafe Americano 85\n");
                mcCafeAmericanoQuantity += 1;
                CheckoutPanel.total += 85;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == mcCafeCappuccinoButton) {
                CheckoutPanel.receipt.append("+ McCafe Cappuccino 90\n");
                mcCafeCappuccinoQuantity += 1;
                CheckoutPanel.total += 90;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == mcCafeEspressoButton) {
                CheckoutPanel.receipt.append("+ McCafe Espresso 115\n");
                mcCafeEspressoQuantity += 1;
                CheckoutPanel.total += 115;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == mcCafeLatteButton) {
                CheckoutPanel.receipt.append("+ McCafe Latte 125\n");
                mcCafeLatteQuantity += 1;
                CheckoutPanel.total += 125;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == mcCafeMacchiatoButton) {
                CheckoutPanel.receipt.append("+ McCafe Macchiato 125\n");
                mcCafeMacchiatoQuantity += 1;
                CheckoutPanel.total += 125;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == mcCafeHotChocolateButton) {
                CheckoutPanel.receipt.append("+ McCafe Hot Chocolate 155\n");
                mcCafeHotChocolateQuantity += 1;
                CheckoutPanel.total += 155;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == mcCafeIcedMochaButton) {
                CheckoutPanel.receipt.append("+ McCafe Iced Mocha 80\n");
                mcCafeIcedMochaQuantity += 1;
                CheckoutPanel.total += 80;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == mcCafeIcedAmericanoButton) {
                CheckoutPanel.receipt.append("+ McCafe Iced Americano 95\n");
                mcCafeIcedAmericanoQuantity += 1;
                CheckoutPanel.total += 95;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == doubleChocoFrappeButton) {
                CheckoutPanel.receipt.append("+ Choco Frappe 120\n");
                doubleChocoFrappeQuantity += 1;
                CheckoutPanel.total += 120;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == mcCafeCaramelFrappeButton) {
                CheckoutPanel.receipt.append("+ Caramel Frappe 120\n");
                mcCafeCaramelFrappeQuantity += 1;
                CheckoutPanel.total += 120;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == mcCafeMochaFrappeButton) {
                CheckoutPanel.receipt.append("+ Mocha Frappe 120\n");
                mcCafeMochaFrappeQuantity += 1;
                CheckoutPanel.total += 120;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == mcCafeLatteFrappeButton) {
                CheckoutPanel.receipt.append("+ Latte Frappe 125\n");
                mcCafeLatteFrappeQuantity += 1;
                CheckoutPanel.total += 125;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == mcCafeStrawberryFrappeButton) {
                CheckoutPanel.receipt.append("+ Berry Frappe 120\n");
                mcCafeStrawberryFrappeQuantity += 1;
                CheckoutPanel.total += 120;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
        }
    }
}
