/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpp2;

import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author Tristan
 */
public class DialoogDoos extends JDialog implements ActionListener{

    private JLabel jlHuidigeGrootte;
    private JButton jbOK;
    private JTextField jfInvoer;
    
    public  DialoogDoos(JFrame frame) {
        super(frame, true);
        
        jlHuidigeGrootte = new JLabel("Huidige grootte");
        jbOK = new JButton("OK");
        jfInvoer = new JTextField(10);
        
        
    } 

    
    
    
   
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
    //code   
    } 
}
