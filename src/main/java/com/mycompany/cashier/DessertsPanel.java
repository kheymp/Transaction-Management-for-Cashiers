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
public class DessertsPanel extends JPanel implements ActionListener {
    Images images = new Images();
    JButton[] allDessertsButtons;
    
    JButton pineappleJuiceButton, orangeJuiceButton, mcFlurryOreoButton, ubeMcDipButton, strawberryMcDipButton, chocoMcDipButton,
            vanillaSundaeButton, hotFudgeSundaeButton, applePieButton, cokeMcFloatButton, premiumRoastButton, caramelSundaeButton;
    
    static int pineappleJuiceQuantity = 0, orangeJuiceQuantity = 0, mcFlurryOreoQuantity = 0, ubeMcDipQuantity = 0, strawberryMcDipQuantity = 0, 
            chocoMcDipQuantity = 0, vanillaSundaeQuantity = 0, hotFudgeSundaeQuantity = 0, applePieQuantity = 0, cokeMcFloatQuantity = 0,
            premiumRoastQuantity = 0, caramelSundaeQuantity = 0;
    
    static int pineappleJuicePrice = 80, orangeJuicePrice = 80, mcFlurryOreoPrice = 120, ubeMcDipPrice = 135, strawberryMcDipPrice = 135, 
            chocoMcDipPrice = 135, vanillaSundaePrice = 100, hotFudgeSundaePrice = 100, applePiePrice = 170, cokeMcFloatPrice = 125,
            premiumRoastPrice = 80, caramelSundaePrice = 100;
    
