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
public class DialoogProduct extends JDialog implements ActionListener{

    private JLabel jlProductNaam, jlProductGrootte, jlProduct, jlGrootte;
    
    public  DialoogProduct(JFrame frame) {
        super(frame, true);
        
        jlProductNaam = new JLabel("Productnaam:");
        jlProductGrootte = new JLabel("Grootte:");
        jlProduct = new JLabel();//p.getNaam()
        jlGrootte = new JLabel();//p.getGrootte()
    } 

    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
}
