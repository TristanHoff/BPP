/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpp2;

import java.awt.*;
import static java.awt.BorderLayout.EAST;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tristan
 */
public class Scherm extends JFrame implements ActionListener{
    
    private JButton jbStart, jbStop, jbProduct, jbDoos;
    private JLabel  jlBFAantalDozen, jlBFTijd, jlVerdeling;
    private JPanel  jp1, jp2, jp3, jp4, jp5, jp6;
    private boolean start = false;
    private ArrayList<Product> producten;
    private int maxRuimte;
    
    
    public Scherm() {
        setTitle("Bin Packing Problem");
        setSize(1360, 750);
        setLayout(new BorderLayout());
        
        //Buttons
        jbStart     = new JButton("Start proces");
        jbStop      = new JButton("Stop proces");
        jbProduct   = new JButton("Producten");
        jbDoos      = new JButton("Doos");
        
        //Labels
        jlBFAantalDozen = new JLabel("Aantal dozen: ");
        jlBFTijd        = new JLabel("Tijd: ");
        
        jlVerdeling   = new JLabel("Optimale verdeling");
        
        
        //Panels
        JPanel jp = new JPanel(new BorderLayout());
        JPanel jp1 = new JPanel(new BorderLayout());
        JPanel jp2 = new JPanel(new FlowLayout());
        JPanel jp3 = new JPanel(new FlowLayout());
        JPanel jp4 = new JPanel(new FlowLayout());
        JPanel jp5 = new JPanel(new FlowLayout());
        
        JPanel jp6 = new JPanel(new FlowLayout());
        Box box = Box.createVerticalBox();
        box.add(Box.createVerticalStrut(50));
        box.add(jbStart);
        box.add(Box.createVerticalStrut(50));
        box.add(jbStop);
        box.add(Box.createVerticalStrut(50));
        box.add(jbProduct);
        box.add(Box.createVerticalStrut(50));
        box.add(jbDoos);
        box.add(Box.createVerticalStrut(50));
        jp6.add(box);
        
        jp1.setPreferredSize(new Dimension(400,695));
       
        add(jp6, BorderLayout.LINE_END);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbStart) {
            start = true;
        }
        
        if (e.getSource() == jbStop){
            start = false;
        }
        
        if (e.getSource() == jbProduct){
            //code voor Product knop
        }
        
        if (e.getSource() == jbDoos){
            DialoogDoos dialoog = new DialoogDoos(this);
            dialoog.setVisible(true);
            
            if(dialoog.getIsOK()) {
                this.maxRuimte = dialoog.getDoosGrootte();
            }
        }
        repaint();
    }
    
    public ArrayList getProducten(){
        return producten;
    }
    
    public boolean getStart() {
        return start;
    } 
    
    public int getMaxRuimte() {
        return maxRuimte;
    }
}
