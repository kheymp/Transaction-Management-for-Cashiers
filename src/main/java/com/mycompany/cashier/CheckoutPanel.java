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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Kheymp
 */
public class CheckoutPanel extends JPanel implements ActionListener {
    static JTextArea receipt;
    JScrollPane scrollPane;
    static JTextField totalText, totalField, paymentText, paymentField;
    static JButton logoutButton;
    JButton orderButton, clearButton, newOrderButton, payButton;
    
    static boolean beginOrder = false;
    static int orderNumber = 0;
    static int total = 0;
    static int cash = 0;
    CheckoutPanel() {
        totalText = new JTextField("Total:");
        totalText.setBounds(10, 370, 130, 30);
        totalText.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 20));
        totalText.setForeground(Color.BLACK);
        totalText.setOpaque(false);
        totalText.setEditable(false);
        totalText.setBorder(BorderFactory.createEmptyBorder());
        totalText.setHorizontalAlignment(JTextField.RIGHT);
        
        paymentText = new JTextField("Cash:");
        paymentText.setBounds(10, 410, 130, 30);
        paymentText.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 20));
        paymentText.setForeground(Color.BLACK);
        paymentText.setOpaque(false);
        paymentText.setEditable(false);
        paymentText.setBorder(BorderFactory.createEmptyBorder());
        paymentText.setHorizontalAlignment(JTextField.RIGHT);
        
        paymentField = new JTextField("0");
        paymentField.setBounds(140, 410, 130, 30);
        paymentField.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 20));
        paymentField.setForeground(Color.BLACK);
        paymentField.setEditable(false);
        
        totalField = new JTextField();
        totalField.setBounds(140, 370, 130, 30);
        totalField.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 20));
        totalField.setForeground(Color.BLACK);
        totalField.setEditable(false);
        
        orderButton = new JButton("ORDER");
        orderButton.setFocusable(false);
        orderButton.setBounds(10, 450, 130, 30);
        orderButton.setFocusable(false);
        orderButton.setBackground(Color.GREEN);
        orderButton.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 20));
        orderButton.setForeground(Color.BLACK);
        orderButton.addActionListener(this);
        
        clearButton = new JButton("VOID");
        clearButton.setFocusable(false);
        clearButton.setBounds(10, 490, 130, 30);
        clearButton.setFocusable(false);
        clearButton.setBackground(Color.WHITE);
        clearButton.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 20));
        clearButton.setForeground(Color.BLACK);
        clearButton.addActionListener(this);
        
        newOrderButton = new JButton("NEW ORDER");
        newOrderButton.setFocusable(false);
        newOrderButton.setBounds(10, 530, 130, 30);
        newOrderButton.setFocusable(false);
        newOrderButton.setBackground(Color.CYAN);
        newOrderButton.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 20));
        newOrderButton.setForeground(Color.BLACK);
        newOrderButton.addActionListener(this);
        
        logoutButton = new JButton("Log Out");
        logoutButton.setFocusable(false);
        logoutButton.setBounds(10, 610, 130, 30);
        logoutButton.setFocusable(false);
        logoutButton.setBackground(new Color(218, 21, 48));
        logoutButton.setForeground(new Color(255,199, 44));
        logoutButton.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 20));
        logoutButton.setVisible(false);
        logoutButton.addActionListener(this);
        
        receipt = new JTextArea();
        //receipt.setBounds(10, 10, 260, 350);
        receipt.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 20));
        receipt.setForeground(Color.BLACK);
        receipt.setEditable(false);
        
        scrollPane = new JScrollPane(receipt);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(10, 10, 260, 350);
        
        this.setBounds(1070, 0, 330, 768);
        this.setBackground(new Color(255,199, 44));
        this.add(scrollPane);
        //this.add(receipt);
        this.add(orderButton);
        this.add(clearButton);
        this.add(newOrderButton);
        this.add(logoutButton);
        this.add(totalText);
        this.add(totalField);
        this.add(paymentText);
        this.add(paymentField);
        //this.add(payButton);
        this.setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (WelcomePanel.signedIn == false) {
            if (e.getSource() == newOrderButton || e.getSource() == orderButton || e.getSource() == clearButton) {
                receipt.setForeground(Color.red);
                receipt.append("PLEASE LOG IN FIRST.\n");
            }
        }
        
        if (WelcomePanel.signedIn == true) {
            if (e.getSource() == newOrderButton) {
                receipt.setText("");
                beginOrder = true;
                orderNumber += 1;
                receipt.append("ORDER #" + orderNumber + "\n");
                paymentField.setEditable(true);
                receipt.setForeground(Color.black);
                paymentField.setForeground(Color.black);
                resetQuantity();
                paymentField.setText("0");
                totalField.setText("0");
                total = 0;
            }
            //hashBrownsQuantity = 0;
            if (e.getSource() == orderButton && orderNumber > 0 && beginOrder == true) {
                receipt.setText("");
                receipt.append("ORDER #" + orderNumber + "\n");
                cash = Integer.parseInt(paymentField.getText());
                
                if (BurgersPanel.bigMacQuantity > 0) {
                    receipt.append(BurgersPanel.bigMacQuantity + " Big Mac " + (BurgersPanel.bigMacQuantity * BurgersPanel.bigMacPrice) + "\n");
                }
                
                if (BurgersPanel.burgerMcDoQuantity > 0) {
                    receipt.append(BurgersPanel.burgerMcDoQuantity + " Burger McDo " + (BurgersPanel.burgerMcDoQuantity * BurgersPanel.burgerMcDoPrice) + "\n");
                }
                
                if (BurgersPanel.cheeseBurgerDeluxeQuantity > 0) {
                    receipt.append(BurgersPanel.cheeseBurgerDeluxeQuantity + " Cheese Deluxe " + (BurgersPanel.cheeseBurgerDeluxeQuantity * BurgersPanel.cheeseBurgerDeluxePrice) + "\n");
                }
                
                if (BurgersPanel.cheeseBurgerQuantity > 0) {
                    receipt.append(BurgersPanel.cheeseBurgerQuantity + " Cheeseburger " + (BurgersPanel.cheeseBurgerQuantity * BurgersPanel.cheeseBurgerPrice) + "\n");
                }
                
                if (BurgersPanel.mcCrispyChickenSandwichQuantity > 0) {
                    receipt.append(BurgersPanel.mcCrispyChickenSandwichQuantity + " Crispy Chicken " + (BurgersPanel.mcCrispyChickenSandwichQuantity * BurgersPanel.mcCrispyChickenSandwichPrice) + "\n");
                }
                
                if (BurgersPanel.mcChickenSandwichQuantity > 0) {
                    receipt.append(BurgersPanel.mcChickenSandwichQuantity + " McSandwich " + (BurgersPanel.mcChickenSandwichQuantity * BurgersPanel.mcChickenSandwichPrice) + "\n");
                }
                
                if (BurgersPanel.quarterPounderQuantity > 0) {
                    receipt.append(BurgersPanel.quarterPounderQuantity + " Quarter Pounder " + (BurgersPanel.quarterPounderQuantity * BurgersPanel.quarterPounderPrice) + "\n");
                }
                
                if (BurgersPanel.cheesyBurgerMcDoQuantity > 0) {
                    receipt.append(BurgersPanel.cheesyBurgerMcDoQuantity + " Cheesy Burger " + (BurgersPanel.cheesyBurgerMcDoQuantity * BurgersPanel.cheesyBurgerMcDoPrice) + "\n");
                }
                
                if (BurgersPanel.friesQuantity > 0) {
                    receipt.append(BurgersPanel.friesQuantity + " Fries " + (BurgersPanel.friesQuantity * BurgersPanel.friesPrice) + "\n");
                }
                
                if (BurgersPanel.hashBrownsQuantity > 0) {
                    receipt.append(BurgersPanel.hashBrownsQuantity + " Hash Browns " + (BurgersPanel.hashBrownsQuantity * BurgersPanel.hashBrownsPrice) + "\n");
                }
                
                if (PlattersPanel.chickenSpaghettiQuantity > 0) {
                    receipt.append(PlattersPanel.chickenSpaghettiQuantity + " McSpaghetti " + (PlattersPanel.chickenSpaghettiQuantity * PlattersPanel.chickenSpaghettiPrice) + "\n");
                }
                
                if (PlattersPanel.twoChickenRiceQuantity > 0) {
                    receipt.append(PlattersPanel.twoChickenRiceQuantity + " Two Chicken Rice " + (PlattersPanel.twoChickenRiceQuantity * PlattersPanel.twoChickenRicePrice) + "\n");
                }
                
                if (PlattersPanel.oneChickenRiceQuantity > 0) {
                    receipt.append(PlattersPanel.oneChickenRiceQuantity + " One Chicken Rice " + (PlattersPanel.oneChickenRiceQuantity * PlattersPanel.oneChickenRicePrice) + "\n");
                }
                
                if (PlattersPanel.chickenFilletQuantity > 0) {
                    receipt.append(PlattersPanel.chickenFilletQuantity + " Chicken Fillet " + (PlattersPanel.chickenFilletQuantity * PlattersPanel.chickenFilletPrice) + "\n");
                }
                
                if (PlattersPanel.eggdesalQuantity > 0) {
                    receipt.append(PlattersPanel.eggdesalQuantity + " Eggdesal " + (PlattersPanel.eggdesalQuantity * PlattersPanel.eggdesalPrice) + "\n");
                }
                
                if (PlattersPanel.mcMuffinQuantity > 0) {
                    receipt.append(PlattersPanel.mcMuffinQuantity + " McSauage " + (PlattersPanel.mcMuffinQuantity * PlattersPanel.mcMuffinPrice) + "\n");
                }
                
                if (PlattersPanel.twoHotCakeQuantity > 0) {
                    receipt.append(PlattersPanel.twoHotCakeQuantity + " Two Hot Cake " + (PlattersPanel.twoHotCakeQuantity * PlattersPanel.twoHotCakePrice) + "\n");
                }
                
                if (PlattersPanel.sausagePlatterQuantity > 0) {
                    receipt.append(PlattersPanel.sausagePlatterQuantity + " Sausage Platter " + (PlattersPanel.sausagePlatterQuantity * PlattersPanel.sausagePlatterPrice) + "\n");
                }
                
                if (PlattersPanel.eggMcMuffinQuantity > 0) {
                    receipt.append(PlattersPanel.eggMcMuffinQuantity + " Egg McMuffin " + (PlattersPanel.eggMcMuffinQuantity * PlattersPanel.eggMcMuffinPrice) + "\n");
                }
                
                if (PlattersPanel.threeHotCakeQuantity > 0) {
                    receipt.append(PlattersPanel.threeHotCakeQuantity + " Three Hot Cake " + (PlattersPanel.threeHotCakeQuantity * PlattersPanel.threeHotCakePrice) + "\n");
                }
                
                if (DessertsPanel.orangeJuiceQuantity > 0) {
                    receipt.append(DessertsPanel.orangeJuiceQuantity + " Orange Juice " + (DessertsPanel.orangeJuiceQuantity * DessertsPanel.orangeJuicePrice) + "\n");
                }
                
                if (DessertsPanel.pineappleJuiceQuantity > 0) {
                    receipt.append(DessertsPanel.pineappleJuiceQuantity + " Pineapple Juice " + (DessertsPanel.pineappleJuiceQuantity * DessertsPanel.pineappleJuicePrice) + "\n");
                }
                
                if (DessertsPanel.mcFlurryOreoQuantity > 0) {
                    receipt.append(DessertsPanel.mcFlurryOreoQuantity + " McFlurry Oreo " + (DessertsPanel.mcFlurryOreoQuantity * DessertsPanel.mcFlurryOreoPrice) + "\n");
                }
                
                if (DessertsPanel.ubeMcDipQuantity > 0) {
                    receipt.append(DessertsPanel.ubeMcDipQuantity + " Ube McDip " + (DessertsPanel.ubeMcDipQuantity * DessertsPanel.ubeMcDipPrice) + "\n");
                }
                
                if (DessertsPanel.strawberryMcDipQuantity > 0) {
                    receipt.append(DessertsPanel.strawberryMcDipQuantity + " Strawberry McDip " + (DessertsPanel.strawberryMcDipQuantity * DessertsPanel.strawberryMcDipPrice) + "\n");
                }
                
                if (DessertsPanel.chocoMcDipQuantity > 0) {
                    receipt.append(DessertsPanel.chocoMcDipQuantity + " Choco McDip " + (DessertsPanel.chocoMcDipQuantity * DessertsPanel.chocoMcDipPrice) + "\n");
                }
                
                if (DessertsPanel.vanillaSundaeQuantity > 0) {
                    receipt.append(DessertsPanel.vanillaSundaeQuantity + " Vanilla Sundae " + (DessertsPanel.vanillaSundaeQuantity * DessertsPanel.vanillaSundaePrice) + "\n");
                }
                
                if (DessertsPanel.hotFudgeSundaeQuantity > 0) {
                    receipt.append(DessertsPanel.hotFudgeSundaeQuantity + " Hot Fudge Sundae " + (DessertsPanel.hotFudgeSundaeQuantity * DessertsPanel.hotFudgeSundaePrice) + "\n");
                }
                
                if (DessertsPanel.applePieQuantity > 0) {
                    receipt.append(DessertsPanel.applePieQuantity + " Apple Pie " + (DessertsPanel.applePieQuantity * DessertsPanel.applePiePrice) + "\n");
                }
                
                if (DessertsPanel.cokeMcFloatQuantity > 0) {
                    receipt.append(DessertsPanel.cokeMcFloatQuantity + " Coke McFloat " + (DessertsPanel.cokeMcFloatQuantity * DessertsPanel.cokeMcFloatPrice) + "\n");
                }
                
                if (DessertsPanel.premiumRoastQuantity > 0) {
                    receipt.append(DessertsPanel.premiumRoastQuantity + " Premium Roast " + (DessertsPanel.premiumRoastQuantity * DessertsPanel.premiumRoastPrice) + "\n");
                }
                
                if (DessertsPanel.caramelSundaeQuantity > 0) {
                    receipt.append(DessertsPanel.caramelSundaeQuantity + " Caramel Sundae " + (DessertsPanel.caramelSundaeQuantity * DessertsPanel.caramelSundaePrice) + "\n");
                }
                
                if (CafePanel.mcCafeAmericanoQuantity > 0) {
                    receipt.append(CafePanel.mcCafeAmericanoQuantity + " McCafe Americano " + (CafePanel.mcCafeAmericanoQuantity * CafePanel.mcCafeAmericanoPrice) + "\n");
                }
                
                if (CafePanel.mcCafeCappuccinoQuantity > 0) {
                    receipt.append(CafePanel.mcCafeCappuccinoQuantity + " McCafe Cappuccino " + (CafePanel.mcCafeCappuccinoQuantity * CafePanel.mcCafeCappuccinoPrice) + "\n");
                }
                
                if (CafePanel.mcCafeEspressoQuantity > 0) {
                    receipt.append(CafePanel.mcCafeEspressoQuantity + " McCafe Espresso " + (CafePanel.mcCafeEspressoQuantity * CafePanel.mcCafeEspressoPrice) + "\n");
                }
                
                if (CafePanel.mcCafeLatteQuantity > 0) {
                    receipt.append(CafePanel.mcCafeLatteQuantity + " McCafe Latte " + (CafePanel.mcCafeLatteQuantity * CafePanel.mcCafeLattePrice) + "\n");
                }
                
                if (CafePanel.mcCafeMacchiatoQuantity > 0) {
                    receipt.append(CafePanel.mcCafeMacchiatoQuantity + " McCafe Macchiato " + (CafePanel.mcCafeMacchiatoQuantity * CafePanel.mcCafeMacchiatoPrice) + "\n");
                }
                
                if (CafePanel.mcCafeHotChocolateQuantity > 0) {
                    receipt.append(CafePanel.mcCafeHotChocolateQuantity + " McCafe Hot Chocolate " + (CafePanel.mcCafeHotChocolateQuantity * CafePanel.mcCafeHotChocolatePrice) + "\n");
                }
                
                if (CafePanel.mcCafeIcedMochaQuantity > 0) {
                    receipt.append(CafePanel.mcCafeIcedMochaQuantity + " McCafe Iced Mocha " + (CafePanel.mcCafeIcedMochaQuantity * CafePanel.mcCafeIcedMochaPrice) + "\n");
                }
                
                if (CafePanel.mcCafeIcedAmericanoQuantity > 0) {
                    receipt.append(CafePanel.mcCafeIcedAmericanoQuantity + " McCafe Iced Americano " + (CafePanel.mcCafeIcedAmericanoQuantity * CafePanel.mcCafeIcedAmericanoPrice) + "\n");
                }
                
                if (CafePanel.doubleChocoFrappeQuantity > 0) {
                    receipt.append(CafePanel.doubleChocoFrappeQuantity + " Choco Frappe " + (CafePanel.doubleChocoFrappeQuantity * CafePanel.doubleChocoFrappePrice) + "\n");
                }
                
                if (CafePanel.mcCafeCaramelFrappeQuantity > 0) {
                    receipt.append(CafePanel.mcCafeCaramelFrappeQuantity + " Caramel Frappe " + (CafePanel.mcCafeCaramelFrappeQuantity * CafePanel.mcCafeCaramelFrappePrice) + "\n");
                }
                
                if (CafePanel.mcCafeMochaFrappeQuantity > 0) {
                    receipt.append(CafePanel.mcCafeMochaFrappeQuantity + " Mocha Frappe " + (CafePanel.mcCafeMochaFrappeQuantity * CafePanel.mcCafeMochaFrappePrice) + "\n");
                }
                
                if (CafePanel.mcCafeLatteFrappeQuantity > 0) {
                    receipt.append(CafePanel.mcCafeLatteFrappeQuantity + " Latte Frappe " + (CafePanel.mcCafeLatteFrappeQuantity * CafePanel.mcCafeLatteFrappePrice) + "\n");
                }
                
                if (CafePanel.mcCafeStrawberryFrappeQuantity > 0) {
                    receipt.append(CafePanel.mcCafeStrawberryFrappeQuantity + " Berry Frappe " + (CafePanel.mcCafeStrawberryFrappeQuantity * CafePanel.mcCafeStrawberryFrappePrice) + "\n");
                }
                
                if (cash > total || cash == total && orderNumber > 0) {
                    beginOrder = false;
                    receipt.append("\nTOTAL:\t" + total + "\n");
                    receipt.append("CHANGE:\t" + (cash - total) + "\n");
                    receipt.append("CASHIER:\t" + WelcomePanel.userName.toUpperCase());
                    receipt.setForeground(Color.black);
                    paymentField.setForeground(Color.green);
                    resetQuantity();
                }
                
                if (cash < total && orderNumber > 0) {
                    //beginOrder = false;
                    receipt.setText("ORDER #" + orderNumber + "\n");
                    receipt.append("ENTER RIGHT AMOUNT.\n");
                    receipt.setForeground(Color.red);
                    paymentField.setForeground(Color.red);
                }
            }
            
            if (e.getSource() == clearButton && orderNumber > 0) {
                receipt.setText("");
                receipt.append("ORDER #" + orderNumber + "\n");
                receipt.setForeground(Color.black);
                beginOrder = true;
                paymentField.setForeground(Color.black);
                resetQuantity();
                paymentField.setText("0");
                totalField.setText("0");
                total = 0;
            }
            
            if (e.getSource() == logoutButton) {
                WelcomePanel.signedIn = false;
                WelcomePanel.userName = "";
                WelcomePanel.enterNameField.setText("");
                
                receipt.setText("");
                beginOrder = false;
                orderNumber = 0;
                paymentField.setEditable(false);
                logoutButton.setVisible(false);
                receipt.setForeground(Color.black);
                paymentField.setForeground(Color.black);
                resetQuantity();
                paymentField.setText("0");
                totalField.setText("0");
                total = 0;
                
                CategoryPanel.burgersAndFries.setBackground(new Color(255,199, 44));
                CategoryPanel.burgersAndFries.setForeground(Color.BLACK);
                
                CategoryPanel.chickenAndPlatters.setBackground(new Color(255,199, 44));
                CategoryPanel.chickenAndPlatters.setForeground(Color.BLACK);
                
                CategoryPanel.drinksAndDesserts.setBackground(new Color(255,199, 44));
                CategoryPanel.drinksAndDesserts.setForeground(Color.BLACK);
                
                CategoryPanel.mcCafe.setBackground(new Color(255,199, 44));
                CategoryPanel.mcCafe.setForeground(Color.BLACK);
                
                Cashier.burgersPanel.setVisible(false);
                Cashier.dessertsPanel.setVisible(false);
                Cashier.plattersPanel.setVisible(false);
                Cashier.cafePanel.setVisible(false);
                Cashier.basePanel.setVisible(false);
                Cashier.animationPanel.setVisible(true);
                Cashier.welcomePanel.setVisible(true);
            }
        }
    }
    
    private void resetQuantity() {
        BurgersPanel.bigMacQuantity = 0; BurgersPanel.burgerMcDoQuantity = 0; BurgersPanel.cheeseBurgerDeluxeQuantity = 0; BurgersPanel.cheeseBurgerQuantity = 0; BurgersPanel.mcCrispyChickenSandwichQuantity = 0; 
        BurgersPanel.mcChickenSandwichQuantity = 0; BurgersPanel.quarterPounderQuantity = 0; BurgersPanel.cheesyBurgerMcDoQuantity = 0; BurgersPanel.friesQuantity = 0; BurgersPanel.hashBrownsQuantity = 0;
        
        PlattersPanel.chickenSpaghettiQuantity = 0; PlattersPanel.twoChickenRiceQuantity = 0; PlattersPanel.oneChickenRiceQuantity = 0; PlattersPanel.chickenFilletQuantity = 0; PlattersPanel.eggdesalQuantity = 0;
        PlattersPanel.mcMuffinQuantity = 0; PlattersPanel.twoHotCakeQuantity = 0; PlattersPanel.sausagePlatterQuantity = 0; PlattersPanel.eggMcMuffinQuantity = 0; PlattersPanel.threeHotCakeQuantity = 0;
        
        DessertsPanel.pineappleJuiceQuantity = 0; DessertsPanel.orangeJuiceQuantity = 0; DessertsPanel.mcFlurryOreoQuantity = 0; DessertsPanel.ubeMcDipQuantity = 0; DessertsPanel.strawberryMcDipQuantity = 0; 
        DessertsPanel.chocoMcDipQuantity = 0; DessertsPanel.vanillaSundaeQuantity = 0; DessertsPanel.hotFudgeSundaeQuantity = 0; DessertsPanel.applePieQuantity = 0; DessertsPanel.cokeMcFloatQuantity = 0;
        DessertsPanel.premiumRoastQuantity = 0; DessertsPanel.caramelSundaeQuantity = 0;
        
        CafePanel.mcCafeAmericanoQuantity = 0; CafePanel.mcCafeCappuccinoQuantity = 0; CafePanel.mcCafeEspressoQuantity = 0; CafePanel.mcCafeLatteQuantity = 0; CafePanel.mcCafeMacchiatoQuantity = 0;
        CafePanel.mcCafeHotChocolateQuantity = 0; CafePanel.mcCafeIcedMochaQuantity = 0; CafePanel.mcCafeIcedAmericanoQuantity = 0; CafePanel.doubleChocoFrappeQuantity = 0; CafePanel.mcCafeCaramelFrappeQuantity = 0;
        CafePanel.mcCafeMochaFrappeQuantity = 0; CafePanel.mcCafeLatteFrappeQuantity = 0; CafePanel.mcCafeStrawberryFrappeQuantity = 0;
        
        //cash = 0;
    }
}
