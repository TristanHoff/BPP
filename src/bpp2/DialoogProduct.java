/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpp2;

import java.awt.event.*;
import static java.lang.Integer.parseInt;
import javax.swing.*;


/**
 *
 * @author Tristan
 */
public class DialoogProduct extends JDialog implements ActionListener{

    private JLabel jlProductNaam, jlProductGrootte, jlProduct, jlGrootte;
    private JTextField jfInvoerGrootte, jfInvoerNaam;
    private JButton jbVoegToe;
    private String naam;
    private int grootte;
    private boolean voegToe;
    
    public  DialoogProduct(JFrame frame) {
        super(frame, true);
        
        jlProductNaam = new JLabel("Productnaam:");
        jlProductGrootte = new JLabel("Grootte:");
        jbVoegToe = new JButton("Voeg Toe");
        jfInvoerGrootte = new JTextField(5);
        jfInvoerNaam = new JTextField(5);
        jlProduct = new JLabel(naam);
        jlGrootte = new JLabel(Integer.toString(grootte));
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
    if (e.getSource() == jbVoegToe) {
        this.grootte = parseInt(jfInvoerGrootte.getText());
        this.naam = (jfInvoerNaam.getText());
        
        this.voegToe = true;
    }
    }
    public int getGrootte(){
        return grootte;
    }
    
    public String getNaam(){
        return naam;
    }
    
    public boolean getVoegToe(){
        return voegToe;
    }
}
