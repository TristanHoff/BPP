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
        }
    }
    
    
}
