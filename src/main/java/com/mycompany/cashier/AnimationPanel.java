/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cashier;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Kheymp
 */
public class AnimationPanel extends JPanel implements ActionListener {
    Timer timer;
    int xVelocity = 1;
    int yVelocity = 1;
    int x = 0;
    int y = 0;
    AnimationPanel() {
        this.setBounds(440, 170, 612, 669);
        this.setBackground(new Color(218, 21, 48));
        this.setLayout(null);
        timer = new Timer(10, this);
        timer.start();
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(Images.modifiedRonaldMcDonald, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x == 612 - Images.modifiedRonaldMcDonald.getWidth(null) || x < 0) {
            xVelocity = xVelocity * -1;
        }
        x = x + xVelocity;
        repaint();
    }
}
