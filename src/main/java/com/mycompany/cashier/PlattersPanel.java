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
public class PlattersPanel extends JPanel implements ActionListener {
    Images images = new Images();
    JButton[] allPlattersButtons;
    JButton chickenSpaghettiButton, twoChickenRiceButton, oneChickenRiceButton, chickenFilletButton, eggdesalButton, mcMuffinButton,
            twoHotCakeButton, sausagePlatterButton, eggMcMuffinButton, threeHotCakeButton;
    
    static int chickenSpaghettiQuantity = 0, twoChickenRiceQuantity = 0, oneChickenRiceQuantity = 0, chickenFilletQuantity = 0, eggdesalQuantity = 0, 
            mcMuffinQuantity = 0, twoHotCakeQuantity = 0, sausagePlatterQuantity = 0, eggMcMuffinQuantity = 0, threeHotCakeQuantity = 0;
    
    static int chickenSpaghettiPrice = 230, twoChickenRicePrice = 250, oneChickenRicePrice = 225, chickenFilletPrice = 215, eggdesalPrice = 155, 
            mcMuffinPrice = 120, twoHotCakePrice = 160, sausagePlatterPrice = 190, eggMcMuffinPrice = 190, threeHotCakePrice = 240;
    
    PlattersPanel() {
        this.setBounds(210, 0, 850, 768);
        this.setBackground(new Color(218, 21, 48));
        this.setLayout(null);
        this.setVisible(false);
        
        chickenSpaghettiButton = new JButton("McSpaghetti 230");
        chickenSpaghettiButton.setBounds(10, 170, 200, 30);
        
        twoChickenRiceButton = new JButton("2 Chicken Rice 250");
        twoChickenRiceButton.setBounds(10, 370, 200, 30);
        
        oneChickenRiceButton = new JButton("1 Chicken Rice 225");
        oneChickenRiceButton.setBounds(10, 570, 200, 30);
        
        chickenFilletButton = new JButton("Chicken Fillet 215");
        chickenFilletButton.setBounds(10, 740, 200, 30);
        
        eggdesalButton = new JButton("Eggdesal 155");
        eggdesalButton.setBounds(220, 170, 200, 30);
        
        mcMuffinButton = new JButton("McSausage 120");
        mcMuffinButton.setBounds(220, 370, 200, 30);
        
        twoHotCakeButton = new JButton("2 Hotcakes 160");
        twoHotCakeButton.setBounds(220, 570, 200, 30);
        
        sausagePlatterButton = new JButton("Sausage Platter 190");
        sausagePlatterButton.setBounds(220, 740, 200, 30);
        
        eggMcMuffinButton = new JButton("Egg McMuffin 190");
        eggMcMuffinButton.setBounds(430, 170, 200, 30);
        
        threeHotCakeButton = new JButton("3 Hotcakes 240");
        threeHotCakeButton.setBounds(430, 370, 200, 30);
        
        images.chickenSpaghettiImg.setBounds(10, 0, 200, 200);
        images.twoChickenRiceImg.setBounds(10, 200, 200, 200);
        images.oneChickenRiceImg.setBounds(10, 400, 200, 200);
        images.chickenFilletImg.setBounds(10, 600, 200, 200);
        images.eggdesalImg.setBounds(220, 0, 200, 200);
        images.mcMuffinImg.setBounds(220, 200, 200, 200);
        images.twoHotCakeImg.setBounds(220, 400, 200, 200);
        images.sausagePlatterImg.setBounds(220, 600, 200, 200);
        images.eggMcMuffinImg.setBounds(430, 0, 200, 200);
        images.threeHotCakeImg.setBounds(430, 200, 200, 200);
        
        allPlattersButtons = new JButton[10];
        allPlattersButtons[0] = chickenSpaghettiButton;
        allPlattersButtons[1] = twoChickenRiceButton;
        allPlattersButtons[2] = oneChickenRiceButton;
        allPlattersButtons[3] = chickenFilletButton;
        allPlattersButtons[4] = eggdesalButton;
        allPlattersButtons[5] = mcMuffinButton;
        allPlattersButtons[6] = twoHotCakeButton;
        allPlattersButtons[7] = sausagePlatterButton;
        allPlattersButtons[8] = eggMcMuffinButton;
        allPlattersButtons[9] = threeHotCakeButton;
        
        for (int i = 0; i < allPlattersButtons.length; i++) {
            allPlattersButtons[i].setBackground(new Color(255,199, 44));
            allPlattersButtons[i].setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 20));
            allPlattersButtons[i].setForeground(Color.BLACK);
            allPlattersButtons[i].setFocusable(false);
            allPlattersButtons[i].setHorizontalAlignment(JButton.CENTER);
            allPlattersButtons[i].addActionListener(this);
        }
        
        this.add(chickenSpaghettiButton); 
        this.add(twoChickenRiceButton); 
        this.add(oneChickenRiceButton);
        this.add(chickenFilletButton); 
        this.add(eggdesalButton);
        this.add(mcMuffinButton);
        this.add(twoHotCakeButton);
        this.add(sausagePlatterButton);
        this.add(eggMcMuffinButton);
        this.add(threeHotCakeButton);
        
        this.add(images.chickenSpaghettiImg);
        this.add(images.twoChickenRiceImg);
        this.add(images.oneChickenRiceImg);
        this.add(images.chickenFilletImg);
        this.add(images.eggdesalImg);
        this.add(images.mcMuffinImg);
        this.add(images.twoHotCakeImg);
        this.add(images.sausagePlatterImg);
        this.add(images.eggMcMuffinImg);
        this.add(images.threeHotCakeImg);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (CheckoutPanel.beginOrder == true) {
            if (e.getSource() == chickenSpaghettiButton) {
                CheckoutPanel.receipt.append("+ McSpaghetti 230\n");
                chickenSpaghettiQuantity += 1;
                CheckoutPanel.total += 230;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == twoChickenRiceButton) {
                CheckoutPanel.receipt.append("+ Two Chicken Rice 250\n");
                twoChickenRiceQuantity += 1;
                CheckoutPanel.total += 250;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == oneChickenRiceButton) {
                CheckoutPanel.receipt.append("+ One Chicken Rice 225\n");
                oneChickenRiceQuantity += 1;
                CheckoutPanel.total += 225;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == chickenFilletButton) {
                CheckoutPanel.receipt.append("+ Chicken Fillet 215\n");
                oneChickenRiceQuantity += 1;
                CheckoutPanel.total += 215;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == eggdesalButton) {
                CheckoutPanel.receipt.append("+ Eggdesal 155\n");
                eggdesalQuantity += 1;
                CheckoutPanel.total += 155;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == mcMuffinButton) {
                CheckoutPanel.receipt.append("+ McSausage 120\n");
                mcMuffinQuantity += 1;
                CheckoutPanel.total += 120;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == twoHotCakeButton) {
                CheckoutPanel.receipt.append("+ Two Hot Cake 160\n");
                twoHotCakeQuantity += 1;
                CheckoutPanel.total += 160;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == sausagePlatterButton) {
                CheckoutPanel.receipt.append("+ Sausage Platter 190\n");
                sausagePlatterQuantity += 1;
                CheckoutPanel.total += 190;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == eggMcMuffinButton) {
                CheckoutPanel.receipt.append("+ Egg McMuffic 190\n");
                eggMcMuffinQuantity += 1;
                CheckoutPanel.total += 190;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
            
            if (e.getSource() == threeHotCakeButton) {
                CheckoutPanel.receipt.append("+ Three Hot Cake 240\n");
                threeHotCakeQuantity += 1;
                CheckoutPanel.total += 240;
                CheckoutPanel.totalField.setText(String.valueOf(CheckoutPanel.total));
            }
        }
    }
}
