/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpp2;

/**
 *
 * @author Tristan
 */

import javax.swing.*;
import java.awt.*;
import java.util.List;


public class BruteForcePanel extends JPanel {
    private Scherm scherm;
    private long time;
    
    BruteForcePanel(Scherm scherm) {
        this.scherm = scherm;
        this.setPreferredSize(new Dimension(450, 300));
    }
    
    //Tekent vierkant
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        setBackground(Color.LIGHT_GRAY);
        g.setColor(Color.BLACK);
        g.drawRect(0,0,(int)getSize().getWidth()-1,(int)getSize().getHeight()-1);
        
        if (scherm.getStart()) {
            long startTime = System.currentTimeMillis();
            
            BruteForce bruteforce = new BruteForce(scherm.getProducten(), scherm.getMaxRuimte());
            bruteforce.getResult();
            List<Doos> dozenBrute = bruteforce.getDozen();
            
            time = System.currentTimeMillis() - startTime;
            System.out.println("Brute Force: " + time + " milliseconden");
            
            int yDoos = 30;
            int xDoos = 60;
            int yProduct = 30;
            int xProduct = 300;
            
            for (int i = 1; i <=bruteforce.getBesteOplossing(); i++) {
                g.setColor(Color.BLACK);
                int x = 15;
                int y = 280;
                g.drawRect(xDoos, x + 1, yDoos, y);
                g.drawString("Doos: " + i, yDoos + 5, y +35);
                yDoos = yDoos + (xDoos + 25);
            }
            
            for (Doos doos : dozenBrute) {
            for (int i = 0; i < doos.getProducten().size(); i++) {
                g.setColor(Color.BLACK);
                g.drawRect(yProduct, xProduct+1, xDoos, 0 - (15 * doos.getProducten().get(i) +1));
                g.setColor(Color.BLUE);
                g.fillRect(yProduct + 1, xProduct + 1, yDoos - 1, 0 - (15*doos.getProducten().get(i) + 1));
                g.drawString("" + doos.getProducten().get(i), yProduct + 18, xProduct + 8 + (15 * doos.getProducten().get(i) / -2));
                
                xProduct = xProduct - (15 * doos.getProducten().get(i));
            }
            yProduct = yProduct + (xDoos +25);
            xProduct = 300;
            }
        }
        g.setColor(Color.BLACK);
        g.drawString("Brute Force", 5, 15);
    }
    
    long getTime() {
        return time;
    }
    
}
