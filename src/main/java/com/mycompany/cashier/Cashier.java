/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cashier;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Kheymp
 */
public class Cashier extends JFrame {
    static WelcomePanel welcomePanel = new WelcomePanel();
    static AnimationPanel animationPanel = new AnimationPanel();
    static BurgersPanel burgersPanel = new BurgersPanel();
    static PlattersPanel plattersPanel = new PlattersPanel();
    static DessertsPanel dessertsPanel = new DessertsPanel();
    static CafePanel cafePanel = new CafePanel();
    static BasePanel basePanel = new BasePanel();
    Images images = new Images();
    
    Cashier() {
        this.setSize(1366, 805);
        this.setTitle("Welcome to McDonald's");
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setIconImage(images.mcDonaldsLogo.getImage());
        this.getContentPane().setBackground(Color.WHITE);
        
        this.add(new CategoryPanel());
        this.add(new CheckoutPanel());
        this.add(animationPanel);
        this.add(welcomePanel);
        this.add(burgersPanel);
        this.add(plattersPanel);
        this.add(dessertsPanel);
        this.add(cafePanel);
        this.add(basePanel);
        
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new Cashier();
    }
}