    DessertsPanel() {
        this.setBounds(210, 0, 850, 768);
        this.setBackground(new Color(218, 21, 48));
        this.setLayout(null);
        this.setVisible(false);
        
        pineappleJuiceButton = new JButton("Pineapple Juice 80");
        pineappleJuiceButton.setBounds(10, 170, 200, 30);
        
        orangeJuiceButton = new JButton("Orange Juice 80");
        orangeJuiceButton.setBounds(10, 370, 200, 30);
        
        mcFlurryOreoButton = new JButton("McFlurry Oreo 120");
        mcFlurryOreoButton.setBounds(10, 570, 200, 30);
        
        ubeMcDipButton = new JButton("Ube McDip 135");
        ubeMcDipButton.setBounds(10, 740, 200, 30);
        
        strawberryMcDipButton = new JButton("Strawberry 135");
        strawberryMcDipButton.setBounds(220, 170, 200, 30);
        
        chocoMcDipButton = new JButton("Choco McDip 135");
        chocoMcDipButton.setBounds(220, 370, 200, 30);
        
        vanillaSundaeButton = new JButton("Vanilla Sundae 100");
        vanillaSundaeButton.setBounds(220, 570, 200, 30);
        
        hotFudgeSundaeButton = new JButton("Hot Fudge 100");
        hotFudgeSundaeButton.setBounds(220, 740, 200, 30);
        
        applePieButton = new JButton("Apple Pie 170");
        applePieButton.setBounds(430, 170, 200, 30);
        
        cokeMcFloatButton = new JButton("Coke McFloat 125");
        cokeMcFloatButton.setBounds(430, 370, 200, 30);
        
        premiumRoastButton = new JButton("Premium Roast 80");
        premiumRoastButton.setBounds(430, 570, 200, 30);
        
        caramelSundaeButton = new JButton("Caramel Sundae 100");
        caramelSundaeButton.setBounds(430, 740, 200, 30);
        
        images.pineappleJuiceImg.setBounds(10, 0, 200, 200);
        images.orangeJuiceImg.setBounds(10, 200, 200, 200);
        images.mcFlurryOreoImg.setBounds(10, 400, 200, 200);
        images.ubeMcDipImg.setBounds(10, 600, 200, 200);
        images.strawberryMcDipImg.setBounds(220, 0, 200, 200);
        images.chocoMcDipImg.setBounds(220, 200, 200, 200);
        images.vanillaSundaeImg.setBounds(220, 400, 200, 200);
        images.hotFudgeSundaeImg.setBounds(220, 600, 200, 200);
        images.applePieImg.setBounds(430, 0, 200, 200);
        images.cokeMcFloatImg.setBounds(430, 200, 200, 200);
        images.premiumRoastImg.setBounds(430, 400, 200, 200);
        images.caramelSundaeImg.setBounds(430, 600, 200, 200);
        
        allDessertsButtons = new JButton[12];
        allDessertsButtons[0] = pineappleJuiceButton;
        allDessertsButtons[1] = orangeJuiceButton;
        allDessertsButtons[2] = mcFlurryOreoButton;
        allDessertsButtons[3] = ubeMcDipButton;
        allDessertsButtons[4] = strawberryMcDipButton;
        allDessertsButtons[5] = chocoMcDipButton;
        allDessertsButtons[6] = vanillaSundaeButton;
        allDessertsButtons[7] = hotFudgeSundaeButton;
        allDessertsButtons[8] = applePieButton;
        allDessertsButtons[9] = cokeMcFloatButton;
        allDessertsButtons[10] = premiumRoastButton;
        allDessertsButtons[11] = caramelSundaeButton;

        for (int i = 0; i < allDessertsButtons.length; i++) {
            allDessertsButtons[i].setBackground(new Color(255,199, 44));
            allDessertsButtons[i].setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 20));
            allDessertsButtons[i].setForeground(Color.BLACK);
            allDessertsButtons[i].setFocusable(false);
            allDessertsButtons[i].setHorizontalAlignment(JButton.CENTER);
            allDessertsButtons[i].addActionListener(this);
        }
        
        this.add(pineappleJuiceButton);
        this.add(orangeJuiceButton);
        this.add(mcFlurryOreoButton);
        this.add(ubeMcDipButton);
        this.add(strawberryMcDipButton);
        this.add(chocoMcDipButton);
        this.add(vanillaSundaeButton);
        this.add(hotFudgeSundaeButton);
        this.add(applePieButton);
        this.add(cokeMcFloatButton);
        this.add(premiumRoastButton);
        this.add(caramelSundaeButton);
        
        this.add(images.pineappleJuiceImg);
        this.add(images.orangeJuiceImg);
        this.add(images.mcFlurryOreoImg);
        this.add(images.ubeMcDipImg);
        this.add(images.strawberryMcDipImg);
        this.add(images.chocoMcDipImg);
        this.add(images.vanillaSundaeImg);
        this.add(images.hotFudgeSundaeImg);
        this.add(images.applePieImg);
        this.add(images.cokeMcFloatImg);
        this.add(images.premiumRoastImg);
        this.add(images.caramelSundaeImg);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (CheckoutPanel.beginOrder == true) {
            if (e.getSource() == pineappleJuiceButton) {
                CheckoutPanel.receipt.append("+ Pineapple Juice 80\n");
                pineappleJuiceQuantity += 1;
                CheckoutPanel.total += 80;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == orangeJuiceButton) {
                CheckoutPanel.receipt.append("+ Orange Juice 80\n");
                orangeJuiceQuantity += 1;
                CheckoutPanel.total += 80;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == mcFlurryOreoButton) {
                CheckoutPanel.receipt.append("+ McFlurry Oreo 120\n");
                mcFlurryOreoQuantity += 1;
                CheckoutPanel.total += 120;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == ubeMcDipButton) {
                CheckoutPanel.receipt.append("+ Ube McDip 135\n");
                ubeMcDipQuantity += 1;
                CheckoutPanel.total += 135;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == strawberryMcDipButton) {
                CheckoutPanel.receipt.append("+ Strawberry McDip 135\n");
                strawberryMcDipQuantity += 1;
                CheckoutPanel.total += 135;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == chocoMcDipButton) {
                CheckoutPanel.receipt.append("+ Choco McDip 135\n");
                chocoMcDipQuantity += 1;
                CheckoutPanel.total += 135;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == vanillaSundaeButton) {
                CheckoutPanel.receipt.append("+ Vanilla Sundae 100\n");
                vanillaSundaeQuantity += 1;
                CheckoutPanel.total += 100;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == hotFudgeSundaeButton) {
                CheckoutPanel.receipt.append("+ Hot Fudge Sundae 100\n");
                hotFudgeSundaeQuantity += 1;
                CheckoutPanel.total += 100;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == applePieButton) {
                CheckoutPanel.receipt.append("+ Apple Pie 170\n");
                applePieQuantity += 1;
                CheckoutPanel.total += 170;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == cokeMcFloatButton) {
                CheckoutPanel.receipt.append("+ Coke McFloat 125\n");
                cokeMcFloatQuantity += 1;
                CheckoutPanel.total += 125;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == premiumRoastButton) {
                CheckoutPanel.receipt.append("+ Premium Roast 80\n");
                premiumRoastQuantity += 1;
                CheckoutPanel.total += 80;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == caramelSundaeButton) {
                CheckoutPanel.receipt.append("+ Caramel Sundae 100\n");
                caramelSundaeQuantity += 1;
                CheckoutPanel.total += 100;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
        }
    }
}
